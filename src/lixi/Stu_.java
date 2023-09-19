/**
 * @author ��ΰ��
 * @version 1.0
 * @date 2022/10/26 20:01
 */


package lixi;

import java.util.ArrayList;
import java.util.List;

public class Stu_ {
    public boolean canConstruct(String ransomNote, String magazine) {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < ransomNote.length(); i++) {
            char c = ransomNote.charAt(i);
            if (magazine.contains(String.valueOf(c))) {//�ж�magazine���Ƿ����c
                magazine = magazine.replaceFirst(String.valueOf(c), "");//����������ͽ�magazine�е�c�滻�ɿ��ַ���
                stringBuffer.append(c);
            }
        }
        return ransomNote.equals(stringBuffer.toString());//�ж�ransomNote��stringBuffer�Ƿ����
    }

    public List<String> fizzBuzz(int n) {
        List<String> str = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
               str.add("FizzBuzz");
            } else if (i % 3 == 0) {
                str.add("Fizz");
            } else if (i % 5 == 0) {
                str.add("Buzz");
            } else {
                str.add(String.valueOf(i));
            }
        }

        return str;

    }

    public static void main(String[] args) {
        Stu_ stu_ = new Stu_();
        System.out.println(stu_.fizzBuzz(3));
    }
}
