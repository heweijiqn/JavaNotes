package collecting.map_;

import java.util.HashMap;

public class Tree {
    public static void main(String[] args) {


        HashMap hashMap = new HashMap();
        for(int i = 1; i <= 12; i++) {
            hashMap.put(i, "hello");
        }

        hashMap.put("aaa", "bbb");

        System.out.println("hashMap=" + hashMap);//12�� k-v

        //����һ�������Լ���ƴ���ȥ��֤��table ������
        //0 -> 16(12) -> 32(24) -> 64(64*0.75=48)-> 128 (96) ->
        //�Լ���Ƴ�����֤-�� ��ǿ�Լ��Ķ�Դ������. �����˴���.
    }
}

class A  {
    private int num;

    public A(int num) {
        this.num = num;
    }

    //���е�A�����hashCode����100
//    @Override
//    public int hashCode() {
//        return 100;
//    }

    @Override
    public String toString() {
        return "\nA{" +
                "num=" + num +
                '}';
    }
}


