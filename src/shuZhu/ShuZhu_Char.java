package shuZhu;

public class ShuZhu_Char {
    public static void main(String[] args){
        char[] chars = new char[26];
        for( int i = 0; i < chars.length; i++) {//循环 26 次
        //chars 是 char[]
        //chars[i] 是 char
            chars[i] = (char)('A' + i); //'A' + i 是 int , 需要强制转换
        }
        //循环输出
        System.out.println("===chars 数组===");
        for( int i = 0; i < chars.length; i++) {//循环 26 次
            System.out.print(chars[i] + " ");
        }
    }

}
