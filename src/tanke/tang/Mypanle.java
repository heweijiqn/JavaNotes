package tanke.tang;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Vector;

public class Mypanle extends JPanel implements KeyListener {


    Heor heor = null;
    //EnemyTank的集合
    Vector<EnemyTank> enemyTanks = new Vector<>();

    int enemyTankSize = 3;


    public Mypanle() {
        heor = new Heor(100, 100);
        for (int i = 0; i < enemyTankSize; i++) {
            //创建一个敌人的坦克
            EnemyTank enemyTank = new EnemyTank((100 * (i + 1)), 0);
            //设置方向
            enemyTank.setDirect(2);
            //加入
            enemyTanks.add(enemyTank);
        }


    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.fillRect(0, 0, 800, 600); //绘制一个矩形


        drawTank(heor.getX(), heor.getY(), g, heor.getDirect(), 1);  //绘制坦克
        //画出敌人的坦克, 遍历Vector
        for (int i = 0; i < enemyTanks.size(); i++) {
            //取出坦克
            EnemyTank enemyTank = enemyTanks.get(i);
            //画出坦克

            drawTank(enemyTank.getX(), enemyTank.getY(), g, enemyTank.getDirect(), 0);
        }


    }


    public void drawTank(int x, int y, Graphics g, int direct, int type) {
        //根据不同类型坦克，设置不同颜色
        switch (type) {
            case 0: //我们的坦克
                g.setColor(Color.cyan);
                break;
            case 1: //敌人的坦克
                g.setColor(Color.yellow);
                break;
        }
        //根据不同方向绘制不同的坦克
        switch (direct) {
            case 0: //上
                g.fill3DRect(x, y, 10, 60, false);//画出坦克左边轮子

                g.fill3DRect(x + 30, y, 10, 60, false);//画出坦克右边轮子
                g.fill3DRect(x + 10, y + 10, 20, 40, false);//画出坦克盖子
                g.fillOval(x + 10, y + 20, 20, 20);//画出圆形盖子
                g.drawLine(x + 20, y + 30, x + 20, y);//画出炮筒
                break;
            case 1: //下
                g.fill3DRect(x, y, 10, 60, false);//画出坦克左边轮子
                g.fill3DRect(x + 30, y, 10, 60, false);//画出坦克右边轮子
                g.fill3DRect(x + 10, y + 10, 20, 40, false);//画出坦克盖子
                g.fillOval(x + 10, y + 20, 20, 20);//画出圆形盖子
                g.drawLine(x + 20, y + 30, x + 20, y + 60);//画出炮筒
                break;
            case 2: //左
                g.fill3DRect(x, y, 60, 10, false);//画出坦克上边轮子
                g.fill3DRect(x, y + 30, 60, 10, false);//画出坦克下边轮子
                g.fill3DRect(x + 10, y + 10, 40, 20, false);//画出坦克盖子
                g.fillOval(x + 20, y + 10, 20, 20);//画出圆形盖子
                g.drawLine(x + 30, y + 20, x, y + 20);//画出炮筒
                break;
            case 3: //右
                g.fill3DRect(x, y, 60, 10, false);//画出坦克上边轮子
                g.fill3DRect(x, y + 30, 60, 10, false);//画出坦克下边轮子
                g.fill3DRect(x + 10, y + 10, 40, 20, false);//画出坦克盖子
                g.fillOval(x + 20, y + 10, 20, 20);//画出圆形盖子
                g.drawLine(x + 30, y + 20, x + 60, y + 20);//画出炮筒

                break;
            default:
                break;
        }

    }

    //有字符输出时，该方法就会触发

    @Override
    public void keyTyped(KeyEvent e) {


    }

    //当某个键按下，该方法会触发
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
                System.out.println("按键错误");
        }
        this.repaint();
    }

    //当某个键释放(松开)，该方法会触发
    @Override
    public void keyReleased(KeyEvent e) {

    }

}


