package collecting.list_;

import java.util.ArrayList;



@SuppressWarnings({"all"})
public class ArrayListDetai {
    public static void main(String[] args) {
        //ArrayList ���̲߳���ȫ��, ���Կ�Դ�� û�� synchronized
        /*
         public boolean add(E e) {
         ensureCapacityInternal( size + 1);  // Increments modCount!!
         elementData[size++] = e;
         return true;
         }
         */
        ArrayList arrayList = new ArrayList();
        arrayList.add(null);
        arrayList.add("jack");
        arrayList.add(null);
        arrayList.add("hsp");
        System.out.println(arrayList);
    }
}
