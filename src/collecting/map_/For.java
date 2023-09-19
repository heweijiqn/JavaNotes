package collecting.map_;



import java.util.*;

@SuppressWarnings("all")
public class For {
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put("�˳�", "��ٳ");
        map.put("����ǿ", "����");
        map.put("�Ά�", "����");
        map.put("���", null);
        map.put(null, "�����");
        map.put("¹��", "����ͮ");


        //��һ��: ��ȡ�� ���е�Key , ͨ��Key ȡ����Ӧ��Value
        Set keyset = map.keySet();
        //(1) ��ǿfor
        System.out.println("-----��һ�ַ�ʽ-------");
        for (Object key : keyset) {
            System.out.println(key + "-" + map.get(key));
        }
        //(2) ������
        System.out.println("----�ڶ��ַ�ʽ--------");
        Iterator iterator = keyset.iterator();
        while (iterator.hasNext()) {
            Object key =  iterator.next();
            System.out.println(key + "-" + map.get(key));
        }

        //�ڶ���: �����е�valuesȡ��
        Collection values = map.values();
        //�������ʹ�����е�Collectionsʹ�õı�������
        //(1) ��ǿfor
        System.out.println("---ȡ�����е�value ��ǿfor----");
        for (Object value : values) {
            System.out.println(value);
        }
        //(2) ������
        System.out.println("---ȡ�����е�value ������----");
        Iterator iterator2 = values.iterator();
        while (iterator2.hasNext()) {

            Object value =  iterator2.next();
            System.out.println(value);

        }

        //������: ͨ��EntrySet ����ȡ k-v
        Set entrySet = map.entrySet();// EntrySet<Map.Entry<K,V>>
        //(1) ��ǿfor
        System.out.println("----ʹ��EntrySet �� for��ǿ(��3��)----");
        for (Object entry : entrySet) {
            //��entry ת�� Map.Entry
            Map.Entry m = (Map.Entry) entry;

            System.out.println(m.getKey() + "-" + m.getValue());

        }//�����entry ���� HashMap$Node


        //(2) ������
        System.out.println("----ʹ��EntrySet �� ������(��4��)----");
        Iterator iterator3 = entrySet.iterator();
        while (iterator3.hasNext()) {
            Object entry =  iterator3.next();
//            System.out.println(entry.getClass());//HashMap$Node -ʵ��-> Map.Entry (getKey,getValue)
            //����ת�� Map.Entry
            Map.Entry m = (Map.Entry) entry;
            System.out.println(m.getKey() + "-" + m.getValue());
        }




    }
    }





