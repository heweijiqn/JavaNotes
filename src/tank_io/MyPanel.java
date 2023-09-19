/**
 * @auther 何伟健
 * @date 2022/8/2 9:56
 */


package tank_io;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.File;
import java.util.Vector;

@SuppressWarnings({"all"})

public class MyPanel extends JPanel implements KeyListener,Runnable {
    Hero hero = null;

    Vector<EnemyTank> enemyTanks = new Vector<EnemyTank>();

    EnemyTank enemyTank = null;

    int enemyTankCount = 3;
    Vector<Bomb> bombs = new Vector<Bomb>();

    Bomb bomb = null;


    Vector<Node> nodes = new Vector<>();

    Node node = null;


    Image image1 = null;
    Image image2 = null;
    Image image3 = null;

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        showInfo(g);

        g.fillRect(0, 0, 1000, 750);//填充矩形，默认黑色

        if (hero != null && hero.isLive) {
            //画出自己坦克-封装方法
            drawTank(hero.getX(), hero.getY(), g, hero.getDirect(), 0);
        }
        for(int i = 0; i < hero.shots.size(); i++) {
            Shot shot = hero.shots.get(i);
            if (shot != null && shot.isLive) {
                g.draw3DRect(shot.x, shot.y, 1, 1, false);

            } else {//如果该shot对象已经无效 ,就从shots集合中拿掉
                hero.shots.remove(shot);
            }
        }
        for(int j = 0;j<enemyTanks.size(); j++){
           enemyTank = enemyTanks.get(j);
            if(enemyTank.isLive && enemyTank!=null){
                drawTank(enemyTank.getX(), enemyTank.getY(), g, enemyTank.getDirect(), 1);
                for (int i = 0; i <enemyTank.shots.size(); i++) {
                    Shot shot = enemyTank.shots.get(i);
                    if (shot != null && shot.isLive) {
                        g.draw3DRect(shot.x, shot.y, 1, 1, false);

                    } else {//如果该shot对象已经无效 ,就从shots集合中拿掉
                        enemyTank.shots.remove(shot);
                    }

                }


            }
        }
        //如果bombs 集合中有对象，就画出
        for (int i = 0; i < bombs.size(); i++) {
            //取出炸弹
            Bomb bomb = bombs.get(i);
            //根据当前这个bomb对象的life值去画出对应的图片
            if (bomb.life > 6) {
                g.drawImage(image1, bomb.x, bomb.y, 60, 60, this);
            } else if (bomb.life > 3) {
                g.drawImage(image2, bomb.x, bomb.y, 60, 60, this);
            } else {
                g.drawImage(image3, bomb.x, bomb.y, 60, 60, this);
            }
            //让这个炸弹的生命值减少
            bomb.lifeDown();
            //如果bomb life 为0, 就从bombs 的集合中删除
            if (bomb.life == 0) {
                bombs.remove(bomb);
            }
        }

