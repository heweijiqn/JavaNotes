package excption.try_;

import java.util.Scanner;

public class Exercise {
    public static void main(String[] args) {
        //˼·
        //1. ����Scanner����
        //2. ʹ������ѭ����ȥ����һ������
        //3. Ȼ�󽫸������ֵ��ת��һ��int
        //4. �����ת��ʱ���׳��쳣��˵����������ݲ���һ������ת��int������
        //5. ���û���׳��쳣����break ��ѭ��
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        String inputStr = "";
        while (true) {

            System.out.println("������һ������:"); //
            inputStr = scanner.next();
            try {
                num = Integer.parseInt(inputStr); //�����ǿ����׳��쳣
                break;
            } catch (NumberFormatException e) {
                System.out.println("������Ĳ���һ������:");
            }finally {
                System.out.println("���������� ");
            }
        }

        System.out.println("�������ֵ��=" + num);
    }


}
