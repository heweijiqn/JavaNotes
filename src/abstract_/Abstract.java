package abstract_;

public class Abstract {
    public static void main(String[] args) {
        //抽象类，不能被实例化
        //new A();
    }

}
/**引出抽象类
 * */



abstract class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    //思考：这里eat 这里你实现了，其实没有什么意义
    //即： 父类方法不确定性的问题
    //===> 考虑将该方法设计为抽象(abstract)方法
    //===> 所谓抽象方法就是没有实现的方法
    //===> 所谓没有实现就是指，没有方法体
    //===> 当一个类中存在抽象方法时，需要将该类声明为abstract类
    //===> 一般来说，抽象类会被继承，有其子类来实现抽象方法.
//    public void eat() {
//        System.out.println("这是一个动物，但是不知道吃什么..");
//    }
    public abstract void eat()  ;
}




//抽象类不一定要包含abstract方法。也就是说,抽象类可以没有abstract方法
//，还可以有实现的方法
abstract class A {
    public void hi() {
        System.out.println("hi");
    }
}
//一旦类包含了abstract方法,则这个类必须声明为abstract
abstract class B {
    public abstract void hi();
}
//abstract 只能修饰类和方法，不能修饰属性和其它的
class C {
    // public abstract int n1 = 1;
}

//抽象方法不能使用private、final 和 static来修饰，因为这些关键字都是和重写相违背的
abstract class H {
    public   abstract void hi();//抽象方法
}

//如果一个类继承了抽象类，则它必须实现抽象类的所有抽象方法，除非它自己也声明为abstract类
abstract class E {
    public abstract void hi();
}
abstract class F extends E {

}
class G extends E {
    @Override
    public void hi() { //这里相等于G子类实现了父类E的抽象方法，所谓实现方法，就是有方法体

    }
}

//抽象类的本质还是类，所以可以有类的各种成员
abstract class D {
    public int n1 = 10;
    public static  String name = "韩顺平教育";
    public void hi() {
        System.out.println("hi");
    }
    public abstract void hello();
    public static void ok() {

        System.out.println("ok");
    }
}