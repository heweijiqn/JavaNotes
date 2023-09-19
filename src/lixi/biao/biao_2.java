/**
 * @author 何伟健
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
        System.out.println("原集合为：");
        Iterator<Integer> iterator = integers.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println("");
        insert(integers,0,6);
    }
    /*
    * @param list 集合
    * @param index 插入位置
    * @param element 插入元素
    *
     */

    //插入一个元素，并在第一个位置插入一个元素
    public static ArrayList<Integer> insert(ArrayList<Integer> integers, int index, int element) {
        integers.add(index, element);
        System.out.println("插入后的集合为：");
        System.out.println(integers);
        return integers;
    }
}
