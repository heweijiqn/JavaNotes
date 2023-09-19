/**
 * @author 何伟健
 * @version 1.0
 * @date 2022/9/11 15:36
 */


package lixi.collection;

import java.util.ArrayList;
import java.util.Iterator;

@SuppressWarnings("all")
public class conn_5 {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        ArrayList<Integer> integers1 = new ArrayList<Integer>();
        Integer [] i1 ={19,2,4,1,6};
        for (int j = 0; j < i1.length; j++) {
            integers1.add(i1[j]);
        }
        Iterator<Integer> iterator = integers1.iterator();
        System.out.println("集合1为：");
        while (iterator.hasNext()){
            System.out.print(iterator.next()+" ");
        }
        ArrayList<Integer> integers2 = new ArrayList<>();
        Integer [] i2 ={2,3,1,6,10,3,20};
        for(int j = 0; j < i2.length; j++){
            integers2.add(i2[j]);
        }
        Iterator<Integer> iterator1 = integers2.iterator();
        System.out.println("");
        System.out.println("集合2为：");
        while (iterator1.hasNext()){
            System.out.print(iterator1.next()+" ");
        }
        merge(integers1,integers2);
        long end = System.currentTimeMillis();
        System.out.println("ArrayList耗时："+(end-start)+"ms");//



    }
    /**
     *
     * @param integers1
     * @param integers2
     * @return
     */
    public static ArrayList<Integer> merge(ArrayList<Integer> list1,ArrayList<Integer> list2){
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < list1.size(); i++) {
            list.add(list1.get(i));
        }
        for (int i = 0; i < list2.size(); i++) {
            list.add(list2.get(i));
        }
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.size()-1-i; j++) {
                if (list.get(j)>list.get(j+1)){
                    int temp = list.get(j);
                    list.set(j,list.get(j+1));
                    list.set(j+1,temp);
                }if (list.get(j)==list.get(j+1)){
                    list.remove(j);
                }
            }
        }
        System.out.println("");
        System.out.println("合并后的集合为：");
        System.out.println(list);
        return list;
    }
}
