package tanke;

import javax.swing.*;
import java.awt.*;

@SuppressWarnings({"all"})

public class DrawCircle extends JFrame {
    private Myplen mp = null;

    public static void main(String[] args) {
        new DrawCircle();
        System.out.println("�ó������˳� ");
    }

    public DrawCircle() {
        mp = new Myplen();  //��ʼ�����
        this.add(mp); //�������뵽����(����)
        this.setSize(500, 500); //���ô��ڵĴ�С
        this.setVisible(true); //���ô��ڿɼ�   ����Ϊtrueʱ�����ڻ���ʾ����
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //���ô��ڹر�ʱ�Ĳ���   ��������ڵ�С����������ȫ�˳�.

    }


}

class Myplen extends JPanel {
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        System.out.println("paint ������������~");
        /*����һ��Բ��.
         g.drawOval(10, 10, 100, 100);***/


        /*��ʾ���Ʋ�ͬ��ͼ��..
        //��ֱ�� drawLine(int x1,int y1,int x2,int y2)*/


        /*g.drawLine(10, 10, 100, 100);
        //�����α߿� drawRect(int?x, int?y, int?width, int?height)*/
        //g.drawRect(10, 10, 100, 100);

        /*//��Բ�Ǿ��� drawRoundRect(int?x, int?y, int?width, int?height, int?arcWidth, int?arcHeight)*/
        //g.drawRoundRect(10, 10, 100, 100, 20, 20);

        /*����Բ�߿� drawOval(int?x, int?y, int?width, int?height)
        g.drawOval(10, 10, 100, 100);*/

        //������ fillRect(int?x, int?y, int?width, int?height)
        //g.fillRect(10, 10, 100, 100);

        //���û��ʵ���ɫ
        g.setColor(Color.blue);
        g.fillRect(10, 10, 100, 100);

        //�����Բ fillOval(int?x, int?y, int?width, int?height)
//        g.setColor(Color.red);
//        g.fillOval(10, 10, 100, 100);

        //��ͼƬ drawImage(Image?img, int?x, int?y, ..)
        /*1. ��ȡͼƬ��Դ, /bg.png ��ʾ�ڸ���Ŀ�ĸ�Ŀ¼ȥ��ȡ bg.png ͼƬ��Դ
        Image image = Toolkit.getDefaultToolkit().getImage(MyPanel.class.getResource("/123.png"));
        g.drawImage(image, 10, 10, 175, 221, this);*/


        //���ַ��� drawString(String?str, int?x, int?y)//д��
        //������������ɫ������
//        g.setColor(Color.red);
//        g.setFont(new Font("����", Font.BOLD, 50));  //�������塢�ֺš�����
//        //�������õ� 100�� 100�� �� "�������"���½�
//        g.drawString("�������", 100, 100);
        //���û��ʵ����� setFont(Font?font)
        //���û��ʵ���ɫ setColor(Color?c)


    }
}