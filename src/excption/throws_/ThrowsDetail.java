package excption.throws_;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsDetail {
    public static void main(String[] args) /*throws ArithmeticException*/ {
        f2();
    }

    public static void f2() /*throws ArithmeticException*/ {
        //1.���ڱ����쳣�������б��봦������ try-catch ���� throws
        //2.��������ʱ�쳣�����������û�д���Ĭ�Ͼ���throws�ķ�ʽ����

        int n1 = 10;
        int n2 = 0;
        double res = n1 / n2;
    }

    public static void f1() throws FileNotFoundException {
        // ����f3() ����

        //1. ��Ϊf3() �����׳�����һ�������쳣
        //2. ����ʱ����Ҫf1() ���봦����������쳣
        //3. ��f1() �У�Ҫô try-catch-finally ,���߼���throws ��������쳣
        f3(); // �׳��쳣
    }
    public static void f3() throws FileNotFoundException {
        FileInputStream fis = new FileInputStream("d://aa.txt");
    }

    public static void f4() {

        //1. ��f4()�е��÷���f5() ��OK
        //2. ԭ����f5() �׳����������쳣
        //3. ��java�У�����Ҫ�����Ա��ʾ����,��Ϊ��Ĭ�ϴ������
        f5();
    }
    public static void f5() throws ArithmeticException {

    }


}


class Father { //����
    public void method() throws RuntimeException {
    }
}

class Son extends Father {//����
    //3. ������д����ķ���ʱ�����׳��쳣�Ĺ涨:������д�ķ�����
    //   ���׳����쳣����Ҫô�͸����׳����쳣һ�£�ҪôΪ�����׳����쳣���͵�������
    //4. ��throws �����У�����з��� try-catch , ���൱�ڴ����쳣���Ϳ��Բ���throws
    @Override
    public void method() throws ArithmeticException {
    }
}
