/**
 * @author ��ΰ��
 * @version 1.0
 * @date 2022/9/11 14:31
 */


package lixi.collection;

import java.util.ArrayList;
import java.util.Iterator;


@SuppressWarnings("all")
public class conn_2 {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        ArrayList<Integer> integers = new ArrayList<>();
        Integer [] i ={3,-1,2,-4,-8,2};
        for (int j = 0; j < i.length; j++) {
            integers.add(i[j]);
        }
        System.out.println("ԭ����Ϊ��");
        Iterator<Integer> iterator = integers.iterator();
        while (iterator.hasNext()){
            System.out.print(iterator.next()+" ");
        }
        System.out.println("");
        deleteNegative(integers);
        long end = System.currentTimeMillis();
        System.out.println("ArrayList��ʱ��"+(end-start)+"ms");
    }
    /**
     *
     * @param integers
     * @return
     */
    public static ArrayList<Integer> deleteNegative(ArrayList<Integer> integers){
        Iterator<Integer> iterator = integers.iterator();
        while (iterator.hasNext()){
            Integer next = iterator.next();
            if(next<0){
                iterator.remove();
            }
        }
        System.out.println("ɾ��������ļ���Ϊ��");
        System.out.println(integers);
        return integers;
    }
}
