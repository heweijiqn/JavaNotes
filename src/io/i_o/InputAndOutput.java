package io.i_o;

import java.util.Scanner;

public class InputAndOutput {
    public static void main(String[] args) {
        //System �� �� public final static InputStream in = null;
        // System.in ��������   InputStream
        // System.in ��������   BufferedInputStream
        // ��ʾ���Ǳ�׼���� ����
        System.out.println(System.in.getClass());

        //�Ϻ����
        //1. System.out public final static PrintStream out = null;
        //2. ��������  PrintStream
        //3. �������� PrintStream
        //4. ��ʾ��׼��� ��ʾ��
        System.out.println(System.out.getClass());

        System.out.println("hello, ��˳ƽ����~");

        Scanner scanner = new Scanner(System.in);
        System.out.println("��������");
        String next = scanner.next();
        System.out.println("next=" + next);


    }
}
