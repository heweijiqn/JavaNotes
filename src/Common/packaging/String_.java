package Common.packaging;

public class String_ {
    public static void main(String[] args) {
        //��װ��(Integer)->String
        Integer i = 100;//�Զ�װ��
        //��ʽ1
        String str1 = i + "";
        //��ʽ2
        String str2 = i.toString();
        //��ʽ3
        String str3 = String.valueOf(i);

        //String -> ��װ��(Integer)
        String str4 = "12345";
        //ʹ�õ��Զ�װ��
        Integer i2 = Integer.parseInt(str4);
        //������
        Integer i3 = new Integer(str4);

    }
}
