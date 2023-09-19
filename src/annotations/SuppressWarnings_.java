package annotations;

import java.util.ArrayList;
import java.util.List;

public class SuppressWarnings_ {

    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("jack");
        list.add("tom");
        list.add("mary");
        int i;
        System.out.println(list.get(1));

    }

    public void f1() {
/****       @SuppressWarnings({"rawtypes"})***/
        List list = new ArrayList();


        list.add("jack");
        list.add("tom");
        list.add("mary");
/****      @SuppressWarnings({"unused"})****/
        int i;
        System.out.println(list.get(1));
    }
}




/****1. �����ǲ�ϣ��������Щ�����ʱ�򣬿���ʹ�� SuppressWarningsע�������ƾ�����Ϣ
2. ��{""} �У�����д����ϣ������(����ʾ)������Ϣ
3. ����ָ���ľ���������
        all���������о���
        boxing���������װ/��װ��ҵ��صľ���
        cast��������ǿ��ת����ҵ��صľ���
        dep-ann����������̭ע����صľ���
        deprecation����������̭����ؾ���
        fallthrough��������switch����ʽ����©break��صľ���
        finally��������δ����finally������صľ���
        hiding�����������ر��������������صľ���
        incomplete-switch��������switch����ʽ(enum case)����©��Ŀ��صľ���
        javadoc��������javadoc��صľ���
        nls���������nls�ִ�������صľ���
        null���������ֵ������صľ���
        rawtypes��������ʹ��raw������صľ���
        resource��������ʹ��Closeable���͵���Դ��صľ���
        restriction��������ʹ�ò�������ֹ������صľ���
        serial������������л��������©serialVersionUID��λ��صľ���
        static-access�������뾲̬��ȡ����ȷ��صľ���
        static-method���������������Ϊstatic�ķ�����صľ���
        super���������û�������ص�����super���еľ���
        synthetic-access���������ڲ����Ĵ�ȡδ��ѻ���صľ���
        sync-override��������Ϊ�û�ͬ����������©ͬ�����ľ���
        unchecked��������δ������ҵ��صľ���
        unqualified-field-access����������λ��ȡ���ϸ���صľ���
        unused��������δ�õĳ�ʽ�뼰ͣ�õĳ�ʽ����صľ���
4. ����SuppressWarnings ���÷�Χ�Ǻ�����õ�λ�����
   ���� @SuppressWarnings������ main��������ô���ƾ���ķ�Χ���� main
   ͨ�����ǿ��Է��þ�������, ����, ��.
5.  ���� @SuppressWarnings Դ��
(1) ���õ�λ�þ��� TYPE, FIELD, METHOD, PARAMETER, CONSTRUCTOR, LOCAL_VARIABLE
(2) ��ע���������� String[] values() ����һ��������� {"rawtypes", "unchecked", "unused"}
    /*
        @Target({TYPE, FIELD, METHOD, PARAMETER, CONSTRUCTOR, LOCAL_VARIABLE})
            @Retention(RetentionPolicy.SOURCE)
            public @interface SuppressWarnings {

                String[] value();
        }
     */
     // Ԫע��
//        1) Retention //ָ��ע������÷�Χ������ SOURCE,CLASS,RUNTIME
//        2) Target // ָ��ע���������Щ�ط�ʹ��
//        3) Documented //ָ����ע���Ƿ���� javadoc ����
//        4) Inherited //�����̳и���
