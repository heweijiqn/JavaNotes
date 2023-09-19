package collecting.set_;

import mhl.domain.Bill;

import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HashSetIncrement {
    public static void main(String[] args) {
         /*
        HashSet底层是HashMap, 第一次添加时，table 数组扩容到 16，
        临界值(threshold)是 16*加载因子(loadFactor)是0.75 = 12
        如果table 数组使用到了临界值 12,就会扩容到 16 * 2 = 32,
        新的临界值就是 32*0.75 = 24, 依次类推

         */
        /***HashSet hashSet = new HashSet();
        for(int i = 1; i <= 100; i++){
            System.out.println(hashSet.add(i));
        }
        ***/
        /*****这是在 数组中 中进行扩容 用哈斯库兹  ****/

        HashSet hashSet = new HashSet();

//        for(int i = 1; i <= 7; i++) {//在table的某一条链表上添加了 7个A对象
//            hashSet.add(new A(i));//
//            System.out.println(hashSet);
//        }


        for(int i = 1; i <= 13; i++) {//在table的另外一条链表上添加了 7个B对象
            hashSet.add(new B(i));//
            System.out.println(hashSet);
        }





    }

}

class B {
    private int n;

    public B(int n) {
        this.n = n;
    }
    @Override
    public int hashCode() {
        return 200;
    }

    @Override
    public String toString() {
        return "B{" +
                "n=" + n +
                '}';
    }
}

class A {
    private int n;

    public A(int n) {
        this.n = n;
    }

    @Override
    public int hashCode() {
        return 100;
    }

    @Override
    public String toString() {
        return "A{" +
                "n=" + n +
                '}';
    }
}