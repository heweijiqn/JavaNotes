package tanke.tang;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Vector;

public class Mypanle extends JPanel implements KeyListener {


    Heor heor = null;
    //EnemyTank�ļ���
    Vector<EnemyTank> enemyTanks = new Vector<>();

    int enemyTankSize = 3;


    public Mypanle() {
        heor = new Heor(100, 100);
        for (int i = 0; i < enemyTankSize; i++) {
            //����һ�����˵�̹��
            EnemyTank enemyTank = new EnemyTank((100 * (i + 1)), 0);
            //���÷���
            enemyTank.setDirect(2);
            //����
            enemyTanks.add(enemyTank);
        }


    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.fillRect(0, 0, 800, 600); //����һ������


        drawTank(heor.getX(), heor.getY(), g, heor.getDirect(), 1);  //����̹��
        //�������˵�̹��, ����Vector
        for (int i = 0; i < enemyTanks.size(); i++) {
            //ȡ��̹��
            EnemyTank enemyTank = enemyTanks.get(i);
            //����̹��

            drawTank(enemyTank.getX(), enemyTank.getY(), g, enemyTank.getDirect(), 0);
        }


    }


    public void drawTank(int x, int y, Graphics g, int direct, int type) {
        //���ݲ�ͬ����̹�ˣ����ò�ͬ��ɫ
        switch (type) {
            case 0: //���ǵ�̹��
                g.setColor(Color.cyan);
                break;
            case 1: //���˵�̹��
                g.setColor(Color.yellow);
                break;
        }
        //���ݲ�ͬ������Ʋ�ͬ��̹��
        switch (direct) {
            case 0: //��
                g.fill3DRect(x, y, 10, 60, false);//����̹���������

                g.fill3DRect(x + 30, y, 10, 60, false);//����̹���ұ�����
                g.fill3DRect(x + 10, y + 10, 20, 40, false);//����̹�˸���
                g.fillOval(x + 10, y + 20, 20, 20);//����Բ�θ���
                g.drawLine(x + 20, y + 30, x + 20, y);//������Ͳ
                break;
            case 1: //��
                g.fill3DRect(x, y, 10, 60, false);//����̹���������
                g.fill3DRect(x + 30, y, 10, 60, false);//����̹���ұ�����
                g.fill3DRect(x + 10, y + 10, 20, 40, false);//����̹�˸���
                g.fillOval(x + 10, y + 20, 20, 20);//����Բ�θ���
                g.drawLine(x + 20, y + 30, x + 20, y + 60);//������Ͳ
                break;
            case 2: //��
                g.fill3DRect(x, y, 60, 10, false);//����̹���ϱ�����
                g.fill3DRect(x, y + 30, 60, 10, false);//����̹���±�����
                g.fill3DRect(x + 10, y + 10, 40, 20, false);//����̹�˸���
                g.fillOval(x + 20, y + 10, 20, 20);//����Բ�θ���
                g.drawLine(x + 30, y + 20, x, y + 20);//������Ͳ
                break;
            case 3: //��
                g.fill3DRect(x, y, 60, 10, false);//����̹���ϱ�����
                g.fill3DRect(x, y + 30, 60, 10, false);//����̹���±�����
                g.fill3DRect(x + 10, y + 10, 40, 20, false);//����̹�˸���
                g.fillOval(x + 20, y + 10, 20, 20);//����Բ�θ���
                g.drawLine(x + 30, y + 20, x + 60, y + 20);//������Ͳ

                break;
            default:
                break;
        }

    }

    //���ַ����ʱ���÷����ͻᴥ��

    @Override
    public void keyTyped(KeyEvent e) {


    }

    //��ĳ�������£��÷����ᴥ��
    @Override
    public void keyPressed(KeyEvent e) {
        int key = e.getKeyCode();
        switch (key) {
            case KeyEvent.VK_W:
                heor.setDirect(0);
                heor.move(0);
                break;
            case KeyEvent.VK_S:
                heor.setDirect(1);
                heor.move(2);
                break;
            case KeyEvent.VK_A:
                heor.setDirect(2);
                heor.move(3);
                break;
            case KeyEvent.VK_D:
                heor.setDirect(3);
                heor.move(1);
                break;
            default:
                System.out.println("��������");
        }
        this.repaint();
    }

    //��ĳ�����ͷ�(�ɿ�)���÷����ᴥ��
    @Override
    public void keyReleased(KeyEvent e) {

    }

}


