package thread.game;


public class Shot implements Runnable {
    int x; //�ӵ�x����
    int y; //�ӵ�y����
    int direct = 0; //�ӵ�����
    int speed = 2; //�ӵ����ٶ�
    boolean isLive = true; //�ӵ��Ƿ񻹴��

    //������
    public Shot(int x, int y, int direct) {
        this.x = x;
        this.y = y;
        this.direct = direct;
    }

    @Override
    public void run() {//���
        while (true) {

            //���� 50����
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            //���ݷ������ı�x,y����
            switch (direct) {
                case 0://��
                    y -= speed;
                    break;
                case 1://��
                    x += speed;
                    break;
                case 2://��
                    y += speed;
                    break;
                case 3://��
                    x -= speed;
                    break;
            }
            //�ж��ӵ��Ƿ񳬳��߽�  ��������߽�Ͱ��ӵ����Ϊ����״̬   ��������ѭ��
            if (!(x >= 0 && x <= 1000 && y >= 0 && y <= 750 && isLive)) {
                System.out.println("�ӵ��߳��˳�");
                isLive = false;
                break;
            }

        }
    }
}
