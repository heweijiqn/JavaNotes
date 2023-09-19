package leiBasis.constructor;

public class Constructor {
    public static void main(String[] ages){
        /* 构造器的修饰符可以默认， 也可以是 public protected private
         构造器没有返回值
         方法名 和类名字必须一样
         参数列表 和 成员方法一样的规则
         构造器的调用, 由系统完成
         方法名和类名相同
         没有返回值
         在创建对象时，系统会自动的调用该类的构造器完成对象的初始化
        */
        ContructorText i1 = new ContructorText();
        System.out.println("i1 的信息 name=" + i1.name + " age=" + i1.age);
        ContructorText i2 = new ContructorText("hwj",20);
        System.out.println("p2 的信息 name=" + i2.name + " age="+ i2.age);

    }
}
