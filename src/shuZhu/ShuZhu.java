package shuZhu;

import java.util.Scanner;

public class ShuZhu {
    public static void main(String[] ages){
        double scores[] ; //声明数组， 这时 scores 是 null

        scores = new double[5]; // 分配内存空间，可以存放数据

        Scanner myScanner = new Scanner(System.in);
        for( int i = 0; i < scores.length; i++) {
            System.out.println("请输入第"+ (i+1) +"个元素的值");
            scores[i] = myScanner.nextDouble();
        }
        //输出，遍历数组
        System.out.println("==数组的元素/值的情况如下:===");
        for( int i = 0; i < scores.length; i++) {
            System.out.println("第"+ (i+1) +"个元素的值=" + scores[i]);
        }
    }


}
