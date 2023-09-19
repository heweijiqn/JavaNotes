package Common.string;

public class StringBuffer_ {
    public static void main(String[] args) {
        /* 1. StringBuffer 的直接父类 是 AbstractStringBuilder
         2. StringBuffer 实现了 Serializable, 即StringBuffer的对象可以串行化
         3. 在父类中  AbstractStringBuilder 有属性 char[] value,不是final
         该 value 数组存放 字符串内容，引出存放在堆中的
         4. StringBuffer 是一个 final类，不能被继承
         5. 因为StringBuffer 字符内容是存在 char[] value, 所有在变化(增加/删除)
         不用每次都更换地址(即不是每次创建新对象)， 所以效率高于 String***/
        //构造器的使用

        //1. 创建一个 大小为 16的 char[] ,用于存放字符内容
        StringBuffer stringBuffer = new StringBuffer();

        //2 通过构造器指定 char[] 大小
        StringBuffer stringBuffer1 = new StringBuffer(100);

        //3. 通过 给一个String 创建 StringBuffer, char[] 大小就是 str.length() + 16
        StringBuffer hello = new StringBuffer("hello");
    }
}
