/**
 * @auther 何伟健
 * @date 2022/8/2 9:52
 */


package tank_io;

import java.util.Vector;

public class Hero extends Tank {

    public Hero(int x, int y, int speed, int direct) {
        super(x, y, speed, direct);
    }

    Vector<Shot> shots = new Vector<>();

    Shot shot = null;


    public void shotEnemyTank() {
        if (shots.size() == 10) {
            return;
        }//最多可以发射10颗子弹


            switch (getDirect()) {
                case 0: //向上
                    shot = new Shot(getX() + 20, getY(), 0, 3);
                    break;
                case 1: //向右
                    shot = new Shot(getX() + 60, getY() + 20, 1, 3);
                    break;
                case 2: //向下
                    shot = new Shot(getX() + 20, getY() + 60, 2, 3);
                    break;
                case 3: //向左
                    shot = new Shot(getX(), getY() + 20, 3, 3);
                    break;
            }


        shots.add(shot);
        new Thread(shot).start();
    }

}

