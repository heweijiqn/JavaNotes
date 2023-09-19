package collecting.set_;

import java.util.HashMap;

public class HashMapSource {
    public static void main(String[] args) {
        HashMap map = new HashMap();
        map.put("java", 10);//ok
        map.put("php", 10);//ok
        map.put("java", 20);//�滻value

        System.out.println("map=" + map);//

        /*�Ϻ����HashMap��Դ��+ͼ��
        1. ִ�й����� new HashMap()
           ��ʼ���������� loadfactor = 0.75
           HashMap$Node[] table = null
        2. ִ��put ���� hash���������� key�� hashֵ (h = key.hashCode()) ^ (h >>> 16)
            public V put(K key, V value) {//K = "java" value = 10
                return putVal(hash(key), key, value, false, true);
            }
         3. ִ�� putVal
         final V putVal(int hash, K key, V value, boolean onlyIfAbsent,
                   boolean evict) {
                Node<K,V>[] tab; Node<K,V> p; int n, i;//��������
                //����ײ��table ����Ϊnull, ���� length =0 , �����ݵ�16
                if ((tab = table) == null || (n = tab.length) == 0)
                    n = (tab = resize()).length;
                //ȡ��hashֵ��Ӧ��table������λ�õ�Node, ���Ϊnull, ��ֱ�ӰѼ����k-v
                //, ������һ�� Node ,�����λ�ü���
                if ((p = tab[i = (n - 1) & hash]) == null)
                    tab[i] = newNode(hash, key, value, null);
                else {
                    Node<K,V> e; K k;//��������
                // ���table������λ�õ�key��hash��ͬ���µ�key��hashֵ��ͬ��
                 // �� ����(table���еĽ���key��׼����ӵ�key��ͬһ������  || equals������)
                 // ����Ϊ���ܼ����µ�k-v
                    if (p.hash == hash &&
                        ((k = p.key) == key || (key != null && key.equals(k))))
                        e = p;
                    else if (p instanceof TreeNode)//�����ǰ��table�����е�Node �Ǻ�������Ͱ��պ�����ķ�ʽ����
                        e = ((TreeNode<K,V>)p).putTreeVal(this, tab, hash, key, value);
                    else {
                        //����ҵ��Ľ�㣬������������ѭ���Ƚ�
                        for (int binCount = 0; ; ++binCount) {//��ѭ��
                            if ((e = p.next) == null) {//�����������û�к�����ͬ,�ͼӵ�����������
                                p.next = newNode(hash, key, value, null);
                                //������жϵ�ǰ����ĸ������Ƿ��Ѿ���8������8������
                                //�͵��� treeifyBin �������к������ת��
                                if (binCount >= TREEIFY_THRESHOLD - 1) // -1 for 1st
                                    treeifyBin(tab, hash);
                                break;
                            }
                            if (e.hash == hash && //�����ѭ���ȽϹ����У���������ͬ,��break,��ֻ���滻value
                                ((k = e.key) == key || (key != null && key.equals(k))))
                                break;
                            p = e;
                        }
                    }
                    if (e != null) { // existing mapping for key
                        V oldValue = e.value;
                        if (!onlyIfAbsent || oldValue == null)
                            e.value = value; //�滻��key��Ӧvalue
                        afterNodeAccess(e);
                        return oldValue;
                    }
                }
                ++modCount;//ÿ����һ��Node ,��size++
                if (++size > threshold[12-24-48])//��size > �ٽ�ֵ��������
                    resize();
                afterNodeInsertion(evict);
                return null;
            }

              5. ��������(ת�ɺ����)
              //���table Ϊnull ,���ߴ�С��û�е� 64����ʱ�����������ǽ�������.
              //����Ż����������� -> ��֦
              final void treeifyBin(Node<K,V>[] tab, int hash) {
                int n, index; Node<K,V> e;
                if (tab == null || (n = tab.length) < MIN_TREEIFY_CAPACITY)
                    resize();

            }
         */


    }
}
