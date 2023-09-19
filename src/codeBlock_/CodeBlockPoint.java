package codeBlock_;

public class CodeBlockPoint {
    public static void main(String[] args) {
        //��ʦ˵��
        //(1) ������ļ���
        //1.1 �ȼ��� ���� A02 1.2 �ټ��� B02
        //(2) ��������
        //2.1 ������Ĺ�������ʼ
        // super �Ҹ��� �еľ�̬���Լ�����飬�������ľ�̬���Լ�����飬�ٸ������ͨ���Լ������͹�����������������ͨ���Լ������͹�����
        new B02();//����

        new C02();
    }


}
class A02 { //����
    private static int n1 = getVal01();
    static {
        System.out.println("A02��һ����̬�����..");//(2)
    }
    {
        System.out.println("A02�ĵ�һ����ͨ�����..");//(5)
    }
    public int n3 = getVal02();//��ͨ���Եĳ�ʼ��
    public static int getVal01() {
        System.out.println("getVal01");//(1)
        return 10;
    }

    public int getVal02() {
        System.out.println("getVal02");//(6)
        return 10;
    }

    public A02() {//������
        //����
        //super()
        //��ͨ�������ͨ���Եĳ�ʼ��......
        System.out.println("A02�Ĺ�����");//(7)
    }

}

class C02 {
    private int n1 = 100;
    private static  int n2 = 200;

    private void m1() {

    }
    private static void m2() {

    }

    static {
        //��̬����飬ֻ�ܵ��þ�̬��Ա
        //System.out.println(n1);����
        System.out.println(n2);//ok
        //m1();//����
        m2();
    }
    {
        //��ͨ����飬����ʹ�������Ա
        System.out.println(n1);
        System.out.println(n2);//ok
        m1();
        m2();
    }
}

class B02 extends A02 { //

    private static int n3 = getVal03();

    static {
        System.out.println("B02��һ����̬�����..");//(4)
    }
    public int n5 = getVal04();
    {
        System.out.println("B02�ĵ�һ����ͨ�����..");//(9)
    }

    public static int getVal03() {
        System.out.println("getVal03");//(3)
        return 10;
    }

    public int getVal04() {
        System.out.println("getVal04");//(8)
        return 10;
    }
    //һ��Ҫ������ȥƷ..
    public B02() {//������
        //������
        //super()
        //��ͨ��������ͨ���Եĳ�ʼ��...
        System.out.println("B02�Ĺ�����");//(10)
        // TODO Auto-generated constructor stub
    }
}
