package Common.packaging;

public class Method {
    public static void main(String[] args) {
        System.out.println(Integer.MIN_VALUE); //������Сֵ
        System.out.println(Integer.MAX_VALUE);//�������ֵ

        System.out.println(Character.isDigit('a'));//�ж��ǲ������� f
        System.out.println(Character.isLetter('a'));//�ж��ǲ�����ĸ t
        System.out.println(Character.isUpperCase('a'));//�ж��ǲ��Ǵ�д f
        System.out.println(Character.isLowerCase('a'));//�ж��ǲ���Сд t

        System.out.println(Character.isWhitespace('a'));//�ж��ǲ��ǿո� f
        System.out.println(Character.toUpperCase('a'));//ת�ɴ�д A
        System.out.println(Character.toLowerCase('A'));//ת��Сд a
    }
}
