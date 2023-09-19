package thread.game;

import javax.swing.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Scanner;


public class Game extends JFrame {

    //����MyPanel
    MyPanel mp = null;
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        Game hspTankGame01 = new Game();
    }

    public Game() {
        System.out.println("������ѡ�� 1: ����Ϸ 2: �����Ͼ�");
        String key = scanner.next();
        mp = new MyPanel(key);
        //��mp ���뵽Thread ,������
        Thread thread = new Thread(mp);
        thread.start();
        this.add(mp);//�����(������Ϸ�Ļ�ͼ����)

        this.setSize(1300, 950);
        this.addKeyListener(mp);//��JFrame ����mp�ļ����¼�
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  //���ùرմ���ʱ�������
        this.setVisible(true);  //���ô��ڿɼ�

        //��JFrame ��������Ӧ�رմ��ڵĴ���
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                Recorder.keepRecord();
                System.exit(0);
            }
        });
    }
}
