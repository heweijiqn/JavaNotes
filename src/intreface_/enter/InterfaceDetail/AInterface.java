package intreface_.enter.InterfaceDetail;

public interface AInterface {
    //д����
    public int n1 = 10;
    //д����
    //�ڽӿ��У����󷽷�������ʡ��abstract�ؼ���
    public void hi();

    //��jdk8�󣬿�����Ĭ��ʵ�ַ���(�з����� ),��Ҫʹ��default�ؼ�������
    default public void ok() {
        System.out.println("ok ...");
    }
    //��jdk8��, �����о�̬����
    public static void cry() {
        System.out.println("cry ....");
    }
}
