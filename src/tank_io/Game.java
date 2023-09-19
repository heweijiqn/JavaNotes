/**
 * @auther ��ΰ��
 * @date 2022/8/2 10:16
 */


package tank_io;

import javax.swing.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Scanner;

public class Game extends JFrame {
    public static void main(String[] args) {
        new Game();
    }
    MyPanel mp = null;
    static Scanner scanner = new Scanner(System.in);
    public Game(){
        System.out.println("������ѡ�� 1: ����Ϸ 2: �����Ͼ�");
        String key = scanner.next();
        mp = new MyPanel(key);
        //��mp ���뵽Thread ,������
        Thread thread = new Thread(mp);
        thread.start();
        this.add(mp);//�����(������Ϸ�Ļ�ͼ����)

        this.setSize(1300, 950);
        this.addKeyListener(mp);//��JFrame ����mp�ļ����¼�
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);

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
