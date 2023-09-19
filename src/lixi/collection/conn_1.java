/**
 * @author 何伟健
 * @version 1.0
 * @date 2022/9/10 22:09
 */


package lixi.collection;

import java.util.ArrayList;
import java.util.Iterator;

@SuppressWarnings("all")
public class conn_1 {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        ArrayList<Integer> integers = new ArrayList<>();
        Integer [] i ={3,5,2,3,1,4,1};
        for (int j = 0; j < i.length; j++) {
            integers.add(i[j]);
        }
        System.out.println("原集合为：");
        Iterator<Integer> iterator = integers.iterator();
        while (iterator.hasNext()){
            System.out.print(iterator.next()+" ");

        }
        System.out.println("");
        findLastMinIndex(integers);
        long end = System.currentTimeMillis();
        System.out.println("ArrayList耗时："+(end-start)+"ms");

    }

    /**
     *
     * @param integers
     * @return
     */

    public static int findLastMinIndex(ArrayList<Integer> integers){

        Iterator<Integer> iterator = integers.iterator();
        Integer min = iterator.next();
        Integer index = 0;

        while (iterator.hasNext()) {
            Integer next = iterator.next();
            if(min>=next){
                min = next;
                index = integers.lastIndexOf(next);
            }
        }

        System.out.println("最小值为："+min+" 最后序号为："+index);
        return index;

    }



}
