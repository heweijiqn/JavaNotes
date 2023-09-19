package collecting.set_;

import java.util.LinkedHashSet;
import java.util.Set;

public class LikedHashSetStructure {
    public static void main(String[] args) {
        //����һ��LinkedHashSet�ĵײ����
        Set set = new LinkedHashSet();
        set.add(new String("AA"));
        set.add(456);
        set.add(456);
        set.add(new Customer("��", 1001));
        set.add(123);
        set.add("HSP");

        System.out.println("set=" + set);

        //1. LinkedHashSet ����˳���ȡ��Ԫ��/���ݵ�˳��һ��
        //2. LinkedHashSet �ײ�ά������һ��LinkedHashMap(��HashMap������)
        //3. LinkedHashSet �ײ�ṹ (����table+˫������)
        //4. ��ӵ�һ��ʱ��ֱ�ӽ� ����table ���ݵ� 16 ,��ŵĽ�������� LinkedHashMap$Entry
        //5. ������ HashMap$Node[] ��ŵ�Ԫ��/������ LinkedHashMap$Entry����  �����̬
        /*
                //�̳й�ϵ�����ڲ������.
                static class Entry<K,V> extends HashMap.Node<K,V> {
                    Entry<K,V> before, after;
                    Entry(int hash, K key, V value, Node<K,V> next) {
                        super(hash, key, value, next);
                    }
                }

         */

    }
}
class Customer {
    private String name;
    private int no;

    public Customer(String name, int no) {
        this.name = name;
        this.no = no;
    }
}


