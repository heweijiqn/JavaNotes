package shuZhu;

import java.util.Scanner;

public class ShuZhu_Find {
    public static void main(String[] ages){
        String[] names = {"��üӥ��", "��ëʨ��", "��������", "��������"};
        Scanner myScanner = new Scanner(System.in);
        System.out.println("����������");
        String findName = myScanner.next();
        //�������飬��һ�Ƚϣ�����У�����ʾ��Ϣ�����˳�
        int index = -1;
        for(int i = 0; i < names.length; i++) {
        //�Ƚ� �ַ����Ƚ� equals, ���Ҫ�ҵ����־��ǵ�ǰԪ��
            if(findName.equals(names[i])) {
                System.out.println("��ϲ���ҵ� " + findName);
                System.out.println("�±�Ϊ= " + i);
                //�� i ���浽 index
                index = i;
                break;//�˳�
            }
        }
        if(index == -1) {
            //û���ҵ�
            System.out.println("sorry ,û���ҵ� " + findName);
        }

    }
}
