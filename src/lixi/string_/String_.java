/**
 * @author 何伟健
 * @version 1.0
 * @date 2022/10/16 18:24
 */


package lixi.string_;

public class String_ {
    public static void main(String[] args) {
        System.out.println(max("teats"));

    }
    public static int max(String s){
        int n = s.length();
        char s1= s.charAt(0);
        int count = 1;//记录字符出现的次数 防止第一个字符就是最大的
        for (int i = 1; i < n; i++) {
                if(s1<s.charAt(i)){
                    s1 = s.charAt(i);
                    count=1;
                }else if (s1==s.charAt(i)){
                    count++;
            }
        }
        return count;
    }
}
