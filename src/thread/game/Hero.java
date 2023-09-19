package thread.game;


import java.util.Vector;

public class Hero extends Tank {
    //����һ��Shot����, ��ʾһ�����(�߳�)
    Shot shot = null;
    //���Է������ӵ�
    Vector<Shot> shots = new Vector<>();
    public Hero(int x, int y) {
        super(x, y);
    }

    //���
    public void shotEnemyTank() {

        //������ӵ���ô��, ���������ǵ�����ϣ����ֻ��5��
        if(shots.size() == 5) {
            return;
        }

        //���� Shot ����, ���ݵ�ǰHero�����λ�úͷ���������Shot
        switch (getDirect()) {//�õ�Hero������
            case 0: //����
                shot = new Shot(getX() + 20, getY(), 0);
                break;
            case 1: //����
                shot = new Shot(getX() + 60, getY() + 20, 1);
                break;
            case 2: //����
                shot = new Shot(getX() + 20, getY() + 60, 2);
                break;
            case 3: //����
                shot = new Shot(getX(), getY() + 20, 3);
                break;
        }

        //���´�����shot���뵽shots
        shots.add(shot);
        //�������ǵ�Shot�߳�
        new Thread(shot).start();

    }

}
