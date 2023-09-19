/**
 * @author ��ΰ��
 * @version 1.0
 * @date 2022/10/3 0:21
 */


package lixi.zhan;

import java.util.Stack;

@SuppressWarnings("all")
public class Palindrome {
    public static void main(String[] args) {
        String s = new String();
        s = "123321";
       if (isPalindrome(s)){
           System.out.println("�ǻ���");
         }else {
              System.out.println("���ǻ���");
       }



    }
    /**
     *
     * @param s
     * @return
     */
    public static boolean isPalindrome(String s){
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            stack.push(s.charAt(i));
        }
        //i--
        for (int i = 0; i < s.length(); i++) {
            if (stack.pop() != s.charAt(i)){
                return false;
            }
        }

        return true;
    }

}
