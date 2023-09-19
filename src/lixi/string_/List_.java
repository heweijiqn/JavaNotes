/**
 * @author ºÎÎ°½¡
 * @version 1.0
 * @date 2022/10/16 18:48
 */


package lixi.string_;

public class List_ {
    public static void main(String[] args) {
        System.out.println( delete("hello world", "l"));

    }
    public static String delete(String str,String s){
        int index = str.indexOf(s);
        if (index == -1){
            return str;
        }
        return str.substring(0,index) + delete(str.substring(index+s.length()),s);
    }
}