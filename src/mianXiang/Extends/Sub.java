package mianXiang.Extends;

public class Sub extends Base{
    public Sub(String name, int age) {
        //1. ��ʦҪ���ø�����޲ι�����, ���»��� ʲô����д,Ĭ�Ͼ��ǵ���super()
        //super();//������޲ι�����
        //2. ��ʦҪ���ø���� Base(String name) ������
        //super("hsp");
        //3. ��ʦҪ���ø���� Base(String name, int age) ������
        super("king", 20);

        //ϸ�ڣ� super��ʹ��ʱ��������ڹ�������һ��
        //ϸ��: super() �� this() ��ֻ�ܷ��ڹ�������һ�У�����������������ܹ�����һ��������
        //this() ������ʹ����
        System.out.println("����Sub(String name, int age)������������....");


    }

    public Sub() {//�޲ι�����
        //super(); //Ĭ�ϵ��ø�����޲ι�����
        super("smith", 10);
        System.out.println("����Sub()������������....");
    }
    //�������������ʱ������ʹ��������ĸ���������Ĭ��������ܻ�ȥ���ø�����޲ι�����
    public Sub(String name) {
        super("tom", 30);
        //do nothing...
        System.out.println("����Sub(String name)������������....");
    }

    public void sayOk() {//���෽��
        //��˽�е����Ժͷ�������������ֱ�ӷ���
        //����˽�����Ժͷ�������������ֱ�ӷ���
        System.out.println(n1 + " " + n2 + " " + n3);
        test100();
        test200();
        test300();
        //test400();����
        //Ҫͨ�������ṩ�����ķ���ȥ����
        System.out.println("n4=" + getN4());
        callTest400();//
    }

}
