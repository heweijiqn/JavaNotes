package inner;

public class AnonymousInnerClassDetail {
    public static void main(String[] args) {

        Outer05 outer05 = new Outer05();
        outer05.f1();
        //�ⲿ������---���ܷ���----->�����ڲ���
        System.out.println("main outer05 hashcode=" + outer05);

    }

}

class Outer05 {
    private int n1 = 99;
    public void f1() {
        //����һ��������������ڲ���
        //������ӷ������η�,��Ϊ���ĵ�λ����һ���ֲ�����
        //������ : �����ڶ������ķ�����������
        Person p = new Person(){//�����ڲ���
            private int n1 = 88;
            @Override
            public void hi() {
                //����ֱ�ӷ����ⲿ������г�Ա������˽�е�
                //����ⲿ��������ڲ���ĳ�Ա����ʱ�������ڲ�����ʵĻ���
                //Ĭ����ѭ�ͽ�ԭ�����������ⲿ��ĳ�Ա�������ʹ�� ���ⲿ����.this.��Ա��ȥ����
                System.out.println("�����ڲ�����д�� hi���� n1=" + n1 +
                        " �ⲿ�ڵ�n1=" + Outer05.this.n1 );
                //Outer05.this ���ǵ��� f1�� ����
                System.out.println("Outer05.this hashcode=" + Outer05.this);
            }
        };


        //Ҳ����ֱ�ӵ���, �����ڲ��౾��Ҳ�Ƿ��ض���
        // class �����ڲ��� extends Person {}
        new Person(){//�����ڲ���
            @Override
            public void hi() {
                System.out.println("�����ڲ�����д�� hi����,����...");
            }
            @Override
            public void ok(String str) {
                super.ok(str);
            }
        }.ok("jack");
        System.out.println("�����ڲ����hashcode=" + p);

        p.hi();//��̬��, ���������� Outer05$1--->�����ڲ���



    }



}

class Person {//��
    public void hi() {
        System.out.println("Person hi()");
    }
    public void ok(String str) {
        System.out.println("Person ok() " + str);
    }
}
//������/�ӿ�...
