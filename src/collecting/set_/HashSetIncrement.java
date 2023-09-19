package collecting.set_;

import mhl.domain.Bill;

import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HashSetIncrement {
    public static void main(String[] args) {
         /*
        HashSet�ײ���HashMap, ��һ�����ʱ��table �������ݵ� 16��
        �ٽ�ֵ(threshold)�� 16*��������(loadFactor)��0.75 = 12
        ���table ����ʹ�õ����ٽ�ֵ 12,�ͻ����ݵ� 16 * 2 = 32,
        �µ��ٽ�ֵ���� 32*0.75 = 24, ��������

         */
        /***HashSet hashSet = new HashSet();
        for(int i = 1; i <= 100; i++){
            System.out.println(hashSet.add(i));
        }
        ***/
        /*****������ ������ �н������� �ù�˹����  ****/

        HashSet hashSet = new HashSet();

//        for(int i = 1; i <= 7; i++) {//��table��ĳһ������������� 7��A����
//            hashSet.add(new A(i));//
//            System.out.println(hashSet);
//        }


        for(int i = 1; i <= 13; i++) {//��table������һ������������� 7��B����
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