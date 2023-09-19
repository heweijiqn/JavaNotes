package tanke.tang;

import javax.swing.*;

public class Game extends JFrame {

    Mypanle mp = null;  //初始化一个Mypanle对象

    public static void main(String[] args) {
        new Game();


    }

    public Game() {
        mp = new Mypanle();  //创建一个Mypanle对象
        setTitle("tank");
        setSize(800, 600);  //设置窗口的大小
        setLocationRelativeTo(null);  //居中显示
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  //点击关闭按钮，退出程序
        setVisible(true); //显示窗口
        setResizable(false); //不可改变窗口大小
        addKeyListener(mp); //添加键盘监听器
        add(mp); //添加面板到窗口中


    }

}
