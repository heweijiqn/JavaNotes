package collecting.list_;

import java.util.ArrayList;
import java.util.List;

public class ListMethod {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("������");
        list.add("�ֱ���");
//        void add(int index, Object ele):��indexλ�ò���eleԪ��
        //��index = 1��λ�ò���һ������
        list.add(1, "��˳ƽ");
        System.out.println("list=" + list);
//        boolean addAll(int index, Collection eles):��indexλ�ÿ�ʼ��eles�е�����Ԫ����ӽ���
        List list2 = new ArrayList();
        list2.add("jack");
        list2.add("tom");
        list.addAll(1, list2);//��index = 1��λ�ò���һ������
        System.out.println("list=" + list);
//        Object get(int index):��ȡָ��indexλ�õ�Ԫ��
        //˵��
//        int indexOf(Object obj):����obj�ڼ������״γ��ֵ�λ��
        System.out.println(list.indexOf("tom"));//2
//        int lastIndexOf(Object obj):����obj�ڵ�ǰ������ĩ�γ��ֵ�λ��
        list.add("��˳ƽ");
        System.out.println("list=" + list);
        System.out.println(list.lastIndexOf("��˳ƽ"));
//        Object remove(int index):�Ƴ�ָ��indexλ�õ�Ԫ�أ������ش�Ԫ��
        list.remove(0);
        System.out.println("list=" + list);
//        Object set(int index, Object ele):����ָ��indexλ�õ�Ԫ��Ϊele , �൱�����滻.
        list.set(1, "����");
        System.out.println("list=" + list);
//        List subList(int fromIndex, int toIndex):���ش�fromIndex��toIndexλ�õ��Ӽ���
        // ע�ⷵ�ص��Ӽ��� fromIndex <= subList < toIndex
        List returnlist = list.subList(0, 2);
        System.out.println("returnlist=" + returnlist);

    }
}
