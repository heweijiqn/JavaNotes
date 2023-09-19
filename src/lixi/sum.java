/**
 * @author 何伟健
 * @version 1.0
 * @date 2022/9/1 19:39
 */


package lixi;

import java.util.Scanner;

@SuppressWarnings("all")
public class sum {
    /**
     * @param args
     */
    public static void main(String[] args) {
        /*求1+（1+2）+（1+2+3）+……+（1+2+3+…n）的和，使用三种解法，*/
        System.out.println("请输入n的值 ");
        Scanner myScanner = new Scanner(System.in);
        int n = myScanner.nextInt();
        System.out.println("第一种解法：");
        System.out.println(csum(n));
        System.out.println("第二种解法");
        System.out.println(asum(n));
        System.out.println("第三种解法");
        System.out.println(bsum(n));



    }

    //i(i+1)/2
    public static int asum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i*(i+1)/2;
        }
        return sum;
    }
    //(n*(n+1)*(2*n+1)/6+n*(n+1)/n)/2
    public static int bsum(int n) {
        int sum = 0;

        sum = (n*(n+1)*(2*n+1)/6+n*(n+1)/n)/2;
        return sum;
    }
    //双重循环
    public static int csum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                sum += j;
            }
        }
        return sum;
    }


}
