package mianXiang.poly_.binding;

public class Transformation {
    public static void main(String[] args) {
        //向上转型: 父类的引用指向了子类的对象
        //语法：父类类型引用名 = new 子类类型();

        Zoo animal = new BigCat();
        Object obj = new BigCat();//可以吗? 可以 Object 也是 Cat 的父类

        //向上转型调用方法的规则如下:
        //(1)可以调用父类中的所有成员(需遵守访问权限)
        //(2)但是不能调用子类的特有的成员
        //(#)因为在编译阶段，能调用哪些成员,是由编译类型来决定的
        //animal.catchMouse();错误
        //(4)最终运行效果看子类(运行类型)的具体实现, 即调用方法时，按照从子类(运行类型)开始查找方法
        //，然后调用，规则我前面我们讲的方法调用规则一致。
        animal.eat();//猫吃鱼.. animal.run();//跑
        animal.show();//hello,你好
        animal.sleep();//睡


        //多态的向下转型
        //(1)语法：子类类型 引用名 =（子类类型）父类引用;
        //cat 的编译类型 Cat,运行类型是 Cat
        BigCat cat = (BigCat) animal;
        cat.catchMouse();//猫抓老鼠
        cat.run();//跑
        //(2)要求父类的引用必须指向的是当前目标类型的对象



        //属性没有重写之说！属性的值看编译类型
        // instanceOf 比较操作符，用于判断对象的运行类型是否为 XX 类型或 XX 类型的子类型  布尔

    }
}
class Zoo {
    String name = "动物";
    int age = 10;
    public void sleep(){
        System.out.println("睡");
    }
    public void run(){
        System.out.println("跑");
    }
    public void eat(){
        System.out.println("吃");
    }
    public void show(){
        System.out.println("hello,你好");
    }

}
class BigCat extends Zoo{
    public void eat(){//方法重写
        System.out.println("猫吃鱼");
    }
    public void catchMouse(){//Cat特有方法
        System.out.println("猫抓老鼠");
    }
}
class BigDog extends  Zoo{

}

