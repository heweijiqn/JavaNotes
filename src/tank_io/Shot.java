/**
 * @auther ��ΰ��
 * @date 2022/8/2 10:20
 */


package tank_io;
@SuppressWarnings({"all"})
public class Shot implements Runnable{



    int x; //�ӵ�x����
    int y; //�ӵ�y����
    int direct = 0; //�ӵ�����
    int speed = 2; //�ӵ����ٶ�
    boolean isLive = true; //�ӵ��Ƿ񻹴��

    public Shot(int x, int y, int direct, int speed) {
        this.x = x;
        this.y = y;
        this.direct = direct;
        this.speed = speed;
    }

    @Override
    public void run() {
        while (isLive){
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
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
            if (!(x >= 0 && x <= 1000 && y >= 0 && y <= 750 && isLive)) {
                System.out.println("�ӵ��߳��˳�");
                isLive = false;
                break;
            }
        }

    }
}
