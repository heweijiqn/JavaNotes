package mianXiang.poly_.mothod;

public class PloyMethod {
    public static void main(String[] args) {
    //�����������ֶ�̬
        A a = new A();
    //�������Ǵ��벻ͬ�Ĳ������ͻ���ò�ͬ sum �����������ֶ�̬
        System.out.println(a.sum(10, 20));
        System.out.println(a.sum(10, 20, 30));
    //������д���ֶ�̬
        B b = new B();
        a.say();
        b.say();

    }
}

    class B { //����

        public B() {
            System.out.println("B");
        }

        public void say() {
            System.out.println("B say() ����������...");
        }
    }

    class A extends B {//����


        public A() {
            System.out.println("A");
        }

        public int sum(int n1, int n2) {//������ sum ��������
            return n1 + n2;
        }

        public int sum(int n1, int n2, int n3) {
            return n1 + n2 + n3;
        }

        public void say() {
            System.out.println("A say() ����������...");
        }
    }