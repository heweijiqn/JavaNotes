package Common.string;

public class StringExercise {
    public static void main(String[] args) {
        String a = "hsp"; //a 指向 常量池的 “hsp”
        String b =new String("hsp");//b 指向堆中对象  value再指向常量池的 “hsp”
        System.out.println(a.equals(b)); //T
        System.out.println(a==b); //F
        //b.intern() 方法返回常量池地址
        System.out.println(a==b.intern()); //T 比较内容:
        System.out.println(b==b.intern()); //F

    }
}
