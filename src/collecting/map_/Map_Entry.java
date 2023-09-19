package collecting.map_;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Map_Entry {
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put("no1", "��˳ƽ");//k-v
        map.put("no2", "���޼�");//k-v
        map.put(new Car(), new Person());//k-v


        //1. k-v ����� HashMap$Node node = newNode(hash, key, value, null)
        //2. k-v Ϊ�˷������Ա�ı��������� ���� EntrySet ���� ���ü��ϴ�ŵ�Ԫ�ص����� Entry, ��һ��Entry
        //   �������k,v EntrySet<Entry<K,V>> ���� transient Set<Map.Entry<K,V>> entrySet;
        //3. entrySet �У� ����������� Map.Entry ������ʵ���ϴ�ŵĻ��� HashMap$Node
        //   ��ʱ��Ϊ static class Node<K,V> implements Map.Entry<K,V>
        //4. ���� HashMap$Node ���� ��ŵ� entrySet �ͷ������ǵı���, ��Ϊ Map.Entry �ṩ����Ҫ����
        //   K getKey(); V getValue();


        Set set = map.entrySet();
        System.out.println(set.getClass());// HashMap$EntrySet
        for (Object obj : set) {

            //System.out.println(obj.getClass()); //HashMap$Node
            //Ϊ�˴� HashMap$Node ȡ��k-v
            //1. ����һ������ת��
            Map.Entry entry = (Map.Entry) obj;

            System.out.println(entry.getKey() + "-" + entry.getValue() );
        }

        Set set1 = map.keySet();
        System.out.println(set1.getClass());
        Collection values = map.values();
        System.out.println(values.getClass());


    }
}

class Car {

}

class Person{

}


