package leiBasis.recrsion;

import leiBasis.recrsion.Recursion;

public class RecursionTest {
    public static void main(String[] ages){
        Recursion i = new Recursion();
        i.text(4);
        int res = i.factorial(5);
        System.out.println("res = " + res);

    }
    /*
    * 执行 一个方法的时候 就会创建一个新受保护的独立空间
    * 方法的局部变量是独立的不会影响比如M变量
    * 如果方法中使用的是引用类型变量比如数组对象就会共享 引用类型的数据
    * 递归必须向退出递归的条件比逼近否则就会出现死循环
    * 当一个方法执行完毕遇到或者 遇到了return 就会返回遵守谁调用就将结果返回给谁同时当方法执行完毕或者返回时该方法也执行完毕
    * */


}
