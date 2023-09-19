package leiBasis.mothods;

import leiBasis.parameter.Person;

public class PersonTest {
    public static void main(String[] ages){
        //创建 Person 对象
        //p1 是对象名(对象引用)
        //new Person() 创建的对象空间(数据) 才是真正的对象
        Person p1 = new Person();
        //对象的属性默认值，遵守数组规则:
        //int 0，short 0, byte 0, long 0, float 0.0,double 0.0，char \u0000，boolean false，String null
        System.out.println("\n 当前这个人的信息");
        System.out.println("age=" + p1.age + " name=" + p1.name + " sal=" + p1.sal + " isPass " + p1.isPass);
        p1.age = 10;
        Person p2 = p1;
        System.out.println("p1的age");
        System.out.println(p1.age);
        System.out.println("p2的age");
        System.out.println(p2.age);

    }
}
