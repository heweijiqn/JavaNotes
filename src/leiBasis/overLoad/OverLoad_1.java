package leiBasis.overLoad;

public class OverLoad_1 {
    /*
��д������ Methods �ж����������ط���������,������Ϊ m
���������ֱ����һ�� int ���������� int ������һ���ַ����������ֱ�ִ��ƽ�����㲢��������
��˲�������������ַ�����Ϣ

������� main ()�����зֱ��ò������������������
�����������ط��� max()����һ���������������� int ֵ�е����ֵ��
�ڶ����������������� double ֵ�е����ֵ��������������
�������� double ֵ�е����ֵ�����ֱ������������
*/
    public static int max(int n1, int n2){
        return n1 > n2 ? n1 : n2;
    }

    public static double max(double n1, double n2) {
        return n1 > n2 ? n1 : n2;
    }

    public static double max(double n1, double n2, double n3) {
        System.out.println("max(double n1, double n2, double n3)");
        //��� n1 �� n2 �����ֵ
        double max1 = n1 > n2 ? n1 : n2;
        return max1 > n3 ? max1 : n3;
    }

    public static double max(double n1, double n2, int n3) {
        System.out.println("max(double n1, double n2, int n3)");
        //��� n1 �� n2 �����ֵ
        double max1 = n1 > n2 ? n1 : n2;
        return max1 > n3 ? max1 : n3;
    }

    public static void m(int n) {
        System.out.println("ƽ��=" + (n * n));
    }

    public static void m(int n1, int n2) {
        System.out.println("���=" + (n1 * n2));
    }

    public static void m(String str) {
        System.out.println("����� str=" + str);
    }

}
