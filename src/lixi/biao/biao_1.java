/**
 * @author ��ΰ��
 * @version 1.0
 * @date 2022/9/19 18:53
 */


package lixi.biao;

import java.util.ArrayList;
import java.util.Iterator;

@SuppressWarnings("all")
public class biao_1{
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        ArrayList<Integer> integers = new ArrayList<>();
        Integer [] i ={1,2,2,3,4,5};
        for (int j = 0; j < i.length; j++) {
            integers.add(i[j]);
        }
        System.out.println("ԭ����Ϊ��");
        Iterator<Integer> iterator = integers.iterator();
        while (iterator.hasNext()){
            System.out.print(iterator.next()+" ");
        }
        System.out.println("");
        deleteRepeat(integers);
        long end = System.currentTimeMillis();
        System.out.println("ArrayList��ʱ��"+(end-start)+"ms");


    }
    /**
     *
     * @param integers
     * @return
     */

    public static ArrayList<Integer> deleteRepeat(ArrayList<Integer> integers){
        for  ( int  i  =   0 ; i  <  integers.size()  -   1 ; i ++ )  {
            for  ( int  j  =  integers.size()  -   1 ; j  >  i; j -- )  {
                if  (integers.get(j).equals(integers.get(i)))  {
                    integers.remove(j);
                    integers.remove(i);
                }
            }
        }
//        Iterator<Integer> iterator = integers.iterator();
//        while (iterator.hasNext()) {
//            Integer next = iterator.next();
//            if (integers.indexOf(next) != integers.lastIndexOf(next)) {
//                //ɾ��������Ԫ��
//                integers.remove(integers.indexOf(next));
//                integers.remove(integers.lastIndexOf(next));
//                integers.remove(next);
//            }
//        }

        System.out.println("ȥ�غ�ļ���Ϊ��");
        System.out.println(integers);

        return integers;
    }

}
