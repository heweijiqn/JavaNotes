package Common.packaging;

public class Integer_ {
    public static void main(String[] args) {
        //��ʾint <--> Integer ��װ��Ͳ���
        //jdk5ǰ���ֶ�װ��Ͳ���
        //�ֶ�װ�� int->Integer
        int n1 = 100;
        Integer integer = new Integer(n1);
        Integer integer1 = Integer.valueOf(n1);

        //�ֶ�����
        //Integer -> int
        int i = integer.intValue();

        //jdk5�󣬾Ϳ����Զ�װ����Զ�����
        int n2 = 200;
        //�Զ�װ�� int->Integer
        Integer integer2 = n2; //�ײ�ʹ�õ��� Integer.valueOf(n2)
        //�Զ����� Integer->int
        int n3 = integer2; //�ײ���Ȼʹ�õ��� intValue()����



    }
}
