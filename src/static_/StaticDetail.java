package static_;

public class StaticDetail {
    public static void main(String[] args) {
        B b = new B();
        //System.out.println(B.n1);
        System.out.println(B.n2);

        //��̬����������ص�ʱ�򣬾ʹ�����,��������û�д�������ʵ��
        //Ҳ����ͨ������.�������������
        System.out.println(C.address);

    }
}
class B {
    public  int n1 = 100;
    public static int n2 = 200;
}

class C {
    public static String address = "����";
}