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
//编写接口
interface ICalculate {
    public double work(double n1, double n2) ;
}
class Cellphone {
    //当我们调用testWork方法时，直接传入一个实现了ICalculate接口的匿名内部类即可
    //该匿名内部类，可以灵活的实现work,完成不同的计算任务
    public void testWork(ICalculate iCalculate, double n1, double n2) {
        double result = iCalculate.work(n1, n2);//动态绑定
        System.out.println("计算后的结果是=" + result);
    }
}