package thread.game;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.File;
import java.util.Vector;



//Ϊ�˼��� �����¼��� ʵ��KeyListener
//Ϊ����Panel ��ͣ���ػ��ӵ�����Ҫ�� MyPanel ʵ��Runnable ,����һ���߳�ʹ��
@SuppressWarnings({"all"})
public class MyPanel extends JPanel implements KeyListener, Runnable {
    //�����ҵ�̹��
    Hero hero = null;
    //�������̹�ˣ����뵽Vector
    Vector<EnemyTank> enemyTanks = new Vector<>();
    //����һ�����Node �����Vector, ���ڻָ�����̹�˵�����ͷ���
    Vector<Node> nodes = new Vector<>();
    //����һ��Vector ,���ڴ��ը��
    //˵�������ӵ�����̹��ʱ������һ��Bomb����bombs
    Vector<Bomb> bombs = new Vector<>();
    int enemyTankSize = 3;

    //��������ը��ͼƬ��������ʾ��ըЧ��
    Image image1 = null;
    Image image2 = null;
    Image image3 = null;

    public MyPanel(String key) {
        //���жϼ�¼���ļ��Ƿ����
        //������ڣ�������ִ�У�����ļ������ڣ���ʾ��ֻ�ܿ�������Ϸ��key = "1"
        File file = new File(Recorder.getRecordFile());
        if (file.exists()) {
            nodes = Recorder.getNodesAndEnemyTankRec();
        } else {
            System.out.println("�ļ������ڣ�ֻ�ܿ����µ���Ϸ");
            key = "1";
        }
        //��MyPanel����� enemyTanks ���ø� Recorder �� enemyTanks
        Recorder.setEnemyTanks(enemyTanks);

        hero = new Hero(500, 100);//��ʼ���Լ�̹��

        switch (key) {
            case "1":
                //��ʼ������̹��
                for (int i = 0; i < enemyTankSize; i++) {
                    //����һ�����˵�̹��
                    EnemyTank enemyTank = new EnemyTank((100 * (i + 1)), 0);
                    //��enemyTanks ���ø� enemyTank !!!
                    enemyTank.setEnemyTanks(enemyTanks);
                    //���÷���
                    enemyTank.setDirect(2);
                    //��������̹���̣߳�����������
                    new Thread(enemyTank).start();
                    //����enemyTank ����һ���ӵ�
                    Shot shot = new Shot(enemyTank.getX() + 20, enemyTank.getY() + 60, enemyTank.getDirect());
                    //����enemyTank��Vector ��Ա
                    enemyTank.shots.add(shot);
                    //���� shot ����
                    new Thread(shot).start();
                    //����
                    enemyTanks.add(enemyTank);
                }
                break;
            case "2": //�����Ͼ���Ϸ
                //��ʼ������̹��
                for (int i = 0; i < nodes.size(); i++) {
                    Node node = nodes.get(i);
                    //����һ�����˵�̹��
                    EnemyTank enemyTank = new EnemyTank(node.getX(), node.getY());
                    //��enemyTanks ���ø� enemyTank !!!
                    enemyTank.setEnemyTanks(enemyTanks);
                    //���÷���
                    enemyTank.setDirect(node.getDirect());
                    //��������̹���̣߳�����������
                    new Thread(enemyTank).start();
                    //����enemyTank ����һ���ӵ�
                    Shot shot = new Shot(enemyTank.getX() + 20, enemyTank.getY() + 60, enemyTank.getDirect());
                    //����enemyTank��Vector ��Ա
                    enemyTank.shots.add(shot);
                    //���� shot ����
                    new Thread(shot).start();
                    //����
                    enemyTanks.add(enemyTank);
                }
                break;
            default:
                System.out.println("�����������...");
        }


        //��ʼ��ͼƬ����
        image1 = Toolkit.getDefaultToolkit().getImage(Panel.class.getResource("/bomb_1.gif"));
        image2 = Toolkit.getDefaultToolkit().getImage(Panel.class.getResource("/bomb_2.gif"));
        image3 = Toolkit.getDefaultToolkit().getImage(Panel.class.getResource("/bomb_3.gif"));

        //�������ָ��������
        new AePlayWave("src\\111.wav").start();

    }

