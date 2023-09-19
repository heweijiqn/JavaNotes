package mianXiang.super_;

public class B extends A {
    public int n1 = 888;

    //��д���Է���
    public void test() {
        //super�ķ��ʲ�����ֱ�Ӹ��࣬���үү��ͱ�������ͬ���ĳ�Ա��Ҳ����ʹ��superȥ����үү��ĳ�Ա��
        // ����������(�ϼ���)�ж���ͬ���ĳ�Ա��ʹ��super������ѭ�ͽ�ԭ��A->B->C

        System.out.println("super.n1=" + super.n1);
        super.cal();
    }

    //���ʸ�������� , �����ܷ��ʸ����private���� [����]super.������
    public void hi() {
        System.out.println(super.n1 + " " + super.n2 + " " + super.n3 );
    }
    public void cal() {
        System.out.println("B���cal() ����...");
    }
    public void sum() {
        System.out.println("B���sum()");
        //ϣ�����ø���-A ��cal����
        //��ʱ����Ϊ����Bû��cal����������ҿ���ʹ���������ַ�ʽ

        //��cal����ʱ(cal() �� this.cal())��˳����:
        // (1)���ұ��࣬����У������
        // (2)���û�У����Ҹ���(����У������Ե��ã������)
        // (3)�������û�У�������Ҹ���ĸ���,�������򣬾���һ����,ֱ�� Object��
        // ��ʾ��������ҷ����Ĺ����У��ҵ��ˣ����ǲ��ܷ��ʣ� �򱨴�, cannot access
        //      ������ҷ����Ĺ����У�û���ҵ�������ʾ����������
        //cal();
        this.cal(); //�ȼ� cal

        //��cal����(super.call()) ��˳����ֱ�Ӳ��Ҹ��࣬�����Ĺ���һ��
        //super.cal();

        //��ʾ�������ԵĹ���
        //n1 �� this.n1 ���ҵĹ�����
        //(1) ���ұ��࣬����У������
        //(2) ���û�У����Ҹ���(����У������Ե��ã������)
        //(3) �������û�У�������Ҹ���ĸ���,�������򣬾���һ����,ֱ�� Object��
        // ��ʾ������������ԵĹ����У��ҵ��ˣ����ǲ��ܷ��ʣ� �򱨴�, cannot access
        //      ����������ԵĹ����У�û���ҵ�������ʾ���Բ�����
        System.out.println(n1);
        System.out.println(this.n1);

        //��n1 (super.n1) ��˳����ֱ�Ӳ��Ҹ������ԣ������Ĺ���һ��
        System.out.println(super.n1);

    }
    //���ʸ���ķ��������ܷ��ʸ����private���� super.������(�����б�);
    public void ok() {
        super.test100();
        super.test200();
        super.test300();
        //super.test400();//���ܷ��ʸ���private����
    }
    //���ʸ���Ĺ�����(���ǰ���ù�)��super(�����б�);ֻ�ܷ��ڹ������ĵ�һ�䣬ֻ�ܳ���һ�䣡
    public  B() {
        //super();
        //super("jack", 10);
        super("jack");
    }

}
