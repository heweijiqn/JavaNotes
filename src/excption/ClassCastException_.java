package excption;

public class ClassCastException_ {
    public static void main(String[] args) {
        A b = new B(); //����ת��
        B b2 = (B)b;//����ת�ͣ�������OK
        C c2 = (C)b;//�����׳�ClassCastException
    }


}

class A {

}
class B extends A {

}
class C extends A {

}

