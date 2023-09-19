package Common.string;

public class StringVsStringBufferVsStringBuilder {
    public static void main(String[] args) {
       /*** 1. StringBuilder �̳� AbstractStringBuilder ��
        2. ʵ���� Serializable ,˵��StringBuilder�����ǿ��Դ��л�(����������紫��,���Ա��浽�ļ�)
        3. StringBuilder ��final��, ���ܱ��̳�
        4. StringBuilder �����ַ�������Ȼ�Ǵ�����丸�� AbstractStringBuilder�� char[] value;
           ��ˣ��ַ������Ƕ���
        5. StringBuilder �ķ�����û��������Ĵ���,��û��synchronized �ؼ���,����ڵ��̵߳������ʹ��
           StringBuilder***/

        long startTime = 0L;
        long endTime = 0L;
        StringBuffer buffer = new StringBuffer("");

        startTime = System.currentTimeMillis();
        for (int i = 0; i < 80000; i++) {//StringBuffer ƴ�� 20000��
            buffer.append(String.valueOf(i));
        }
        endTime = System.currentTimeMillis();
        System.out.println("StringBuffer��ִ��ʱ�䣺" + (endTime - startTime));





        StringBuilder builder = new StringBuilder("");
        startTime = System.currentTimeMillis();
        for (int i = 0; i < 80000; i++) {//StringBuilder ƴ�� 20000��
            builder.append(String.valueOf(i));
        }
        endTime = System.currentTimeMillis();
        System.out.println("StringBuilder��ִ��ʱ�䣺" + (endTime - startTime));


        String text = "";
        startTime = System.currentTimeMillis();
        for (int i = 0; i < 80000; i++) {//String ƴ�� 20000
            text = text + i;
        }
        endTime = System.currentTimeMillis();
        System.out.println("String��ִ��ʱ�䣺" + (endTime - startTime));

    }



}
