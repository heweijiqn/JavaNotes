package leiBasis.parameter;

public class ParemeterTest {
    public static void main(String[] ages){
        int a = 10;
        int b = 20;
        //创建 paremeter 对象 名字 obj
        Parameter obj = new Parameter();
        obj.swap(a, b); //调用 swap
        System.out.println("main 方法 中 a=" + a + " b=" + b);//a=10 b=2

    }
}
