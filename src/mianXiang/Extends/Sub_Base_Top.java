package mianXiang.Extends;

public class Sub_Base_Top {
    public static void main(String[] args) {
        System.out.println("===第1个对象====");
        Sub sub = new Sub(); //创建了子类对象 sub
        System.out.println("===第2个对象====");
        Sub sub2 = new Sub("jack"); //创建了子类对象 sub2
        System.out.println("===第3对象====");
        Sub sub3 = new Sub("king", 10); //创建了子类对象 sub2
        //sub.sayOk();
    }
}
