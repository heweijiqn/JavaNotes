package Common.string;

public class Str {
    public static void main(String[] args) {
        String a = "hello"; //���� a����
        String b = "abc";//���� b����

        //1. �� ����һ�� StringBuilder sb = StringBuilder()
        //2. ִ��  sb.append("hello");
        //3. sb.append("abc");
        //4. String c= sb.toString()
        //�����ʵ�� c ָ����еĶ���(String) value[] -> ���� "helloabc"
        String c = a + b;
        String d = "helloabc";
        System.out.println(c == d);// ��false
        String e = "hello" + "abc";// eָ������ ���������Ż�Ϊ String e = "helloabc";
        System.out.println(d == e);//�滹�Ǽ�? ��true
    }
}
