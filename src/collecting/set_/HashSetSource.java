package collecting.set_;

import java.util.HashSet;

public class HashSetSource {
    public static void main(String[] args) {

        HashSet hashSet = new HashSet();
        hashSet.add("java");//����λ�ã���1��add�������.
        hashSet.add("php");//����λ�ã���2��add�������
        hashSet.add("java");
        System.out.println("set=" + hashSet);

        /*
        ��HashSet ��Դ����
        1. ִ�� HashSet()
            public HashSet() {
                map = new HashMap<>();
            }
        2. ִ�� add()
           public boolean add(E e) {//e = "java"
                return map.put(e, PRESENT)==null;//(static) PRESENT = new Object();
           }
         3.ִ�� put() , �÷�����ִ�� hash(key) �õ�key��Ӧ��hashֵ �㷨h = key.hashCode()) ^ (h >>> 16)
             public V put(K key, V value) {//key = "java" value = PRESENT ����
                return putVal(hash(key), key, value, false, true);
            }
         4.ִ�� putVal
         final V putVal(int hash, K key, V value, boolean onlyIfAbsent,
                   boolean evict) {
                Node<K,V>[] tab; Node<K,V> p; int n, i; //�����˸�������
                //table ���� HashMap ��һ�����飬������ Node[]
                //if ����ʾ�����ǰtable ��null, ���� ��С=0
                //���ǵ�һ�����ݣ���16���ռ�.
                if ((tab = table) == null || (n = tab.length) == 0)
                    n = (tab = resize()).length;

                //(1)����key���õ�hash ȥ�����keyӦ�ô�ŵ�table����ĸ�����λ��
                //�������λ�õĶ��󣬸��� p
                //(2)�ж�p �Ƿ�Ϊnull
                //(2.1) ���p Ϊnull, ��ʾ��û�д��Ԫ��, �ʹ���һ��Node (key="java",value=PRESENT)
                //(2.2) �ͷ��ڸ�λ�� tab[i] = newNode(hash, key, value, null)

                if ((p = tab[i = (n - 1) & hash]) == null)
                    tab[i] = newNode(hash, key, value, null);
                else {
                    //һ������������ʾ�� ����Ҫ�ֲ�����(��������)ʱ���ڴ���
                    Node<K,V> e; K k; //
                    //�����ǰ����λ�ö�Ӧ������ĵ�һ��Ԫ�غ�׼����ӵ�key��hashֵһ��
                    //�������� ������������֮һ:
                    //(1) ׼�������key �� p ָ���Node ���� key ��ͬһ������
                    //(2)  p ָ���Node ���� key ��equals() ��׼�������key�ȽϺ���ͬ
                    //�Ͳ��ܼ���
                    if (p.hash == hash &&
                        ((k = p.key) == key || (key != null && key.equals(k))))
                        e = p;
                    //���ж� p �ǲ���һ�ź����,
                    //�����һ�ź�������͵��� putTreeVal , ���������
                    else if (p instanceof TreeNode)
                        e = ((TreeNode<K,V>)p).putTreeVal(this, tab, hash, key, value);
                    else {//���table��Ӧ����λ�ã��Ѿ���һ������, ��ʹ��forѭ���Ƚ�
                          //(1) ���κ͸������ÿһ��Ԫ�رȽϺ󣬶�����ͬ, ����뵽����������
                          //    ע���ڰ�Ԫ����ӵ�����������ж� �������Ƿ��Ѿ��ﵽ8�����
                          //    , �͵��� treeifyBin() �Ե�ǰ��������������(ת�ɺ����)
                          //    ע�⣬��ת�ɺ����ʱ��Ҫ�����ж�, �ж�����
                          //    if (tab == null || (n = tab.length) < MIN_TREEIFY_CAPACITY(64))
                          //            resize();
                          //    �������������������table����.
                          //    ֻ����������������ʱ���Ž���ת�ɺ����
                          //(2) ���κ͸������ÿһ��Ԫ�رȽϹ����У��������ͬ���,��ֱ��break

                        for (int binCount = 0; ; ++binCount) {
                            if ((e = p.next) == null) {
                                p.next = newNode(hash, key, value, null);
                                if (binCount >= TREEIFY_THRESHOLD(8) - 1) // -1 for 1st
                                    treeifyBin(tab, hash);
                                break;
                            }
                            if (e.hash == hash &&
                                ((k = e.key) == key || (key != null && key.equals(k))))
                                break;
                            p = e;
                        }
                    }
                    if (e != null) { // existing mapping for key
                        V oldValue = e.value;
                        if (!onlyIfAbsent || oldValue == null)
                            e.value = value;
                        afterNodeAccess(e);
                        return oldValue;
                    }
                }
                ++modCount;
                //size ��������ÿ����һ�����Node(k,v,h,next), size++
                if (++size > threshold)
                    resize();//����
                afterNodeInsertion(evict);
                return null;
            }
         */

    }
}
