/**
 * @author ��ΰ��
 * @version 1.0
 * @date 2022/9/19 19:24
 */


package lixi.biao;

import java.util.ArrayList;
import java.util.Iterator;

@SuppressWarnings("all")
public class biao_2 {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        ArrayList<Integer> integers = new ArrayList<>();
        Integer[] i = {1, 2, 3, 4, 5};
        for (int j = 0; j < i.length; j++) {
            integers.add(i[j]);
        }
        System.out.println("ԭ����Ϊ��");
        Iterator<Integer> iterator = integers.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println("");
        insert(integers,0,6);
    }
    /*
    * @param list ����
    * @param index ����λ��
    * @param element ����Ԫ��
    *
     */

    //����һ��Ԫ�أ����ڵ�һ��λ�ò���һ��Ԫ��
    public static ArrayList<Integer> insert(ArrayList<Integer> integers, int index, int element) {
        integers.add(index, element);
        System.out.println("�����ļ���Ϊ��");
        System.out.println(integers);
        return integers;
    }
}
