package Common;

import java.util.Arrays;
import java.util.Comparator;

public class ArraysSortCustom {
    public static void main(String[] args) {
        int[] arr = {1, -1, 8, 0, 20};

        //�ӿڱ��+��̬��+�����ڲ�����ۺ�ʹ��
        bubble02(arr, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                int i1 = (Integer) o1;
                int i2 = (Integer) o2;
                return i2 - i1;// return i2 - i1;
            }
        });

        System.out.println("==�������������==");
        System.out.println(Arrays.toString(arr));

    }

    //ʹ��ð���������
    public static void bubble01(int[] arr) {
        int temp = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                //��С����
                if (arr[j] < arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
    /****  Arrays.sort(arr, new Comparator()
     (2) ���յ� TimSort��� private static <T> void binarySort(T[] a, int lo, int hi, int start,
     Comparator<? super T> c)()
     (3) ִ�е� binarySort�����Ĵ���, ����ݶ�̬�󶨻��� c.compare()ִ�����Ǵ����
     �����ڲ���� compare ()
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
     (5) public int compare(Object o1, Object o2) ���ص�ֵ>0 ���� <0
     ��Ӱ������������, ��ͳ�������� �ӿڱ��+��̬��+�����ڲ�����ۺ�ʹ��
     �����ĵײ��ܺ�Դ���ʹ�÷�ʽ����ǳ�����***/

    //���ð�� + ����
    public static void bubble02(int[] arr, Comparator c) {
        int temp = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                //���������� c.compare(arr[j], arr[j + 1])���ص�ֵ����
                if (c.compare(arr[j], arr[j + 1]) > 0) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

    }

}
