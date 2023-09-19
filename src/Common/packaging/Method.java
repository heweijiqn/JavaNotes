package Common.packaging;

public class Method {
    public static void main(String[] args) {
        System.out.println(Integer.MIN_VALUE); //返回最小值
        System.out.println(Integer.MAX_VALUE);//返回最大值

        System.out.println(Character.isDigit('a'));//判断是不是数字 f
        System.out.println(Character.isLetter('a'));//判断是不是字母 t
        System.out.println(Character.isUpperCase('a'));//判断是不是大写 f
        System.out.println(Character.isLowerCase('a'));//判断是不是小写 t

        System.out.println(Character.isWhitespace('a'));//判断是不是空格 f
        System.out.println(Character.toUpperCase('a'));//转成大写 A
        System.out.println(Character.toLowerCase('A'));//转成小写 a
    }
}