        image1 = Toolkit.getDefaultToolkit().getImage(Panel.class.getResource("/bomb_1.gif")); //加载图片
        image2 = Toolkit.getDefaultToolkit().getImage(Panel.class.getResource("/bomb_2.gif"));
        image3 = Toolkit.getDefaultToolkit().getImage(Panel.class.getResource("/bomb_3.gif"));

   }


    //编写方法，显示我方击毁敌方坦克的信息
    public void showInfo(Graphics g) {

        //画出玩家的总成绩
        g.setColor(Color.BLACK);
        Font font = new Font("宋体", Font.BOLD, 25);
        g.setFont(font);

        g.drawString("您累积击毁敌方坦克", 1020, 30);
        drawTank(1020, 60, g, 0, 0);//画出一个敌方坦克
        g.setColor(Color.BLACK);//这里需要重新设置成黑色
        g.drawString(Recorder.getAllEnemyTankNum() + "", 1080, 100);

    }
    public MyPanel(String key) {
        //先判断记录的文件是否存在
        //如果存在，就正常执行，如果文件不存在，提示，只能开启新游戏，key = "1"
        File file = new File(Recorder.getRecordFile());
        if (file.exists()) {
            nodes = Recorder.getNodesAndEnemyTankRec();
        } else {
            System.out.println("文件不存在，只能开启新的游戏");
            key = "1";
        }
        Recorder.setEnemyTanks(enemyTanks);

        switch (key) {
            case "1":
                hero = new Hero(500, 100, 5, 0);
                for (int i = 0; i < enemyTankCount; i++) {
                    enemyTank = new EnemyTank((100 * (i + 1)), 0, 3, 2);
                    enemyTank.setEnemyTanks(enemyTanks);
                    new Thread(enemyTank).start();
                    enemyTanks.add(enemyTank);
                }
                break;
            case "2":
                hero = new Hero(500, 100, 5, 0);
                for (int i = 0; i < nodes.size(); i++) {
                    node = nodes.get(i);
                    //创建一个敌人的坦克
                    enemyTank = new EnemyTank(node.getX(), node.getY(),3, node.getDirect());
                    //将enemyTanks 设置给 enemyTank !!!
                    enemyTank.setEnemyTanks(enemyTanks);

                    //启动敌人坦克线程，让他动起来
                    new Thread(enemyTank).start();
                    enemyTanks.add(enemyTank);

                }
                break;
            default:
                System.out.println("没有这个选项");

        }

        //初始化音效对象
        new AePlayWave("src\\111.wav").start();



    }
