package excption;

import java.util.Scanner;

public class Home {
    public static void main(String[] args) {
        /*
        ��дӦ�ó���EcmDef.java�����������е���������(����)���������������
���������������Ҫ��ʹ�÷��� cal(int n1, int n2)
�����ݸ�ʽ����ȷ(NumberFormatException)��ȱ�������в���(ArrayIndexOutOfBoundsException)����0 �����쳣����(ArithmeticException)��
         */
        Scanner scanner = new Scanner(System.in);
        String inputStr = "";
        System.out.println("�������һ������:"); //
        inputStr = scanner.next();
        String s = "";
        System.out.println("������ڶ�������:");
        s = scanner.next();
        String q[]={inputStr,s};



        try {

            //����֤����Ĳ����ĸ����Ƿ���ȷ ��������
            if(q.length != 2) {
                throw new ArrayIndexOutOfBoundsException("������������");
            }

            //�Ȱѽ��յ��Ĳ�����ת������
            double n1 = Integer.parseInt(inputStr);
            double n2 = Integer.parseInt(s);

            double res = cal(n1, n2);//�÷��������׳�ArithmeticException
            System.out.println("��������=" + res);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        } catch (java.lang.NumberFormatException e) {
            System.out.println("������ʽ����ȷ����Ҫ�������");
        } catch (java.lang.ArithmeticException e) {
            System.out.println("�����˳�0���쳣");
        }


    }
    //��дcal��������������������
    public static double cal(double n1, double n2) {
        return n1 / n2;
    }
}
