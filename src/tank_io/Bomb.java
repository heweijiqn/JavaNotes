/**
 * @auther ��ΰ��
 * @date 2022/8/2 12:11
 */


package tank_io;

public class Bomb {
    int x, y; //ը��������
    int life = 9; //ը������������
    boolean isLive = true; //�Ƿ񻹴��

    public Bomb(int x, int y) {
        this.x = x;
        this.y = y;
    }

    //��������ֵ
    public void lifeDown() { //��ϳ���ͼƬ�ı�ըЧ��
        if(life > 0) {
            life--;
        } else {
            isLive = false;
        }
    }
}