//画出坦克的方法
    public void drawTank(int x, int y, Graphics g, int direct, int type) {

        //根据不同类型坦克，设置不同颜色
        switch (type) {
            case 0: //敌人的坦克
                g.setColor(Color.cyan);
                break;
            case 1: //我的坦克
                g.setColor(Color.yellow);
                break;
        }

        //根据坦克方向，来绘制对应形状坦克
        //direct 表示方向(0: 向上 1 向右 2 向下 3 向左 )
        switch (direct) {
            case 0: //表示向上
                g.fill3DRect(x, y, 10, 60, false);//画出坦克左边轮子
                g.fill3DRect(x + 30, y, 10, 60, false);//画出坦克右边轮子
                g.fill3DRect(x + 10, y + 10, 20, 40, false);//画出坦克盖子
                g.fillOval(x + 10, y + 20, 20, 20);//画出圆形盖子
                g.drawLine(x + 20, y + 30, x + 20, y);//画出炮筒
                break;
            case 1: //表示向右
                g.fill3DRect(x, y, 60, 10, false);//画出坦克上边轮子
                g.fill3DRect(x, y + 30, 60, 10, false);//画出坦克下边轮子
                g.fill3DRect(x + 10, y + 10, 40, 20, false);//画出坦克盖子
                g.fillOval(x + 20, y + 10, 20, 20);//画出圆形盖子
                g.drawLine(x + 30, y + 20, x + 60, y + 20);//画出炮筒
                break;
            case 2: //表示向下
                g.fill3DRect(x, y, 10, 60, false);//画出坦克左边轮子
                g.fill3DRect(x + 30, y, 10, 60, false);//画出坦克右边轮子
                g.fill3DRect(x + 10, y + 10, 20, 40, false);//画出坦克盖子
                g.fillOval(x + 10, y + 20, 20, 20);//画出圆形盖子
                g.drawLine(x + 20, y + 30, x + 20, y + 60);//画出炮筒
                break;
            case 3: //表示向左
                g.fill3DRect(x, y, 60, 10, false);//画出坦克上边轮子
                g.fill3DRect(x, y + 30, 60, 10, false);//画出坦克下边轮子
                g.fill3DRect(x + 10, y + 10, 40, 20, false);//画出坦克盖子
                g.fillOval(x + 20, y + 10, 20, 20);//画出圆形盖子
                g.drawLine(x + 30, y + 20, x, y + 20);//画出炮筒
                break;
            default:
                System.out.println("暂时没有处理");
        }

    }

    @Override
    public void keyTyped(KeyEvent e) {

    }
    //按键按下的事件 控制坦克的移动
    @Override
    public void keyPressed(KeyEvent e) {
        System.out.println(e.getKeyCode());
        if (e.getKeyCode() == KeyEvent.VK_W) {//按下W键
            //改变坦克的方向
            hero.setDirect(0);//
            //修改坦克的坐标 y -= 1
            if (hero.getY() > 0) {
                hero.move();
            }
        } else if (e.getKeyCode() == KeyEvent.VK_D) {//D键, 向右
            hero.setDirect(1);
            if (hero.getX() + 60 < 1000) {
                hero.move();
            }

        } else if (e.getKeyCode() == KeyEvent.VK_S) {//S键
            hero.setDirect(2);
            if (hero.getY() + 60 < 750) {
                hero.move();
            }
        } else if (e.getKeyCode() == KeyEvent.VK_A) {//A键
            hero.setDirect(3);
            if (hero.getX() > 0) {
                hero.move();
            }
        }
        else if (e.getKeyCode() == KeyEvent.VK_J) {//空格键
            hero.shotEnemyTank();
        }
        repaint();

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
    public void hitTank(Shot s, Tank enemyTank) {  //子弹与坦克碰撞检测
        //判断s 击中坦克
        switch (enemyTank.getDirect()) {
            case 0: //坦克向上
            case 2: //坦克向下
                if (s.x > enemyTank.getX() && s.x < enemyTank.getX() + 40
                        && s.y > enemyTank.getY() && s.y < enemyTank.getY() + 60) {
                    s.isLive = false;
                    enemyTank.isLive = false;
                    //当我的子弹击中敌人坦克后，将enemyTank 从Vector 拿掉
                    enemyTanks.remove(enemyTank);
                    //当我方击毁一个敌人坦克时，就对数据allEnemyTankNum++
                    if (enemyTank instanceof EnemyTank) {
                        Recorder.addAllEnemyTankNum();
                    }
                    //创建Bomb对象，加入到bombs集合
                    bomb = new Bomb(enemyTank.getX(), enemyTank.getY());
                    bombs.add(bomb);
                }
                break;
            case 1: //坦克向右
            case 3: //坦克向左
                if (s.x > enemyTank.getX() && s.x < enemyTank.getX() + 60
                        && s.y > enemyTank.getY() && s.y < enemyTank.getY() + 40) {
                    s.isLive = false;
                    enemyTank.isLive = false;
                    //当我的子弹击中敌人坦克后，将enemyTank 从Vector 拿掉
                    enemyTanks.remove(enemyTank);

                    if (enemyTank instanceof EnemyTank) {
                        Recorder.addAllEnemyTankNum();
                    }
                    //创建Bomb对象，加入到bombs集合
                    bomb = new Bomb(enemyTank.getX(), enemyTank.getY());
                    bombs.add(bomb);
                }
                break;
        }
    }

    //编写方法，判断敌人坦克是否击中我的坦克
    public void hitHero() {  //判断敌人坦克是否击中我的坦克
        //遍历所有的敌人坦克
        for (int i = 0; i < enemyTanks.size(); i++) {
            //取出敌人坦克
            EnemyTank enemyTank = enemyTanks.get(i);
            //遍历enemyTank 对象的所有子弹
            for (int j = 0; j < enemyTank.shots.size(); j++) {
                //取出子弹
                Shot shot = enemyTank.shots.get(j);
                //判断 shot 是否击中我的坦克
                if (hero.isLive && shot.isLive) {
                    hitTank(shot, hero);
                }
            }
        }
    }

    public void hitEnemyTank() {  //敌人坦克与我方坦克碰撞检测

        //遍历我们的子弹
        for (int j = 0; j < hero.shots.size(); j++) {
            Shot shot = hero.shots.get(j);
            //判断是否击中了敌人坦克
            if (shot != null && hero.shot.isLive) {//当我的子弹还存活

                //遍历敌人所有的坦克
                for (int i = 0; i < enemyTanks.size(); i++) {
                    EnemyTank enemyTank = enemyTanks.get(i);
                    hitTank(hero.shot, enemyTank);
                }

            }
        }
    }

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            //判断我的坦克是否击中敌人坦克
            hitEnemyTank();
            //判断敌人坦克是否击中我的坦克
            hitHero();

            this.repaint();
        }
    }
}
