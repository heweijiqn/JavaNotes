package Common;

import java.util.Arrays;
import java.util.Comparator;

public class ArraysSortCustom {
    public static void main(String[] args) {
        int[] arr = {1, -1, 8, 0, 20};

        //接口编程+动态绑定+匿名内部类的综合使用
        bubble02(arr, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                int i1 = (Integer) o1;
                int i2 = (Integer) o2;
                return i2 - i1;// return i2 - i1;
            }
        });

        System.out.println("==定制排序后的情况==");
        System.out.println(Arrays.toString(arr));

    }

    //使用冒泡完成排序
    public static void bubble01(int[] arr) {
        int temp = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                //从小到大
                if (arr[j] < arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
    /****  Arrays.sort(arr, new Comparator()
     (2) 最终到 TimSort类的 private static <T> void binarySort(T[] a, int lo, int hi, int start,
     Comparator<? super T> c)()
     (3) 执行到 binarySort方法的代码, 会根据动态绑定机制 c.compare()执行我们传入的
     匿名内部类的 compare ()
     while (left < right) {
         int mid = (left + right) >>> 1;
         if (c.compare(pivot, a[mid]) < 0)
         right = mid;
         else
         left = mid + 1;
     }
     (4) new Comparator() {
    @Override
        public int compare(Object o1, Object o2) {
            Integer i1 = (Integer) o1;
            Integer i2 = (Integer) o2;
            return i2 - i1;
        }
    }
     (5) public int compare(Object o1, Object o2) 返回的值>0 还是 <0
     会影响整个排序结果, 这就充分体现了 接口编程+动态绑定+匿名内部类的综合使用
     将来的底层框架和源码的使用方式，会非常常见***/

    //结合冒泡 + 定制
    public static void bubble02(int[] arr, Comparator c) {
        int temp = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                //数组排序由 c.compare(arr[j], arr[j + 1])返回的值决定
                if (c.compare(arr[j], arr[j + 1]) > 0) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

    }

}
