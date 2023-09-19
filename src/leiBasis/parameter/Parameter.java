package leiBasis.parameter;

public class Parameter {
    public void swap(int a,int b){
        System.out.println("\na 和 b 交换前的值\na=" + a + "\tb=" + b);//a=10 b=20
        //完成了 a 和 b 的交换
        int tmp = a;
        a = b;
        b = tmp;
        System.out.println("\na 和 b 交换后的值\na=" + a + "\tb=" + b);//a=20 b=10
    }
}
