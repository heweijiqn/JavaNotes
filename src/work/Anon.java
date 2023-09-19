package work;

public class Anon {
    public static void main(String[] args) {
        Cellphone cellphone = new Cellphone();
        cellphone.testWork(new ICalculate() {
            @Override
            public double work(double n1, double n2) {
                return n1 + n2;
            }
        } ,19, 70);
    }
}
//��д�ӿ�
interface ICalculate {
    public double work(double n1, double n2) ;
}
class Cellphone {
    //�����ǵ���testWork����ʱ��ֱ�Ӵ���һ��ʵ����ICalculate�ӿڵ������ڲ��༴��
    //�������ڲ��࣬��������ʵ��work,��ɲ�ͬ�ļ�������
    public void testWork(ICalculate iCalculate, double n1, double n2) {
        double result = iCalculate.work(n1, n2);//��̬��
        System.out.println("�����Ľ����=" + result);
    }
}