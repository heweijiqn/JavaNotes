package Common.string;

public class Method {
    public static void main(String[] args) {

            //1. equals . �Ƚ������Ƿ���ͬ�����ִ�Сд
            String str1 = "hello";
            String str2 = "Hello";
            System.out.println(str1.equals(str2));//

            // 2.equalsIgnoreCase ���Դ�Сд���ж������Ƿ����
            String username = "johN";
            if ("john".equalsIgnoreCase(username)) {
                System.out.println("Success!");
            } else {
                System.out.println("Failure!");
            }
            // 3.length ��ȡ�ַ��ĸ������ַ����ĳ���
            System.out.println("��˳ƽ".length());
            // 4.indexOf ��ȡ�ַ����ַ��������е�һ�γ��ֵ�������������0��ʼ������Ҳ���������-1
            String s1 = "wer@terwe@g";
            int index = s1.indexOf('@');
            System.out.println(index);// 3
            System.out.println("weIndex=" + s1.indexOf("ter"));//0
            // 5.lastIndexOf ��ȡ�ַ����ַ��������һ�γ��ֵ�������������0��ʼ������Ҳ���������-1
            s1 = "wer@terwe@g@";
            index = s1.lastIndexOf('@');
            System.out.println(index);//11
            System.out.println("ter��λ��=" + s1.lastIndexOf("ter"));//4
            // 6.substring ��ȡָ����Χ���Ӵ�
            String name = "hello,����";
            //����name.substring(6) ������6��ʼ��ȡ�������е�����
            System.out.println(name.substring(6));//��ȡ������ַ�
            //name.substring(0,5)��ʾ������0��ʼ��ȡ����ȡ������ 5-1=4λ��
            System.out.println(name.substring(2,5));//llo [2,5)

        }
}
