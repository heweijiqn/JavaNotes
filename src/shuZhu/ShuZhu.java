package shuZhu;

import java.util.Scanner;

public class ShuZhu {
    public static void main(String[] ages){
        double scores[] ; //�������飬 ��ʱ scores �� null

        scores = new double[5]; // �����ڴ�ռ䣬���Դ������

        Scanner myScanner = new Scanner(System.in);
        for( int i = 0; i < scores.length; i++) {
            System.out.println("�������"+ (i+1) +"��Ԫ�ص�ֵ");
            scores[i] = myScanner.nextDouble();
        }
        //�������������
        System.out.println("==�����Ԫ��/ֵ���������:===");
        for( int i = 0; i < scores.length; i++) {
            System.out.println("��"+ (i+1) +"��Ԫ�ص�ֵ=" + scores[i]);
        }
    }


}
