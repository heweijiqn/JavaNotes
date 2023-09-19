/**
 * @auther ��ΰ��
 * @date 2022/8/2 9:55
 */


package tank_io;

import java.util.Vector;

public class EnemyTank extends Tank  implements Runnable {
    Vector<Shot> shots = new Vector<>();
    Shot shot = null;
    Vector<EnemyTank> enemyTanks = new Vector<>();

    public Vector<EnemyTank> getEnemyTanks() {
        return enemyTanks;
    }

    public void setEnemyTanks(Vector<EnemyTank> enemyTanks) {  //��mypanel��enemyTanks���ݹ���
        this.enemyTanks = enemyTanks;
    }

    public EnemyTank(int x, int y, int speed, int direct) {
        super(x, y, speed, direct);
    }


    public boolean isTouchEnemyTank() {  //�ж��Ƿ���������̹��  ���������  �ͷ���true

        //�жϵ�ǰ����̹��(this) ����
        switch (this.getDirect()) {
            case 0: //��
                //�õ�ǰ����̹�˺��������еĵ���̹�˱Ƚ�
                for (int i = 0; i < enemyTanks.size(); i++) {
                    //��vector ��ȡ��һ������̹��
                    EnemyTank enemyTank = enemyTanks.get(i);
                    //�����Լ��Ƚ�
                    if (enemyTank != this) {
                        //�������̹������/��

                        //1. �������̹������/�� x�ķ�Χ [enemyTank.getX(), enemyTank.getX() + 40]
                        //                     y�ķ�Χ [enemyTank.getY(), enemyTank.getY() + 60]

                        if (enemyTank.getDirect() == 0 || enemyTank.getDirect() == 2) {
                            //2. ��ǰ̹�� ���Ͻǵ����� [this.getX(), this.getY()]
                            if (this.getX() >= enemyTank.getX()
                                    && this.getX() <= enemyTank.getX() + 40
                                    && this.getY() >= enemyTank.getY()
                                    && this.getY() <= enemyTank.getY() + 60) {
                                return true;
                            }
                            //3. ��ǰ̹�� ���Ͻǵ����� [this.getX() + 40, this.getY()]
                            if (this.getX() + 40 >= enemyTank.getX()
                                    && this.getX() + 40 <= enemyTank.getX() + 40
                                    && this.getY() >= enemyTank.getY()
                                    && this.getY() <= enemyTank.getY() + 60) {
                                return true;
                            }
                        }
                        //�������̹���� ��/��

                        //1. �������̹������/��  x�ķ�Χ [enemyTank.getX(), enemyTank.getX() + 60]
                        //                     y�ķ�Χ [enemyTank.getY(), enemyTank.getY() + 40]
                        if (enemyTank.getDirect() == 1 || enemyTank.getDirect() == 3) {
                            //2. ��ǰ̹�� ���Ͻǵ����� [this.getX(), this.getY()]
                            if (this.getX() >= enemyTank.getX()
                                    && this.getX() <= enemyTank.getX() + 60
                                    && this.getY() >= enemyTank.getY()
                                    && this.getY() <= enemyTank.getY() + 40) {
                                return true;
                            }
                            //3. ��ǰ̹�� ���Ͻǵ����� [this.getX() + 40, this.getY()]
                            if (this.getX() + 40 >= enemyTank.getX()
                                    && this.getX() + 40 <= enemyTank.getX() + 60
                                    && this.getY() >= enemyTank.getY()
                                    && this.getY() <= enemyTank.getY() + 40) {
                                return true;
                            }
                        }
                    }

                }
                break;
            case 1: //��
                //�õ�ǰ����̹�˺��������еĵ���̹�˱Ƚ�
                for (int i = 0; i < enemyTanks.size(); i++) {
                    //��vector ��ȡ��һ������̹��
                    EnemyTank enemyTank = enemyTanks.get(i);
                    //�����Լ��Ƚ�
                    if (enemyTank != this) {
                        //�������̹������/��

                        //1. �������̹������/�� x�ķ�Χ [enemyTank.getX(), enemyTank.getX() + 40]
                        //                     y�ķ�Χ [enemyTank.getY(), enemyTank.getY() + 60]

                        if (enemyTank.getDirect() == 0 || enemyTank.getDirect() == 2) {
                            //2. ��ǰ̹�� ���Ͻǵ����� [this.getX() + 60, this.getY()]
                            if (this.getX() + 60 >= enemyTank.getX()
                                    && this.getX() + 60 <= enemyTank.getX() + 40
                                    && this.getY() >= enemyTank.getY()
                                    && this.getY() <= enemyTank.getY() + 60) {
                                return true;
                            }
                            //3. ��ǰ̹�� ���½ǵ����� [this.getX() + 60, this.getY() + 40]
                            if (this.getX() + 60 >= enemyTank.getX()
                                    && this.getX() + 60 <= enemyTank.getX() + 40
                                    && this.getY() + 40 >= enemyTank.getY()
                                    && this.getY() + 40 <= enemyTank.getY() + 60) {
                                return true;
                            }
                        }
                        //�������̹���� ��/��

                        //1. �������̹������/��  x�ķ�Χ [enemyTank.getX(), enemyTank.getX() + 60]
                        //                     y�ķ�Χ [enemyTank.getY(), enemyTank.getY() + 40]
                        if (enemyTank.getDirect() == 1 || enemyTank.getDirect() == 3) {
                            //2. ��ǰ̹�� ���Ͻǵ����� [this.getX() + 60, this.getY()]
                            if (this.getX() + 60 >= enemyTank.getX()
                                    && this.getX() + 60 <= enemyTank.getX() + 60
                                    && this.getY() >= enemyTank.getY()
                                    && this.getY() <= enemyTank.getY() + 40) {
                                return true;
                            }
                            //3. ��ǰ̹�� ���½ǵ����� [this.getX() + 60, this.getY() + 40]
                            if (this.getX() + 60 >= enemyTank.getX()
                                    && this.getX() + 60 <= enemyTank.getX() + 60
                                    && this.getY() + 40 >= enemyTank.getY()
                                    && this.getY() + 40 <= enemyTank.getY() + 40) {
                                return true;
                            }
                        }
                    }
                }
                break;
            case 2: //��
                //�õ�ǰ����̹�˺��������еĵ���̹�˱Ƚ�
                for (int i = 0; i < enemyTanks.size(); i++) {
                    //��vector ��ȡ��һ������̹��
                    EnemyTank enemyTank = enemyTanks.get(i);
                    //�����Լ��Ƚ�
                    if (enemyTank != this) {
                        //�������̹������/��

                        //1. �������̹������/�� x�ķ�Χ [enemyTank.getX(), enemyTank.getX() + 40]
                        //                     y�ķ�Χ [enemyTank.getY(), enemyTank.getY() + 60]

                        if (enemyTank.getDirect() == 0 || enemyTank.getDirect() == 2) {
                            //2. ��ǰ̹�� ���½ǵ����� [this.getX(), this.getY() + 60]
                            if (this.getX() >= enemyTank.getX()
                                    && this.getX() <= enemyTank.getX() + 40
                                    && this.getY() + 60 >= enemyTank.getY()
                                    && this.getY() + 60 <= enemyTank.getY() + 60) {
                                return true;
                            }
                            //3. ��ǰ̹�� ���½ǵ����� [this.getX() + 40, this.getY() + 60]
                            if (this.getX() + 40 >= enemyTank.getX()
                                    && this.getX() + 40 <= enemyTank.getX() + 40
                                    && this.getY() + 60 >= enemyTank.getY()
                                    && this.getY() + 60 <= enemyTank.getY() + 60) {
                                return true;
                            }
                        }
                        //�������̹���� ��/��

                        //1. �������̹������/��  x�ķ�Χ [enemyTank.getX(), enemyTank.getX() + 60]
                        //                     y�ķ�Χ [enemyTank.getY(), enemyTank.getY() + 40]
                        if (enemyTank.getDirect() == 1 || enemyTank.getDirect() == 3) {
                            //2. ��ǰ̹�� ���½ǵ����� [this.getX(), this.getY() + 60]
                            if (this.getX() >= enemyTank.getX()
                                    && this.getX() <= enemyTank.getX() + 60
                                    && this.getY() + 60 >= enemyTank.getY()
                                    && this.getY() + 60 <= enemyTank.getY() + 40) {
                                return true;
                            }
                            //3. ��ǰ̹�� ���½ǵ����� [this.getX() + 40, this.getY() + 60]
                            if (this.getX() + 40 >= enemyTank.getX()
                                    && this.getX() + 40 <= enemyTank.getX() + 60
                                    && this.getY() + 60 >= enemyTank.getY()
                                    && this.getY() + 60 <= enemyTank.getY() + 40) {
                                return true;
                            }
                        }
                    }
                }
                break;
            case 3: //��
                //�õ�ǰ����̹�˺��������еĵ���̹�˱Ƚ�
                for (int i = 0; i < enemyTanks.size(); i++) {
                    //��vector ��ȡ��һ������̹��
                    EnemyTank enemyTank = enemyTanks.get(i);
                    //�����Լ��Ƚ�
                    if (enemyTank != this) {
                        //�������̹������/��

                        //1. �������̹������/�� x�ķ�Χ [enemyTank.getX(), enemyTank.getX() + 40]
                        //                     y�ķ�Χ [enemyTank.getY(), enemyTank.getY() + 60]

                        if (enemyTank.getDirect() == 0 || enemyTank.getDirect() == 2) {
                            //2. ��ǰ̹�� ���Ͻǵ����� [this.getX(), this.getY() ]
                            if (this.getX() >= enemyTank.getX()
                                    && this.getX() <= enemyTank.getX() + 40
                                    && this.getY() >= enemyTank.getY()
                                    && this.getY() <= enemyTank.getY() + 60) {
                                return true;
                            }
                            //3. ��ǰ̹�� ���½ǵ����� [this.getX(), this.getY() + 40]
                            if (this.getX() >= enemyTank.getX()
                                    && this.getX() <= enemyTank.getX() + 40
                                    && this.getY() + 40 >= enemyTank.getY()
                                    && this.getY() + 40 <= enemyTank.getY() + 60) {
                                return true;
                            }
                        }
                        //�������̹���� ��/��

                        //1. �������̹������/��  x�ķ�Χ [enemyTank.getX(), enemyTank.getX() + 60]
                        //                     y�ķ�Χ [enemyTank.getY(), enemyTank.getY() + 40]
                        if (enemyTank.getDirect() == 1 || enemyTank.getDirect() == 3) {
                            //2. ��ǰ̹�� ���Ͻǵ����� [this.getX(), this.getY() ]
                            if (this.getX() >= enemyTank.getX()
                                    && this.getX() <= enemyTank.getX() + 60
                                    && this.getY() >= enemyTank.getY()
                                    && this.getY() <= enemyTank.getY() + 40) {
                                return true;
                            }
                            //3. ��ǰ̹�� ���½ǵ����� [this.getX(), this.getY() + 40]
                            if (this.getX() >= enemyTank.getX()
                                    && this.getX() <= enemyTank.getX() + 60
                                    && this.getY() + 40 >= enemyTank.getY()
                                    && this.getY() + 40 <= enemyTank.getY() + 40) {
                                return true;
                            }
                        }
                    }
                }
                break;
        }
        return  false;
    }


