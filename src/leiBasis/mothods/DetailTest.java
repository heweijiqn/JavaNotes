package leiBasis.mothods;

public class DetailTest {
    public static void main(String[] ages){
        Detail a = new Detail();
        int[] res = a.getSumAndSub(1, 4);
        System.out.println("��=" + res[0]);
        System.out.println("��=" + res[1]);

        //ϸ��: ���ô������ķ���ʱ��һ����Ӧ�Ų����б�����ͬ���ͻ�������� �Ĳ���
        byte b1 = 1;
        byte b2 = 2;
        a.getSumAndSub(b1, b2);//byte -> int
        //a.getSumAndSub(1.1, 1.8);//double ->int(��)
        //ϸ��: ʵ�κ��βε�����Ҫһ�»���ݡ�������˳�����һ��

        //a.getSumAndSub(100);//�� ������һ��
        a.f3("tom", 10); //ok
        //a.f3(100, "jack"); // ʵ�ʲ�������ʽ����˳�򲻶�


    }
    /*? �������η� (�����ǿ��� ����ʹ�õķ�Χ)
        �����дĬ�Ϸ��ʣ�[������: public, protected, Ĭ��, private]
        ? ������������
        1) һ�����������һ������ֵ [˼������η��ض����� �������� ]
        2) �������Ϳ���Ϊ�������ͣ������������ͻ���������(���飬����)
        3) �������Ҫ���з����������ͣ��򷽷���������ִ��������Ϊ return ֵ; ����Ҫ�󷵻�ֵ���ͱ���� return ��
        ֵ����һ�»����
        4) ��������� void���򷽷����п���û�� return ��䣬���� ֻд return ;
        ? ������
        ��ѭ�շ�����������ü���֪�壬�����ù��ܵ���˼����, ���� �õ��������ĺ� getSum, �����а��չ�*/
}
