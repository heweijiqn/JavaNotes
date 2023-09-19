package collecting.map_;

import java.util.Comparator;
import java.util.TreeMap;

public class TreeMap_ {
    public static void main(String[] args) {
        /*ʹ��Ĭ�ϵĹ�����������TreeMap, �������(Ҳû������)
        /*
            Ҫ�󣺰��մ���� k(String) �Ĵ�С��������
         */
//        TreeMap treeMap = new TreeMap();
        TreeMap treeMap = new TreeMap(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                //���մ���� k(String) �Ĵ�С��������
                //����K(String) �ĳ��ȴ�С����
                //return ((String) o2).compareTo((String) o1);
                return ((String) o2).length() - ((String) o1).length();
            }
        });
        treeMap.put("jack", "�ܿ�");
        treeMap.put("tom", "��ķ");
        treeMap.put("kristina", "����˹��ŵ");
        treeMap.put("smith", "˹��˹");
        treeMap.put("hsp", "��˳ƽ");//���벻��

        System.out.println("treemap=" + treeMap);

        /*

            ���Դ�룺
            1. ������. �Ѵ����ʵ���� Comparator�ӿڵ������ڲ���(����)��������TreeMap��comparator
             public TreeMap(Comparator<? super K> comparator) {
                this.comparator = comparator;
            }
            2. ����put����
            2.1 ��һ�����, ��k-v ��װ�� Entry���󣬷���root
            Entry<K,V> t = root;
            if (t == null) {
                compare(key, key); // type (and possibly null) check

                root = new Entry<>(key, value, null);
                size = 1;
                modCount++;
                return null;
            }
            2.2 �Ժ����
            Comparator<? super K> cpr = comparator;
            if (cpr != null) {
                do { //�������е�key , ����ǰkey�ҵ��ʵ�λ��
                    parent = t;
                    cmp = cpr.compare(key, t.key);//��̬�󶨵����ǵ������ڲ����compare
                    if (cmp < 0)
                        t = t.left;
                    else if (cmp > 0)
                        t = t.right;
                    else  //������������У�����׼�����Key �͵�ǰ���е�Key ��ȣ��Ͳ����
                        return t.setValue(value);
                } while (t != null);
            }
         */
    }
}
