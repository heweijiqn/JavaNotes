package static_;

public class StaticMethod {
    public static void main(String[] args) {
        //����2��ѧ�����󣬽�ѧ��
        Stu tom = new Stu("tom");
        //tom.payFee(100);
        Stu.payFee(100);//�Բ���?��

        Stu mary = new Stu("mary");
        //mary.payFee(200);
        Stu.payFee(200);//��


        //�����ǰ�յ�����ѧ��
        Stu.showFee();//300

        //�������ϣ��������ʵ����Ҳ���Ե���ĳ������(������������ʹ��)
        //��ʱ���ѷ������ɾ�̬����ʱ�ǳ�����
        System.out.println("9��ƽ���Ľ����=" + Math.sqrt(9));


        System.out.println(MyTools.calSum(10, 30));
    }

}
//�����Լ��Ĺ�����ʱ�����Խ��������ɾ�̬�ģ��������
class MyTools  {
    //����������ĺ�
    public static double calSum(double n1, double n2) {
        return  n1 + n2;
    }
    //����д���ܶ������Ĺ��߷���...
}
class Stu {
    private String name;//��ͨ��Ա
    //����һ����̬���������ۻ�ѧ����ѧ��
    private static double fee = 0;

    public Stu(String name) {
        this.name = name;
    }
    //˵��
    //1. ������ʹ����static���κ󣬸÷������Ǿ�̬����
    //2. ��̬�����Ϳ��Է��ʾ�̬����/����
    public static void payFee(double fee) {
        Stu.fee += fee;//�ۻ���
    }
    public static void showFee() {
        System.out.println("��ѧ����:" + Stu.fee);
    }
}