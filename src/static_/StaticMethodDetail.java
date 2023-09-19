package static_;

public class StaticMethodDetail {
    public static void main(String[] args) {

        D.hi();//ok
        //非静态方法，不能通过类名调用
        //D.say();, 错误，需要先创建对象，再调用
        new D().say();//可以
    }
}
class D {

    private int n1 = 100;
    private static  int n2 = 200;

    /**类变量
    类变量的访问，必须遵守 相关的访问权限.
    public static  String name = "韩顺平教育";
    普通属性/普通成员变量/非静态属性/非静态成员变量/实例变量
    private int num = 10;
     类名.类变量名
      说明：类变量是随着类的加载而创建，所以即使没有创建对象实例也可以访问*/


    public void say() {//非静态方法,普通方法

    }

    public static  void hi() {//静态方法,类方法
        //类方法中不允许使用和对象有关的关键字，
        //比如this和super。普通方法(成员方法)可以。
        //System.out.println(this.n1);
    }

    //类方法(静态方法)中 只能访问 静态变量 或静态方法
    //口诀:静态方法只能访问静态成员.
    public static void hello() {
        System.out.println(n2);
        System.out.println(D.n2);
        //System.out.println(this.n2);不能使用
        hi();//OK
        //say();//错误
    }
    //普通成员方法，既可以访问  非静态成员，也可以访问静态成员
    //小结: 非静态方法可以访问 静态成员和非静态成员
    public void ok() {
        //非静态成员
        System.out.println(n1);
        say();
        //静态成员
        System.out.println(n2);
        hello();

    }
}
