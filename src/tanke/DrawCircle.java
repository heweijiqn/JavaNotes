package tanke;

import javax.swing.*;
import java.awt.*;

@SuppressWarnings({"all"})

public class DrawCircle extends JFrame {
    private Myplen mp = null;

    public static void main(String[] args) {
        new DrawCircle();
        System.out.println("该程序已退出 ");
    }

    public DrawCircle() {
        mp = new Myplen();  //初始化面板
        this.add(mp); //把面板放入到窗口(画框)
        this.setSize(500, 500); //设置窗口的大小
        this.setVisible(true); //设置窗口可见   设置为true时，窗口会显示出来
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //设置窗口关闭时的操作   当点击窗口的小×，程序完全退出.

    }


}

class Myplen extends JPanel {
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        System.out.println("paint 方法被调用了~");
        /*画出一个圆形.
         g.drawOval(10, 10, 100, 100);***/


        /*演示绘制不同的图形..
        //画直线 drawLine(int x1,int y1,int x2,int y2)*/


        /*g.drawLine(10, 10, 100, 100);
        //画矩形边框 drawRect(int?x, int?y, int?width, int?height)*/
        //g.drawRect(10, 10, 100, 100);

        /*//画圆角矩形 drawRoundRect(int?x, int?y, int?width, int?height, int?arcWidth, int?arcHeight)*/
        //g.drawRoundRect(10, 10, 100, 100, 20, 20);

        /*画椭圆边框 drawOval(int?x, int?y, int?width, int?height)
        g.drawOval(10, 10, 100, 100);*/

        //填充矩形 fillRect(int?x, int?y, int?width, int?height)
        //g.fillRect(10, 10, 100, 100);

        //设置画笔的颜色
        g.setColor(Color.blue);
        g.fillRect(10, 10, 100, 100);

        //填充椭圆 fillOval(int?x, int?y, int?width, int?height)
//        g.setColor(Color.red);
//        g.fillOval(10, 10, 100, 100);

        //画图片 drawImage(Image?img, int?x, int?y, ..)
        /*1. 获取图片资源, /bg.png 表示在该项目的根目录去获取 bg.png 图片资源
        Image image = Toolkit.getDefaultToolkit().getImage(MyPanel.class.getResource("/123.png"));
        g.drawImage(image, 10, 10, 175, 221, this);*/


        //画字符串 drawString(String?str, int?x, int?y)//写字
        //给画笔设置颜色和字体
//        g.setColor(Color.red);
//        g.setFont(new Font("隶书", Font.BOLD, 50));  //设置字体、字号、字型
//        //这里设置的 100， 100， 是 "北京你好"左下角
//        g.drawString("北京你好", 100, 100);
        //设置画笔的字体 setFont(Font?font)
        //设置画笔的颜色 setColor(Color?c)


    }
}