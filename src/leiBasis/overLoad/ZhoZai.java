package leiBasis.overLoad;

public class ZhoZai {
	public void max(int a, int b) {
		   
        // ��������int���Ͳ����ķ���
        System.out.println(a > b ? a : b);
    }
    public void max(double a, double b) {
        // ��������double���Ͳ����ķ���
        System.out.println(a > b ? a : b);
    }
    public void max(double a, double b, int c) {
        // ��������double���Ͳ�����һ��int���Ͳ����ķ���
        double max = (double) (a > b ? a : b);
        System.out.println(c > max ? c : max);
    }
    public static void main(String[] args) {
        ZhoZai ol = new ZhoZai();
        System.out.println("1 �� 5 �Ƚϣ��ϴ���ǣ�");
        ol.max(1, 5);
        System.out.println("5.205 �� 5.8 �Ƚϣ��ϴ���ǣ�");
        ol.max(5.205, 5.8);
        System.out.println("2.15��0.05��58 �У��ϴ���ǣ�");
        ol.max(2.15, 0.05, 58);
    }
	
	

}
