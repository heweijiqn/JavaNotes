package decide;

import java.util.Scanner;

public class If1 {
    public static void main(String[] ages){
        Scanner sc = new Scanner(System.in);
        System.out.println("��ӭ���빺Ʊϵͳ");
        System.out.println("�����뵭���������\n 1:���� \n 2������");
        System.out.println("�������Ӧ����");
        int profitability = sc.nextInt();
        System.out.println(profitability);
        if(profitability==1){
            System.out.println("����������" );
            int age = sc.nextInt();
            if(age>18 && age<65){
                System.out.println("Ʊ��Ϊ60rmb");
            } else if (age<18&&age>0) {
                System.out.println("Ʊ��Ϊ30rmb");
            } else if (age>65&&age<150) {
                System.out.println("Ʊ��Ϊ20rmb");

            }else {
                System.out.println("���������������");
            }

        }else if(profitability==2){
            System.out.println("����������" );
            int age = sc.nextInt();
            if(age>18&&age<65){
                System.out.println("Ʊ��Ϊ40rmb");
            } else if ((age>0&&age<18)&&(age>65&&age<150)) {
                System.out.println("Ʊ��Ϊ20rmb");
            }else {
                System.out.println("���������������");
            }


        }
    }
}
