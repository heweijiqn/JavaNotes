package thread.game;

import java.util.Vector;


@SuppressWarnings({"all"})
public class    EnemyTank extends Tank implements Runnable {
    //�ڵ���̹���࣬ʹ��Vector ������Shot
    Vector<Shot> shots = new Vector<>();
    //���ӳ�Ա��EnemyTank ���Եõ�����̹�˵�Vector
    //����
    //1. Vector<EnemyTank> ��
    Vector<EnemyTank> enemyTanks = new Vector<>();
    boolean isLive = true;

    public EnemyTank(int x, int y) {
        super(x, y);
    }



    //�����ṩһ�����������Խ�MyPanel �ĳ�Ա Vector<EnemyTank> enemyTanks = new Vector<>();
    //���õ� EnemyTank �ĳ�Ա enemyTanks
    public void setEnemyTanks(Vector<EnemyTank> enemyTanks) {
        this.enemyTanks = enemyTanks;
    }

    //��д�������жϵ�ǰ���������̹�ˣ��Ƿ�� enemyTanks �е�����̹�˷������ص�������ײ
    public boolean isTouchEnemyTank() {

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
                        //�Ϻ�����
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
                        //�Ϻ�����
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
                        //�Ϻ�����
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
                        //�Ϻ�����
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
                        //�Ϻ�����
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
                        //�Ϻ�����
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
                        //�Ϻ�����
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
                        //�Ϻ�����
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
                Shot s = null;
                //�ж�̹�˵ķ��򣬴�����Ӧ���ӵ�
                switch (getDirect()) {
                    case 0:
                        s = new Shot(getX() + 20, getY(), 0);
                        break;
                    case 1:
                        s = new Shot(getX() + 60, getY() + 20, 1);
                        break;
                    case 2: //����
                        s = new Shot(getX() + 20, getY() + 60, 2);
                        break;
                    case 3://����
                        s = new Shot(getX(), getY() + 20, 3);
                        break;
                }
                shots.add(s);
                //����
                new Thread(s).start();

            }


            //����̹�˵ķ�������������
            switch (getDirect()) {
                case 0:  //����
                    //��̹�˱���һ��������30��
                    for (int i = 0; i < 30; i++) {
                        if (getY() > 0 && !isTouchEnemyTank()) {
                            moveUp();
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
                        if (getX() + 60 < 1000 && !isTouchEnemyTank()) {
                            moveRight();
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
                        if (getY() + 60 < 750 && !isTouchEnemyTank()) {
                            moveDown();
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
                        if (getX() > 0 && !isTouchEnemyTank()) {
                            moveLeft();
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
            //���Ϻ�˵��д��������һ��Ҫ������������߳�ʲôʱ�����
            if (!isLive) {
                break; //�˳��߳�.
            }

        }
    }
}
