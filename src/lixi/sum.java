/**
 * @author ��ΰ��
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
        /*��1+��1+2��+��1+2+3��+����+��1+2+3+��n���ĺͣ�ʹ�����ֽⷨ��*/
        System.out.println("������n��ֵ ");
        Scanner myScanner = new Scanner(System.in);
        int n = myScanner.nextInt();
        System.out.println("��һ�ֽⷨ��");
        System.out.println(csum(n));
        System.out.println("�ڶ��ֽⷨ");
        System.out.println(asum(n));
        System.out.println("�����ֽⷨ");
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
    //˫��ѭ��
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
