package Common.string;

public class String_ {
    public static void main(String[] args) {
        /***1.String �������ڱ����ַ�����Ҳ����һ���ַ�����
        2. "jack" �ַ�������, ˫����������ַ�����
        3. �ַ������ַ�ʹ��Unicode�ַ����룬һ���ַ�(��������ĸ���Ǻ���)ռ�����ֽ�
        4. String ���кܶ๹������������������
           ���õ��� String  s1 = new String(); //
        String  s2 = new String(String original);
        String  s3 = new String(char[] a);
        String  s4 =  new String(char[] a,int startIndex,int count)
        String s5 = new String(byte[] b)
        5. String ��ʵ���˽ӿ� Serializable��String ���Դ��л�:���������紫�䡿
                         �ӿ� Comparable [String ������ԱȽϴ�С]
        6. String ��final �࣬���ܱ���������̳�
        7. String ������ private final char value[]; ���ڴ���ַ�������****/


        String name = "jack";
        name = "tom";
        final char[] value = {'a','b','c'};
        char[] v2 = {'t','o','m'};
        //8. һ��Ҫע�⣺value ��һ��final���ͣ� �������޸�(��Ҫ����)����value����ָ��
        //   �µĵ�ַ�����ǵ����ַ������ǿ��Ա仯
        value[0] = 'H';
//        value = v2; �������޸� value��ַ
        System.out.println(value);

    }
}
