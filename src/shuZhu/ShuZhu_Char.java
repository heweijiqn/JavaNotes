package shuZhu;

public class ShuZhu_Char {
    public static void main(String[] args){
        char[] chars = new char[26];
        for( int i = 0; i < chars.length; i++) {//ѭ�� 26 ��
        //chars �� char[]
        //chars[i] �� char
            chars[i] = (char)('A' + i); //'A' + i �� int , ��Ҫǿ��ת��
        }
        //ѭ�����
        System.out.println("===chars ����===");
        for( int i = 0; i < chars.length; i++) {//ѭ�� 26 ��
            System.out.print(chars[i] + " ");
        }
    }

}
