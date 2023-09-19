package collecting.set_;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSet_ {
    public static void main(String[] args) {

        //1. ������ʹ���޲ι�����������TreeSetʱ����Ȼ�������
        //2. ��ʦϣ����ӵ�Ԫ�أ������ַ�����С������
        //3. ʹ��TreeSet �ṩ��һ�������������Դ���һ���Ƚ���(�����ڲ���)
        //   ��ָ���������
        //4. �򵥿���Դ��
        //�Ϻ����
        /*
        1. �������Ѵ���ıȽ������󣬸����� TreeSet�ĵײ�� TreeMap������this.comparator

         public TreeMap(Comparator<? super K> comparator) {
                this.comparator = comparator;
            }
         2. �� ���� treeSet.add("tom"), �ڵײ��ִ�е�

             if (cpr != null) {//cpr �������ǵ������ڲ���(����)
                do {
                    parent = t;
                    //��̬�󶨵����ǵ������ڲ���(����)compare
                    cmp = cpr.compare(key, t.key);
                    if (cmp < 0)
                        t = t.left;
                    else if (cmp > 0)
                        t = t.right;
                    else //�����ȣ�������0,���Key��û�м���
                        return t.setValue(value);
                } while (t != null);
            }
         */

//        TreeSet treeSet = new TreeSet();
        TreeSet treeSet = new TreeSet(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                //���� ����String�� compareTo���������ַ�����С�Ƚ�
                //����Ϻ�Ҫ������Ԫ�أ����ճ��ȴ�С����
                //return ((String) o2).compareTo((String) o1);
                return ((String) o1).length() - ((String) o2).length();
            }
        });
        //�������.
        treeSet.add("jack");
        treeSet.add("tom");//3
        treeSet.add("sp");
        treeSet.add("a");
        treeSet.add("abc");//3


        System.out.println("treeSet=" + treeSet);




    }
}


