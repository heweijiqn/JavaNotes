package Common.string;

public class StringExercise {
    public static void main(String[] args) {
        String a = "hsp"; //a ָ�� �����ص� ��hsp��
        String b =new String("hsp");//b ָ����ж���  value��ָ�����ص� ��hsp��
        System.out.println(a.equals(b)); //T
        System.out.println(a==b); //F
        //b.intern() �������س����ص�ַ
        System.out.println(a==b.intern()); //T �Ƚ�����:
        System.out.println(b==b.intern()); //F

    }
}