    //��д��������ʾ�ҷ����ٵз�̹�˵���Ϣ
    public void showInfo(Graphics g) {

        //������ҵ��ܳɼ�
        g.setColor(Color.BLACK);
        Font font = new Font("����", Font.BOLD, 25);
        g.setFont(font);

        g.drawString("���ۻ����ٵз�̹��", 1020, 30);
        drawTank(1020, 60, g, 0, 0);//����һ���з�̹��
        g.setColor(Color.BLACK);//������Ҫ�������óɺ�ɫ
        g.drawString(Recorder.getAllEnemyTankNum() + "", 1080, 100);

    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.fillRect(0, 0, 1000, 750);//�����Σ�Ĭ�Ϻ�ɫ
        showInfo(g);
        if (hero != null && hero.isLive) {
            //�����Լ�̹��-��װ����
            drawTank(hero.getX(), hero.getY(), g, hero.getDirect(), 1);
        }

        //����hero������ӵ�
        /*if (hero.shot != null && hero.shot.isLive == true) {
            g.draw3DRect(hero.shot.x, hero.shot.y, 1, 1, false);

        }*/
        //��hero���ӵ����� shots ,����ȡ������
        for(int i = 0; i < hero.shots.size(); i++) {
            Shot shot = hero.shots.get(i);
            if (shot != null && shot.isLive) {
                g.draw3DRect(shot.x, shot.y, 1, 1, false);

            } else {//�����shot�����Ѿ���Ч ,�ʹ�shots�������õ�
                hero.shots.remove(shot);
            }
        }

        //���bombs �������ж��󣬾ͻ���
        for (int i = 0; i < bombs.size(); i++) {
            //ȡ��ը��
            Bomb bomb = bombs.get(i);
            //���ݵ�ǰ���bomb�����lifeֵȥ������Ӧ��ͼƬ
            if (bomb.life > 6) {
                g.drawImage(image1, bomb.x, bomb.y, 60, 60, this);
            } else if (bomb.life > 3) {
                g.drawImage(image2, bomb.x, bomb.y, 60, 60, this);
            } else {
                g.drawImage(image3, bomb.x, bomb.y, 60, 60, this);
            }
            //�����ը��������ֵ����
            bomb.lifeDown();
            //���bomb life Ϊ0, �ʹ�bombs �ļ�����ɾ��
            if (bomb.life == 0) {
                bombs.remove(bomb);
            }
        }

        //�������˵�̹��, ����Vector
        for (int i = 0; i < enemyTanks.size(); i++) {
            //��Vector ȡ��̹��
            EnemyTank enemyTank = enemyTanks.get(i);
            //�жϵ�ǰ̹���Ƿ񻹴��
            if (enemyTank.isLive) {//������̹���Ǵ��ģ��Ż�����̹��
                drawTank(enemyTank.getX(), enemyTank.getY(), g, enemyTank.getDirect(), 0);
                //���� enemyTank �����ӵ�
                for (int j = 0; j < enemyTank.shots.size(); j++) {
                    //ȡ���ӵ�
                    Shot shot = enemyTank.shots.get(j);
                    //����
                    if (shot.isLive) { //isLive == true
                        g.draw3DRect(shot.x, shot.y, 1, 1, false);
                    } else {
                        //��Vector �Ƴ�
                        enemyTank.shots.remove(shot);
                    }
                }
            }
        }


    }

    //��д����������̹��

