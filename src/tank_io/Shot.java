/**
 * @auther 何伟健
 * @date 2022/8/2 10:20
 */


package tank_io;
@SuppressWarnings({"all"})
public class Shot implements Runnable{



    int x; //子弹x坐标
    int y; //子弹y坐标
    int direct = 0; //子弹方向
    int speed = 2; //子弹的速度
    boolean isLive = true; //子弹是否还存活

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
                case 0://上
                    y -= speed;
                    break;
                case 1://右
                    x += speed;
                    break;
                case 2://下
                    y += speed;
                    break;
                case 3://左
                    x -= speed;
                    break;
            }
            if (!(x >= 0 && x <= 1000 && y >= 0 && y <= 750 && isLive)) {
                System.out.println("子弹线程退出");
                isLive = false;
                break;
            }
        }

    }
}
