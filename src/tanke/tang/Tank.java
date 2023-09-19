package tanke.tang;

public class Tank {
    private int x;//坦克的横坐标
    private int y;//坦克的纵坐标
    private int direct;//坦克的方向
    private int speed = 1;//坦克的速度


    public Tank(int x, int y, int speed) {
        this.speed = speed;
        this.x = x;
        this.y = y;
    }

    public Tank(int x, int y) {
        this.x = x;
        this.y = y;

    }

    //上右下左移动方法
    public void move(int direct) {
        switch (direct) {
            case 0:
                y -= speed;  //向上移动
                break;
            case 1:
                x += speed;  //向右移动
                break;
            case 2:
                y += speed;  //向下移动
                break;
            case 3:
                x -= speed;  //向左移动
                break;
        }
    }

    public int getDirect() {
        return direct;
    }

    public void setDirect(int direct) {
        this.direct = direct;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
