package Common.string;

public class StringAndStringBuffer {
    public static void main(String[] args) {
        //�� String����>StringBuffer
        String str = "hello tom";
        //��ʽ1 ʹ�ù�����
        //ע�⣺ ���صĲ���StringBuffer���󣬶�str ����û��Ӱ��
        StringBuffer stringBuffer = new StringBuffer(str);
        //��ʽ2 ʹ�õ���append����
        StringBuffer stringBuffer1 = new StringBuffer();
        stringBuffer1 = stringBuffer1.append(str);

        //���� StringBuffer ->String
        StringBuffer stringBuffer3 = new StringBuffer("����");
        //��ʽ1 ʹ��StringBuffer�ṩ�� toString����
        String s = stringBuffer3.toString();
        //��ʽ2: ʹ�ù��������㶨
        String s1 = new String(stringBuffer3);
    }
}
