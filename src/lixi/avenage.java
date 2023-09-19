/**
 * @author 何伟健
 * @version 1.0
 * @date 2022/9/1 19:16
 */


package lixi;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

@SuppressWarnings("all")
public class avenage {
    /**
     * @param args
     */
    public static void main(String[] args) {

        System.out.println("请输入要计算的数的个数");
        Scanner myScanner = new Scanner(System.in);
        double n = myScanner.nextDouble();

        System.out.println("第一种解法：");
        sum(n);
        System.out.println("");
        System.out.println("第二种解法");
        avenage(n);
        System.out.println("");
        System.out.println("第三种解法");
        avg(n);


    }


    /**
     *向集合中循环添加元素，并计算集合中元素的平均值
     *
     * @return
     */
    public static HashSet<Double> sum(double n) {
        HashSet<Double> set = new HashSet<>();
        double sum = 0;
        for (int i = 0; i < n; i++) {
            System.out.println("请输入第"+ (i+1) +"个元素的值");
            Scanner myScanner = new Scanner(System.in);
            double j = myScanner.nextDouble();
            set.add(j);
        }
        Iterator<Double> iterator = set.iterator();
            while (iterator.hasNext()) {
            Double next =  iterator.next();
            sum += next;
        }

        System.out.printf("集合中元素的平均值为："+"%.2f", sum/set.size());
        return set;


    }

    /**
     * 数组中的元素的平均值
     * @return
     */
    public static double avenage(double n) {
        double[] arr = new double[(int) n];
        double count = 0;
        for (int i = 0; i < arr.length; i++) {
            System.out.println("请输入第"+ (i+1) +"个元素的值");
            Scanner myScanner = new Scanner(System.in);
            double j = myScanner.nextDouble();
            arr[i] = j;
            count += arr[i];
        }
        double ave = count / arr.length;
        System.out.print("数组的平均值为：" );
        System.out.printf("%.2f",ave);
        return ave;
    }

    /**
     * 求平均值
     *
     */

    public static void avg(double n) {

        double sum = 0;
        for (int i = 0; i < n; i++) {
            System.out.println("请输入第"+ (i+1) +"个元素的值");
            Scanner myScanner = new Scanner(System.in);
            double j = myScanner.nextDouble();

            sum += j;
        }
        System.out.printf("元素的平均值为："+"%.2f", sum/n);




    }

}
