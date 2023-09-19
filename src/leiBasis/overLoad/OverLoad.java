package leiBasis.overLoad;

public class OverLoad {
    public static void main(String[] ages){
        //在主类的 main ()方法中分别用参数区别调用三个重载方法
        OverLoad_1 method = new OverLoad_1();
        method.m(10);
        method.m(19,20);
        method.m("我爱学习");

        System.out.println(method.max(10, 24)); // 24
        System.out.println(method.max(24,10.0 )); // 24.0
        System.out.println(method.max(10.0, 21.4)); // 21.4
        System.out.println(method.max(10.0, 1.4, 30)); // 30.0



        /*
        * 方法名相同
        * 形参列表 必须不同 类型 个数 顺序
        * 返回类型 无要求
        * */

    }




}
