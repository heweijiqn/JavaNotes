package collecting;

import java.util.ArrayList;
import java.util.List;

public class Collecting_Method {
    public static void main(String[] args) {
        List list = new ArrayList();
//        add:��ӵ���Ԫ��
        list.add("jack");
        list.add(10);//list.add(new Integer(10))
        list.add(true);
        System.out.println("list=" + list);
//        remb ove:ɾ��ָ��Ԫ��
        //list.remove(0);//ɾ����һ��Ԫ��
        list.remove(true);//ָ��ɾ��ĳ��Ԫ��
        System.out.println("list=" + list);
//        contains:����Ԫ���Ƿ����
        System.out.println(list.contains("jack"));//T
//        size:��ȡԪ�ظ���
        System.out.println(list.size());//2
//        isEmpty:�ж��Ƿ�Ϊ��
        System.out.println(list.isEmpty());//F
//        clear:���
        list.clear();
        System.out.println("list=" + list);
//        addAll:��Ӷ��Ԫ��
        ArrayList list2 = new ArrayList();
        list2.add("��¥��");
        list2.add("��������");
        list.addAll(list2);
        System.out.println("list=" + list);
//        containsAll:���Ҷ��Ԫ���Ƿ񶼴���
        System.out.println(list.containsAll(list2));//T
//        removeAll��ɾ�����Ԫ��
        list.add("��ի");
        list.removeAll(list2);
        System.out.println("list=" + list);//[��ի]
//        ˵������ArrayListʵ��������ʾ.

    }
}
