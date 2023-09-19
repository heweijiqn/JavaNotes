package inner;

public class StaticInner {

    public static void main(String[] args) {
        Outer10 outer10 = new Outer10();
        outer10.m1();

        //�ⲿ������ ʹ�þ�̬�ڲ���
        //��ʽ1
        //��Ϊ��̬�ڲ��࣬�ǿ���ͨ������ֱ�ӷ���(ǰ�����������Ȩ��)
        Outer10.Inner10 inner10 = new Outer10.Inner10();
        inner10.say();
        //��ʽ2
        //��дһ�����������Է��ؾ�̬�ڲ���Ķ���ʵ��.
        Outer10.Inner10 inner101 = outer10.getInner10();
        System.out.println("============");
        inner101.say();

        Outer10.Inner10 inner10_ = Outer10.getInner10_();
        System.out.println("************");
        inner10_.say();
    }

}

class Outer10 { //�ⲿ��
    private int n1 = 10;
    private static String name = "����";
    private static void cry() {}
    //Inner10���Ǿ�̬�ڲ���
    //1. �����ⲿ��ĳ�Աλ��
    //2. ʹ��static ����
    //3. ����ֱ�ӷ����ⲿ������о�̬��Ա������˽�еģ�������ֱ�ӷ��ʷǾ�̬��Ա
    //4. �����������������η�(public��protected ��Ĭ�ϡ�private),��Ϊ���ĵ�λ����һ����Ա
    //5. ������ ��ͬ�����ĳ�Ա��Ϊ��������

    static class Inner10 {
        private static String name = "��˳ƽ����";
        public void say() {
            //����ⲿ��;�̬�ڲ���ĳ�Ա����ʱ����̬�ڲ�����ʵ�ʱ��
            //Ĭ����ѭ�ͽ�ԭ�����������ⲿ��ĳ�Ա�������ʹ�� ���ⲿ����.��Ա��
            System.out.println(name + " �ⲿ��name= " + Outer10.name);
            cry();
        }
    }

    public void m1() { //�ⲿ��---����------>��̬�ڲ��� ���ʷ�ʽ�����������ٷ���
        Inner10 inner10 = new Inner10();
        inner10.say();
    }

    public Inner10 getInner10() {
        return new Inner10();
    }

    public static Inner10 getInner10_() {
        return new Inner10();
    }
}

