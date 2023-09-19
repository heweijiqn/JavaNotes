package leiBasis.overLoad;

public class ZhoZai {
	public void max(int a, int b) {
		   
        // 含有两个int类型参数的方法
        System.out.println(a > b ? a : b);
    }
    public void max(double a, double b) {
        // 含有两个double类型参数的方法
        System.out.println(a > b ? a : b);
    }
    public void max(double a, double b, int c) {
        // 含有两个double类型参数和一个int类型参数的方法
        double max = (double) (a > b ? a : b);
        System.out.println(c > max ? c : max);
    }
    public static void main(String[] args) {
        ZhoZai ol = new ZhoZai();
        System.out.println("1 与 5 比较，较大的是：");
        ol.max(1, 5);
        System.out.println("5.205 与 5.8 比较，较大的是：");
        ol.max(5.205, 5.8);
        System.out.println("2.15、0.05、58 中，较大的是：");
        ol.max(2.15, 0.05, 58);
    }
	
	

}
