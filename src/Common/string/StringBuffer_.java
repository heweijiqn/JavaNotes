package Common.string;

public class StringBuffer_ {
    public static void main(String[] args) {
        /* 1. StringBuffer ��ֱ�Ӹ��� �� AbstractStringBuilder
         2. StringBuffer ʵ���� Serializable, ��StringBuffer�Ķ�����Դ��л�
         3. �ڸ�����  AbstractStringBuilder ������ char[] value,����final
         �� value ������ �ַ������ݣ���������ڶ��е�
         4. StringBuffer ��һ�� final�࣬���ܱ��̳�
         5. ��ΪStringBuffer �ַ������Ǵ��� char[] value, �����ڱ仯(����/ɾ��)
         ����ÿ�ζ�������ַ(������ÿ�δ����¶���)�� ����Ч�ʸ��� String***/
        //��������ʹ��

        //1. ����һ�� ��СΪ 16�� char[] ,���ڴ���ַ�����
        StringBuffer stringBuffer = new StringBuffer();

        //2 ͨ��������ָ�� char[] ��С
        StringBuffer stringBuffer1 = new StringBuffer(100);

        //3. ͨ�� ��һ��String ���� StringBuffer, char[] ��С���� str.length() + 16
        StringBuffer hello = new StringBuffer("hello");
    }
}
