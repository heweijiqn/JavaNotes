package shuZhu;

import java.util.Scanner;

public class ShuZhu_add {
    public static void main(String[] ages){
        Scanner myScanner = new Scanner(System.in);
//��ʼ������
        int[] arr = {1,2,3};
        do {
            int[] arrNew = new int[arr.length + 1];
            //���� arr ���飬���ν� arr ��Ԫ�ؿ����� arrNew ����
            for(int i = 0; i < arr.length; i++) {
                arrNew[i] = arr[i];
            }
            System.out.println("��������Ҫ��ӵ�Ԫ��");
            int addNum = myScanner.nextInt();
            //�� addNum ���� arrNew ���һ��Ԫ��
            arrNew[arrNew.length - 1] = addNum;
            //�� arr ָ�� arrNew
            arr = arrNew;
            //��� arr ����Ч��
            System.out.println("====arr ���ݺ�Ԫ�����====");
            for(int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + "\t");
            }
            //���û��Ƿ����
            System.out.println("�Ƿ������� y/n");
            char key = myScanner.next().charAt(0);
            if( key == 'n') { //������� n ,�ͽ���
                break;
            }
        }while(true);
        System.out.println("���˳������...");
        }
}
