package tanke.tang;

public class Tank {
    private int x;//̹�˵ĺ�����
    private int y;//̹�˵�������
    private int direct;//̹�˵ķ���
    private int speed = 1;//̹�˵��ٶ�


    public Tank(int x, int y, int speed) {
        this.speed = speed;
        this.x = x;
        this.y = y;
    }

    public Tank(int x, int y) {
        this.x = x;
        this.y = y;

    }

    //���������ƶ�����
    public void move(int direct) {
        switch (direct) {
            case 0:
                y -= speed;  //�����ƶ�
                break;
            case 1:
                x += speed;  //�����ƶ�
                break;
            case 2:
                y += speed;  //�����ƶ�
                break;
            case 3:
                x -= speed;  //�����ƶ�
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
