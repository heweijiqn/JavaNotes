package leiBasis.mothods;

public class Detail {
    //ϸ��: ��������Ƕ�׶���
    public void detail1() {
    //����
    // public void detail2() {
    // }
    }
    public void f3(String str, int n) {

    }
    //1. һ�����������һ������ֵ [˼������η��ض����� ��������]
    public int[] getSumAndSub(int n1, int n2) {
        int[] resArr = new int[2]; //
        resArr[0] = n1 + n2;
        resArr[1] = n1 - n2;
        return resArr;
    }
    //2. �������Ϳ���Ϊ�������ͣ������������ͻ���������(���飬����)
    // ���忴 getSumAndSub
    //
    //3. �������Ҫ���з����������ͣ��򷽷���������ִ��������Ϊ return ֵ;
    // ����Ҫ�󷵻�ֵ���ͱ���� return ��ֵ����һ�»����
    public double f1() {
        double d1 = 1.1 * 3;
        int n = 100;
        return n;
        // int ->double
        //return d1 (double -> int) ���ǲ��е�
    }
    //��������� void���򷽷����п���û�� return ��䣬���� ֻд return ;
    //��ʾ����ʵ�ʹ����У����ǵķ�������Ϊ�����ĳ�����ܣ����Է�����Ҫ��һ������
    //������Ǽ���֪��
    public void f2() {
        System.out.println("hello1");
        System.out.println("hello1");
        System.out.println("hello1");
        int n = 10;
        //return ;
    }

}
