package intreface_.enter.InterfaceExercise;

public class InterfaceExercise {
}
interface A {
    int x = 0;
}  //--- �ȼ� public static final int x = 0;

class B {
    int x = 1;
} //��ͨ����

class C extends B implements A {
    public void pX() {
        //System.out.println(x); //����ԭ����ȷx
        //������ȷ��ָ��x
        //���ʽӿڵ� x ��ʹ�� A.x
        //���ʸ���� x ��ʹ�� super.x
        System.out.println(A.x + " " + super.x);
    }

    public static void main(String[] args) {
        new C().pX();
    }
}

