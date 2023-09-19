package Common;

import java.util.Arrays;
import java.util.List;

public class ArrMethod {
    public static void main(String[] args) {
        Integer[] arr = {1, 2, 90, 123, 567};
        // binarySearch ͨ���������������в��ң�Ҫ������ź�

        //1. ʹ�� binarySearch �������
        //2. Ҫ��������������. ���������������ģ�����ʹ��binarySearch
        //3. ��������в����ڸ�Ԫ�أ��ͷ��� return -(low + 1);  // key not found.
        int index = Arrays.binarySearch(arr, 567);
        System.out.println("index=" + index);

        //copyOf ����Ԫ�صĸ���

        //1. �� arr �����У����� arr.length��Ԫ�ص� newArr������
        //2. ��������ĳ��� > arr.length ����������ĺ��� ���� null
        //3. ����������� < 0 ���׳��쳣NegativeArraySizeException
        //4. �÷����ĵײ�ʹ�õ��� System.arraycopy()
        Integer[] newArr = Arrays.copyOf(arr, arr.length);
        System.out.println("==����ִ����Ϻ�==");
        System.out.println(Arrays.toString(newArr));

        //ill ����Ԫ�ص����
        Integer[] num = new Integer[]{9,3,2};
        //�Ϻ����
        //1. ʹ�� 99 ȥ��� num���飬�����������滻ԭ���Ԫ��
        Arrays.fill(num, 99);
        System.out.println("==num��������==");
        System.out.println(Arrays.toString(num));

        //equals �Ƚ���������Ԫ�������Ƿ���ȫһ��
        Integer[] arr2 = {1, 2, 90, 123};

        //1. ���arr �� arr2 �����Ԫ��һ�����򷽷�true;
        //2. ���������ȫһ�����ͷ��� false
        boolean equals = Arrays.equals(arr, arr2);
        System.out.println("equals=" + equals);

        //asList ��һ��ֵ��ת����list

        //1. asList�������Ὣ (2,3,4,5,6,1)����ת��һ��List����
        //2. ���ص� asList �������� List(�ӿ�)
        //3. asList �������� java.util.Arrays#ArrayList, ��Arrays���
        //   ��̬�ڲ��� private static class ArrayList<E> extends AbstractList<E>
        //              implements RandomAccess, java.io.Serializable
        List asList = Arrays.asList(2,3,4,5,6,1);
        System.out.println("asList=" + asList);
        System.out.println("asList����������" + asList.getClass());



    }
}
