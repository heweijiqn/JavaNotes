package Common.string;

public class Str {
    public static void main(String[] args) {
        String a = "hello"; //创建 a对象
        String b = "abc";//创建 b对象

        //1. 先 创建一个 StringBuilder sb = StringBuilder()
        //2. 执行  sb.append("hello");
        //3. sb.append("abc");
        //4. String c= sb.toString()
        //最后其实是 c 指向堆中的对象(String) value[] -> 池中 "helloabc"
        String c = a + b;
        String d = "helloabc";
        System.out.println(c == d);// 是false
        String e = "hello" + "abc";// e指向常量池 编译器会优化为 String e = "helloabc";
        System.out.println(d == e);//真还是假? 是true
    }
}
