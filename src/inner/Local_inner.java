package inner;


/**
*��ʾ�ֲ��ڲ����ʹ��
 * */


public class Local_inner {
    public static void main(String[] args) {
        //��ʾһ��
        Outer02 outer02 = new Outer02();
        outer02.m1();
        System.out.println("outer02��hashcode=" + outer02);
//        Inner02 inner02 = new Inner02(); //�ⲿ������---���ܷ���----->�ֲ��ڲ���
    }

}
class Outer02 {//�ⲿ��
    private int n1 = 100;
    private void m2() {
        System.out.println("Outer02 m2()");
    }//˽�з���
    public void m1() {//����
        //1.�ֲ��ڲ����Ƕ������ⲿ��ľֲ�λ��,ͨ���ڷ���
        //3.������ӷ������η�,���ǿ���ʹ��final ����
        //4.������ : �����ڶ������ķ�����������
        final class Inner02 {//�ֲ��ڲ���(������Ȼ��һ����)
            //2.����ֱ�ӷ����ⲿ������г�Ա������˽�е�
            private int n1 = 800;
            public void f1() {
                //5. �ֲ��ڲ������ֱ�ӷ����ⲿ��ĳ�Ա���������� �ⲿ��n1 �� m2()
                //7. ����ⲿ��;ֲ��ڲ���ĳ�Ա����ʱ��Ĭ����ѭ�ͽ�ԭ�����������ⲿ��ĳ�Ա��
                //   ʹ�� �ⲿ����.this.��Ա ȥ����
                //   �Ϻ���� Outer02.this ���ʾ����ⲿ��Ķ���, ���ĸ����������m1, Outer02.this�����ĸ�����
                System.out.println("n1=" + n1 + " �ⲿ���n1=" + Outer02.this.n1);
                System.out.println("Outer02.this hashcode=" + Outer02.this);
                m2();
            }
        }
        //6. �ⲿ���ڷ����У����Դ���Inner02����Ȼ����÷�������
        Inner02 inner02 = new Inner02();
        inner02.f1();
    }


}

