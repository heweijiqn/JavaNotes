/**
 * @auther ��ΰ��
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
        }//�����Է���10���ӵ�


            switch (getDirect()) {
                case 0: //����
                    shot = new Shot(getX() + 20, getY(), 0, 3);
                    break;
                case 1: //����
                    shot = new Shot(getX() + 60, getY() + 20, 1, 3);
                    break;
                case 2: //����
                    shot = new Shot(getX() + 20, getY() + 60, 2, 3);
                    break;
                case 3: //����
                    shot = new Shot(getX(), getY() + 20, 3, 3);
                    break;
            }


        shots.add(shot);
        new Thread(shot).start();
    }

}

