package io.i_o;

import java.io.IOException;
import java.io.PrintStream;

public class PrintStream_ {  //PrintStream ���ֽڴ�ӡ��/�������
    public static void main(String[] args) throws IOException {
        PrintStream out = System.out;
        //��Ĭ������£�PrintStream ������ݵ�λ���� ��׼���������ʾ��
        /*
             public void print(String s) {
                if (s == null) {
                    s = "null";
                }
                write(s);
            }

         */
        out.print("john, hello");
        //��Ϊprint�ײ�ʹ�õ���write , �������ǿ���ֱ�ӵ���write���д�ӡ/���
        out.write("��˳ƽ,���".getBytes());
        out.close();

        //���ǿ���ȥ�޸Ĵ�ӡ�������λ��/�豸
        //1. ����޸ĳɵ� "e:\\f1.txt"
        //2. "hello, ��˳ƽ����~" �ͻ������ e:\f1.txt
        //3. public static void setOut(PrintStream out) {
        //        checkIO();
        //        setOut0(out); // native �������޸���out
        //   }
        System.setOut(new PrintStream("e:\\f1.txt"));
        System.out.println("hello, ��˳ƽ����~");


    }
}
