package tanke.tang;

import javax.swing.*;

public class Game extends JFrame {

    Mypanle mp = null;  //��ʼ��һ��Mypanle����

    public static void main(String[] args) {
        new Game();


    }

    public Game() {
        mp = new Mypanle();  //����һ��Mypanle����
        setTitle("tank");
        setSize(800, 600);  //���ô��ڵĴ�С
        setLocationRelativeTo(null);  //������ʾ
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  //����رհ�ť���˳�����
        setVisible(true); //��ʾ����
        setResizable(false); //���ɸı䴰�ڴ�С
        addKeyListener(mp); //��Ӽ��̼�����
        add(mp); //�����嵽������


    }

}
