package collecting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


@SuppressWarnings({"all"})
public class Collections_ {
    public static void main(String[] args) {

        //����ArrayList ���ϣ����ڲ���.
        List list = new ArrayList();
        list.add("tom");
        list.add("smith");
        list.add("king");
        list.add("milan");
        list.add("tom");


//        reverse(List)����ת List ��Ԫ�ص�˳��
        Collections.reverse(list);
        System.out.println("list=" + list);
//        shuffle(List)���� List ����Ԫ�ؽ����������
//        for (int i = 0; i < 5; i++) {
//            Collections.shuffle(list);
//            System.out.println("list=" + list);
//        }

//        sort(List)������Ԫ�ص���Ȼ˳���ָ�� List ����Ԫ�ذ���������
        Collections.sort(list);
        System.out.println("��Ȼ�����");
        System.out.println("list=" + list);
//        sort(List��Comparator)������ָ���� Comparator ������˳��� List ����Ԫ�ؽ�������
        //����ϣ������ �ַ����ĳ��ȴ�С����
        Collections.sort(list, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                //���Լ���У�����.
                return ((String) o2).length() - ((String) o1).length();
            }
        });
        System.out.println("�ַ������ȴ�С����=" + list);
//        swap(List��int�� int)����ָ�� list �����е� i ��Ԫ�غ� j ��Ԫ�ؽ��н���

        //����
        Collections.swap(list, 0, 1);
        System.out.println("����������");
        System.out.println("list=" + list);

        //Object max(Collection)������Ԫ�ص���Ȼ˳�򣬷��ظ��������е����Ԫ��
        System.out.println("��Ȼ˳�����Ԫ��=" + Collections.max(list));
        //Object max(Collection��Comparator)������ Comparator ָ����˳�򣬷��ظ��������е����Ԫ��
        //���磬����Ҫ���س�������Ԫ��
        Object maxObject = Collections.max(list, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                return ((String)o1).length() - ((String)o2).length();
            }
        });
        System.out.println("��������Ԫ��=" + maxObject);


        //Object min(Collection)
        //Object min(Collection��Comparator)
        //����������������ο�max����

        //int frequency(Collection��Object)������ָ��������ָ��Ԫ�صĳ��ִ���
        System.out.println("tom���ֵĴ���=" + Collections.frequency(list, "tom"));

        //void copy(List dest,List src)����src�е����ݸ��Ƶ�dest��

        ArrayList dest = new ArrayList();
        //Ϊ�����һ������������������Ҫ�ȸ�dest ��ֵ����С��list.size()һ��
        for(int i = 0; i < list.size(); i++) {
            dest.add("");
        }
        //����
        Collections.copy(dest, list);
        System.out.println("dest=" + dest);

        //boolean replaceAll(List list��Object oldVal��Object newVal)��ʹ����ֵ�滻 List ��������о�ֵ
        //���list�У���tom ���滻�� ��ķ
        Collections.replaceAll(list, "tom", "��ķ");
        System.out.println("list�滻��=" + list);


    }
}