    /**
     * @param x      ̹�˵����Ͻ�x����
     * @param y      ̹�˵����Ͻ�y����
     * @param g      ����
     * @param direct ̹�˷����������ң�
     * @param type   ̹������
     */
    public void drawTank(int x, int y, Graphics g, int direct, int type) {

        //���ݲ�ͬ����̹�ˣ����ò�ͬ��ɫ
        switch (type) {
            case 0: //���˵�̹��
                g.setColor(Color.cyan);
                break;
            case 1: //�ҵ�̹��
                g.setColor(Color.yellow);
                break;
        }

        //����̹�˷��������ƶ�Ӧ��״̹��
        //direct ��ʾ����(0: ���� 1 ���� 2 ���� 3 ���� )
        //
        switch (direct) {
            case 0: //��ʾ����
                g.fill3DRect(x, y, 10, 60, false);//����̹���������
                g.fill3DRect(x + 30, y, 10, 60, false);//����̹���ұ�����
                g.fill3DRect(x + 10, y + 10, 20, 40, false);//����̹�˸���
                g.fillOval(x + 10, y + 20, 20, 20);//����Բ�θ���
                g.drawLine(x + 20, y + 30, x + 20, y);//������Ͳ
                break;
            case 1: //��ʾ����
                g.fill3DRect(x, y, 60, 10, false);//����̹���ϱ�����
                g.fill3DRect(x, y + 30, 60, 10, false);//����̹���±�����
                g.fill3DRect(x + 10, y + 10, 40, 20, false);//����̹�˸���
                g.fillOval(x + 20, y + 10, 20, 20);//����Բ�θ���
                g.drawLine(x + 30, y + 20, x + 60, y + 20);//������Ͳ
                break;
            case 2: //��ʾ����
                g.fill3DRect(x, y, 10, 60, false);//����̹���������
                g.fill3DRect(x + 30, y, 10, 60, false);//����̹���ұ�����
                g.fill3DRect(x + 10, y + 10, 20, 40, false);//����̹�˸���
                g.fillOval(x + 10, y + 20, 20, 20);//����Բ�θ���
                g.drawLine(x + 20, y + 30, x + 20, y + 60);//������Ͳ
                break;
            case 3: //��ʾ����
                g.fill3DRect(x, y, 60, 10, false);//����̹���ϱ�����
                g.fill3DRect(x, y + 30, 60, 10, false);//����̹���±�����
                g.fill3DRect(x + 10, y + 10, 40, 20, false);//����̹�˸���
                g.fillOval(x + 20, y + 10, 20, 20);//����Բ�θ���
                g.drawLine(x + 30, y + 20, x, y + 20);//������Ͳ
                break;
            default:
                System.out.println("��ʱû�д���");
        }

    }

    //������ǵ�̹�˿��Է������ӵ�
    //���ж��ҷ��ӵ��Ƿ���е���̹��ʱ������Ҫ�����ǵ��ӵ�������
    //���е��ӵ�����ȡ���͵��˵�����̹�ˣ������ж�
    //�Ϻ����Ĳ��ִ���..
    public void hitEnemyTank() {

        //�������ǵ��ӵ�
        for(int j = 0;j < hero.shots.size();j++) {
            Shot shot = hero.shots.get(j);
            //�ж��Ƿ�����˵���̹��
            if (shot != null && hero.shot.isLive) {//���ҵ��ӵ������

                //�����������е�̹��
                for (int i = 0; i < enemyTanks.size(); i++) {
                    EnemyTank enemyTank = enemyTanks.get(i);
                    hitTank(hero.shot, enemyTank);
                }

            }
        }

        //�����ӵ���
//        if (hero.shot != null && hero.shot.isLive) {//���ҵ��ӵ������
//
//            //�����������е�̹��
//            for (int i = 0; i < enemyTanks.size(); i++) {
//                EnemyTank enemyTank = enemyTanks.get(i);
//                hitTank(hero.shot, enemyTank);
//            }
//
//        }

    }

    //��д�������жϵ���̹���Ƿ�����ҵ�̹��
    public void hitHero() {
        //�������еĵ���̹��
        for (int i = 0; i < enemyTanks.size(); i++) {
            //ȡ������̹��
            EnemyTank enemyTank = enemyTanks.get(i);
            //����enemyTank ����������ӵ�
            for (int j = 0; j < enemyTank.shots.size(); j++) {
                //ȡ���ӵ�
                Shot shot = enemyTank.shots.get(j);
                //�ж� shot �Ƿ�����ҵ�̹��
                if (hero.isLive && shot.isLive) {
                    hitTank(shot, hero);
                }
            }
        }
    }


    //��д�������ж��ҷ����ӵ��Ƿ���е���̹��.
    //ʲôʱ���ж� �ҷ����ӵ��Ƿ���е���̹�� ? run����
    //�������ǽ� enemyTank �ĳ� tank����
    public void hitTank(Shot s, Tank enemyTank) {
        //�ж�s ����̹��
        switch (enemyTank.getDirect()) {
            case 0: //̹������
            case 2: //̹������
                if (s.x > enemyTank.getX() && s.x < enemyTank.getX() + 40
                        && s.y > enemyTank.getY() && s.y < enemyTank.getY() + 60) {
                    s.isLive = false;
                    enemyTank.isLive = false;
                    //���ҵ��ӵ����е���̹�˺󣬽�enemyTank ��Vector �õ�
                    enemyTanks.remove(enemyTank);
                    //���ҷ�����һ������̹��ʱ���Ͷ�����allEnemyTankNum++
                    //���, ��Ϊ enemyTank ������ Hero Ҳ������ EnemyTank
                    if (enemyTank instanceof EnemyTank) {
                        Recorder.addAllEnemyTankNum();
                    }
                    //����Bomb���󣬼��뵽bombs����
                    Bomb bomb = new Bomb(enemyTank.getX(), enemyTank.getY());
                    bombs.add(bomb);
                }
                break;
            case 1: //̹������
            case 3: //̹������
                if (s.x > enemyTank.getX() && s.x < enemyTank.getX() + 60
                        && s.y > enemyTank.getY() && s.y < enemyTank.getY() + 40) {
                    s.isLive = false;
                    enemyTank.isLive = false;
                    //���ҵ��ӵ����е���̹�˺󣬽�enemyTank ��Vector �õ�
                    enemyTanks.remove(enemyTank);
                    //���, ��Ϊ enemyTank ������ Hero Ҳ������ EnemyTank
                    if (enemyTank instanceof EnemyTank) {
                        Recorder.addAllEnemyTankNum();
                    }
                    //����Bomb���󣬼��뵽bombs����
                    Bomb bomb = new Bomb(enemyTank.getX(), enemyTank.getY());
                    bombs.add(bomb);
                }
                break;
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    //����wdsa �����µ����
    @Override
    public void keyPressed(KeyEvent e) {
        System.out.println(e.getKeyCode());
        if (e.getKeyCode() == KeyEvent.VK_W) {//����W��
            //�ı�̹�˵ķ���
            hero.setDirect(0);//
            //�޸�̹�˵����� y -= 1
            if (hero.getY() > 0) {
                hero.moveUp();
            }
        } else if (e.getKeyCode() == KeyEvent.VK_D) {//D��, ����
            hero.setDirect(1);
            if (hero.getX() + 60 < 1000) {
                hero.moveRight();
            }

        } else if (e.getKeyCode() == KeyEvent.VK_S) {//S��
            hero.setDirect(2);
            if (hero.getY() + 60 < 750) {
                hero.moveDown();
            }
        } else if (e.getKeyCode() == KeyEvent.VK_A) {//A��
            hero.setDirect(3);
            if (hero.getX() > 0) {
                hero.moveLeft();
            }
        }

        //����û����µ���J,�ͷ���
        if (e.getKeyCode() == KeyEvent.VK_J) {

            //�ж�hero���ӵ��Ƿ�����,����һ���ӵ�
//            if (hero.shot == null || !hero.shot.isLive) {
//                hero.shotEnemyTank();
//            }
            //�������ӵ�
            hero.shotEnemyTank();

        }
        //������ػ�
        this.repaint();

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

    @Override
    public void run() { //ÿ�� 100���룬�ػ�����, ˢ�»�ͼ����, �ӵ����ƶ�

        while (true) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            //�ж��������ӵ�������˵���̹��
            hitEnemyTank();
            //�жϵ���̹���Ƿ��������
            hitHero();
            this.repaint();
        }

    }
}
