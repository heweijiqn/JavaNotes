/**
 * @auther 何伟健
 * @date 2022/8/2 8:53
 */


package tank_io;

public class Tank {
   private  int x;
   private  int y;
    private  int speed;
    private  int direct;
    boolean isLive = true;

    public Tank(int x, int y, int speed, int direct) {
        this.x = x;
        this.y = y;
        this.speed = speed;
        this.direct = direct;
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

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getDirect() {
        return direct;
    }

    public void setDirect(int direct) {
        this.direct = direct;
    }


    //上右下左移动方法
    public void move(){
        switch (direct){
            case 0:
                y-=speed;  //向上移动
                break;
            case 1:
                x+=speed;  //向右移动
                break;
            case 2:
                y+=speed;  //向下移动
                break;
            case 3:
                x-=speed;  //向左移动
                break;
        }
    }

}
