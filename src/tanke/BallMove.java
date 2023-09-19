package tanke;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class BallMove extends JFrame {
    MyPanel mp = null;

    public static void main(String[] args) {
        BallMove ballMove = new BallMove();
    }

    //������
    public BallMove() {
        mp = new MyPanel();
        this.add(mp);
        this.setSize(400, 300);
        //����JFrame ������Լ��������¼�, �����Լ�������巢���ļ����¼�
        this.addKeyListener(mp);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}

//���, ���Ի���С��
//KeyListener �Ǽ�����, ���Լ��������¼�
class MyPanel extends JPanel implements KeyListener {

    //Ϊ����С������ƶ�, ���������Ͻǵ�����(x,y)���ñ���
    int x = 10;
    int y = 10;

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.fillOval(x, y, 20, 20); //Ĭ�Ϻ�ɫ
    }

    //���ַ����ʱ���÷����ͻᴥ��
    @Override
    public void keyTyped(KeyEvent e) {
    }

    //��ĳ�������£��÷����ᴥ��
    @Override
    public void keyPressed(KeyEvent e) {

        //System.out.println((char)e.getKeyCode() + "������..");

        //�����û����µĲ�ͬ����������С����ƶ� (�������ҵļ�)
        //��java�У����ÿһ����������һ��ֵ(int)
        if (e.getKeyCode() == KeyEvent.VK_DOWN) {//KeyEvent.VK_DOWN�������µļ�ͷ��Ӧ��code
            y++;
        } else if (e.getKeyCode() == KeyEvent.VK_UP) {
            y--;
        } else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            x--;
        } else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            x++;
        }

        //������ػ�
        this.repaint();
    }

    //��ĳ�����ͷ�(�ɿ�)���÷����ᴥ��
    @Override
    public void keyReleased(KeyEvent e) {

    }
}


