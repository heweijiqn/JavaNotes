package excption;

import java.io.FileInputStream;
import java.io.IOException;

public class Exception_Compilation_in {
    public static void main(String[] args) {
/***дtry-catch
 * ��Ϊ�˷�ֹ����ʱ�쳣**/
        try {
            FileInputStream fis;
            fis = new FileInputStream("d:\\aa.jpg");
            int len;
            while ((len = fis.read()) != -1) {
                System.out.println(len);
            }
            fis.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    /****�����쳣����
     1) NullPointerException ��ָ���쳣
     2) ArithmeticException ��ѧ�����쳣
     3) ArrayIndexOutOfBoundsException �����±�Խ���쳣
     4) ClassCastException ����ת���쳣
     5) NumberFormatException ���ָ�ʽ����ȷ�쳣[**/
}
