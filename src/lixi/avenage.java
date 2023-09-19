/**
 * @author ��ΰ��
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

        System.out.println("������Ҫ��������ĸ���");
        Scanner myScanner = new Scanner(System.in);
        double n = myScanner.nextDouble();

        System.out.println("��һ�ֽⷨ��");
        sum(n);
        System.out.println("");
        System.out.println("�ڶ��ֽⷨ");
        avenage(n);
        System.out.println("");
        System.out.println("�����ֽⷨ");
        avg(n);


    }


    /**
     *�򼯺���ѭ�����Ԫ�أ������㼯����Ԫ�ص�ƽ��ֵ
     *
     * @return
     */
    public static HashSet<Double> sum(double n) {
        HashSet<Double> set = new HashSet<>();
        double sum = 0;
        for (int i = 0; i < n; i++) {
            System.out.println("�������"+ (i+1) +"��Ԫ�ص�ֵ");
            Scanner myScanner = new Scanner(System.in);
            double j = myScanner.nextDouble();
            set.add(j);
        }
        Iterator<Double> iterator = set.iterator();
            while (iterator.hasNext()) {
            Double next =  iterator.next();
            sum += next;
        }

        System.out.printf("������Ԫ�ص�ƽ��ֵΪ��"+"%.2f", sum/set.size());
        return set;


    }

    /**
     * �����е�Ԫ�ص�ƽ��ֵ
     * @return
     */
    public static double avenage(double n) {
        double[] arr = new double[(int) n];
        double count = 0;
        for (int i = 0; i < arr.length; i++) {
            System.out.println("�������"+ (i+1) +"��Ԫ�ص�ֵ");
            Scanner myScanner = new Scanner(System.in);
            double j = myScanner.nextDouble();
            arr[i] = j;
            count += arr[i];
        }
        double ave = count / arr.length;
        System.out.print("�����ƽ��ֵΪ��" );
        System.out.printf("%.2f",ave);
        return ave;
    }

    /**
     * ��ƽ��ֵ
     *
     */

    public static void avg(double n) {

        double sum = 0;
        for (int i = 0; i < n; i++) {
            System.out.println("�������"+ (i+1) +"��Ԫ�ص�ֵ");
            Scanner myScanner = new Scanner(System.in);
            double j = myScanner.nextDouble();

            sum += j;
        }
        System.out.printf("Ԫ�ص�ƽ��ֵΪ��"+"%.2f", sum/n);




    }

}
