package leiBasis;

public class VarScope {
    public static void main(String[] ages){
       VarScope p1 = new VarScope();
		/*
		�����������ڽϳ��������Ŷ���Ĵ����������������Ŷ�������ٶ����١�
		�ֲ��������������ڽ϶̣����������Ĵ�����ִ�ж�������
		�����Ŵ����Ľ��������١�����һ�η������ù�����
		 */
        //p1.say();//��ִ��say����ʱ��say�����ľֲ���������name,�ᴴ������sayִ����Ϻ�
        //name�ֲ�����������,��������(ȫ�ֱ���)��Ȼ����ʹ��
        //
        VarScope t1 = new VarScope();
        t1.test(); //��1�ֿ�����ʶ������Եķ�ʽ

        t1.test2(p1);//��2�ֿ�����ʶ������Եķ�ʽ

    }
    //ȫ�ֱ�����Ҳ�������ԣ�������Ϊ�������� Cat�ࣺcry eat �ȷ���ʹ������
    //�����ڶ���ʱ������ֱ�Ӹ�ֵ
    int age = 10; //ָ����ֵ�� 10

    //ȫ�ֱ���(����)���Բ���ֵ��ֱ��ʹ�ã���Ϊ��Ĭ��ֵ��
    double weight;  //Ĭ��ֵ��0.0

    public void h() {
        //�ֲ��������븳ֵ�󣬲���ʹ�ã���Ϊû��Ĭ��ֵ
        int num = 1;
        String address = "������è";
        System.out.println("num=" + num);
        System.out.println("address=" + address);
        System.out.println("weight=" + weight);//����
    }

    public void cry() {
        //1. �ֲ�����һ����ָ�ڳ�Ա�����ж���ı���
        //2. n ��  name ���Ǿֲ�����
        //3. n �� name���������� cry������
        int n = 10;
        String name = "jack";
        System.out.println("��cry��ʹ������ age=" + age);
    }

    public void eat() {

        System.out.println("��eat��ʹ������ age=" + age);


        //System.out.println("��eat��ʹ�� cry�ı��� name=" + name);//����
    }
    //ȫ�ֱ���/���ԣ����Ա�����ʹ�ã���������ʹ�ã�ͨ���������)
    public void test() {
        VarScope p1 = new VarScope();
        System.out.println(p1.name);//jack
    }

    public void test2(VarScope p) {
        System.out.println(p.name);//jack
    }
    //ϸ��: ���Կ��Լ����η�(public protected private..)
    //      �ֲ��������ܼ����η�
    public int age1 = 20;

    String name = "jack";

    public void say() {
        //ϸ�� ���Ժ;ֲ�������������������ʱ��ѭ�ͽ�ԭ��
        String name = "king";
        System.out.println("say() name=" + name);
    }

    public void hi() {
        String address = "����";
        //String address = "�Ϻ�";//����,�ظ��������
        String name = "hsp";//����
    }
}
