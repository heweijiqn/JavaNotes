package final_;

public class FinalDetail {
    public static void main(String[] args) {
        CC cc = new CC();

        new EE().cal();
        System.out.println(BBB.num);

/**                                                包装类
 *       byte                            java.lang.Byte             Number
 *       short                           java.lang.Short            Number
 *       Integer                         java.lang.Integer          Number
 *       long                            java.lang.Long             Number
 *       Float                           java.lang.Float            Number
 *       Double                          java.lang.Double           Number
 *       boolean                         java.lang.Boolean          Object
 *       char                            java.lang.Character        Object
 *            包装类,String 是final类，不能被继承
 *
 * */
    }

}
class AA {
    /*
    1. 定义时：如 public final double TAX_RATE=0.08;
    2. 在构造器中
    3. 在代码块中
     */
    public final double TAX_RATE = 0.08;//1.定义时赋值
    public final double TAX_RATE2 ;
    public final double TAX_RATE3 ;

    public AA() {//构造器中赋值
        TAX_RATE2 = 1.1;
    }
    {//在代码块赋值
        TAX_RATE3 = 8.8;
    }
}

class BB {
    /*
    如果final修饰的属性是静态的，则初始化的位置只能是
    1 定义时  2 在静态代码块 不能在构造器中赋值。
     */
    public static final double TAX_RATE = 99.9;
    public static final double TAX_RATE2 ;

    static {
        TAX_RATE2 = 3.3;
    }


}
//final 和 static 往往搭配使用，效率更高，不会导致类加载.底层编译器做了优化处理
class BBB  {
    public final static  int num = 10000;
    public final static String s ="hhh";
    static {
        System.out.println("BBB 静态代码块被执行");
    }
}
final class AAA{
    //一般来说，如果一个类已经是final类了，就没有必要再将方法修饰成final方法
    //public final void cry() {}
}


//final类不能继承，但是可以实例化对象
final class CC {

}


//如果类不是final类，但是含有final方法，则该方法虽然不能重写，但是可以被继承
//即，仍然遵守继承的机制.
class DD {
    public final void cal() {
        System.out.println("cal()方法");
    }
}
class EE extends DD {

}