    @Override
    public void run() {
        while (true) {

            //���������ж����shots size() =0, ����һ���ӵ������뵽
            //shots���ϣ�������
            if (isLive && shots.size() < 5) {

                //�ж�̹�˵ķ��򣬴�����Ӧ���ӵ�
                switch (getDirect()) {
                    case 0:
                        shot = new Shot(getX() + 20, getY(), 0,3);
                        break;
                    case 1:
                        shot = new Shot(getX() + 60, getY() + 20, 1,3);
                        break;
                    case 2: //����
                        shot = new Shot(getX() + 20, getY() + 60, 2,3);
                        break;
                    case 3://����
                        shot = new Shot(getX(), getY() + 20, 3,3);
                        break;
                }
                shots.add(shot);
                //����
                new Thread(shot).start();

            }


            //����̹�˵ķ�������������
            switch (getDirect()) {
                case 0:  //����
                    //��̹�˱���һ��������30��
                    for (int i = 0; i < 30; i++) {
                        if (getY() > 0 &&!isTouchEnemyTank()) {
                            move();
                        }
                        //����50����
                        try {
                            Thread.sleep(50);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    break;
                case 1:  //����
                    for (int i = 0; i < 30; i++) {
                        if (getX() + 60 < 1000 &&!isTouchEnemyTank()) {
                            move();
                        }
                        //����50����
                        try {
                            Thread.sleep(50);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    break;
                case 2:  //����
                    for (int i = 0; i < 30; i++) {
                        if (getY() + 60 < 750 &&!isTouchEnemyTank()) {
                            move();
                        }
                        //����50����
                        try {
                            Thread.sleep(50);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    break;
                case 3:  //����
                    for (int i = 0; i < 30; i++) {
                        if (getX() > 0 &&!isTouchEnemyTank()) {
                            move();
                        }
                        //����50����
                        try {
                            Thread.sleep(50);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    break;
            }


            //Ȼ������ĸı�̹�˷��� 0-3
            setDirect((int) (Math.random() * 4));
            //д��������һ��Ҫ������������߳�ʲôʱ�����
            if (!isLive) {
                break; //�˳��߳�.
            }

        }

    }
}
