package collecting.set_;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Set_ {
    public static void main(String[] args) {
        //1. ��Set �ӿڵ�ʵ���� HashSet ������Set �ӿڵķ���
        //2. set �ӿڵ�ʵ����Ķ���(Set�ӿڶ���), ���ܴ���ظ���Ԫ��, �������һ��null
        //3. set �ӿڶ���������������(����ӵ�˳���ȡ����˳��һ��)
        //4. ע�⣺ȡ����˳���˳����Ȼ������ӵ�˳�򣬵������ǹ̶�.
        Set set = new HashSet();
        set.add("john");
        set.add("lucy");
        set.add("john");//�ظ�
        set.add("jack");
        set.add("hsp");
        set.add("mary");
        set.add(null);//
        set.add(null);//�ٴ����null
        for(int i = 0; i <10;i ++) {
            System.out.println("set=" + set);
        }

        //����
        //��ʽ1�� ʹ�õ�����
        System.out.println("=====ʹ�õ�����====");
        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            Object obj =  iterator.next();
            System.out.println("obj=" + obj);

        }

        set.remove(null);

        //��ʽ2: ��ǿfor
        System.out.println("=====��ǿfor====");

        for (Object o : set) {
            System.out.println("o=" + o);
        }

        //set �ӿڶ��󣬲���ͨ����������ȡ



        //1. �������ߵ�Դ��
        /*
            public HashSet() {
                map = new HashMap<>();
            }
         2. HashSet ���Դ��null ,����ֻ����һ��null,��Ԫ�ز����ظ�
         */
        Set hashSet = new HashSet();
        hashSet.add(null);
        hashSet.add(null);
        System.out.println("hashSet=" + hashSet);




    }
}
