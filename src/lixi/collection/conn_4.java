/**
 * @author 何伟健
 * @version 1.0
 * @date 2022/9/11 15:17
 */


package lixi.collection;

import java.util.ArrayList;
import java.util.Iterator;

@SuppressWarnings("all")
public class conn_4 {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        ArrayList<Integer> integers = new ArrayList<>();
        Integer [] i ={1,3,5,7,9,11,13};
        for (int j = 0; j < i.length; j++) {
            integers.add(i[j]);
        }
        System.out.println("原集合为：");
        Iterator<Integer> iterator = integers.iterator();
        while (iterator.hasNext()){
            System.out.print(iterator.next()+" ");

        }
        System.out.println("");
        insert(integers,10);
        long end = System.currentTimeMillis();
        System.out.println("ArrayList耗时："+(end-start)+"ms");

    }
    /**
     *
     * @param integers
     * @param num
     * @return
     */
    public static ArrayList<Integer> insert(ArrayList<Integer> list,int num){
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > num) {
                list.add(i, num);
                break;
            }if (list.get(list.size()-1)<num){
                list.add(num);
                break;
            }
        }
        System.out.println("插入后的集合为：");
        System.out.println(list);
        return list;
    }
}
