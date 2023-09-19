/**
 * @author 何伟健
 * @version 1.0
 * @date 2022/9/11 14:37
 */


package lixi.biao;

import java.util.ArrayList;
import java.util.Iterator;


@SuppressWarnings("all")
public class biao_3 {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        ArrayList<Integer> integers = new ArrayList<>();
        Integer [] i ={3,-1,2,-4,-8,2,1,-3,-4,2};
        for (int j = 0; j < i.length; j++) {
            integers.add(i[j]);
        }
        System.out.println("原集合为：");
        Iterator<Integer> iterator = integers.iterator();
        while (iterator.hasNext()){
            System.out.print(iterator.next()+" ");
        }
        System.out.println("");
        sort(integers);
        long end = System.currentTimeMillis();
        System.out.println("ArrayList耗时："+(end-start)+"ms");

    }
    /**
     *
     * @param integers
     * @return
     */

    public static ArrayList<Integer> sort(ArrayList<Integer> list){
       for (int i = 0; i < list.size(); i++) {
           if (list.get(i) < 0) {
               list.add(0, list.get(i));
               list.remove(i + 1);
           }
       }
/**     ListIterator<Integer> integerListIterator = list.listIterator();
        while (integerListIterator.hasNext()) {
            Integer next = integerListIterator.next();
            if (next < 0) {
                integerListIterator.set(next);
                integerListIterator.previous();
                integerListIterator.remove();
            }
       }**/

        System.out.println("排序后的集合为："+"");
        System.out.println(list);
        return list;

    }
}
