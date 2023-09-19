package collecting.map_;

import java.util.HashMap;
import java.util.Map;

public class Methed {
    public static void main(String[] args) {
        //��ʾmap�ӿڳ��÷���

        Map map = new HashMap();
        map.put("�˳�", new Book("", 100));//OK
        map.put("�˳�", "��ٳ");//�滻-> һ�����Դ��
        map.put("����ǿ", "����");//OK
        map.put("�Ά�", "����");//OK
        map.put("���", null);//OK
        map.put(null, "�����");//OK
        map.put("¹��", "����ͮ");//OK
        map.put("hsp", "hsp������");

        System.out.println("map=" + map);

//        remove:���ݼ�ɾ��ӳ���ϵ
        map.remove(null);
        System.out.println("map=" + map);
//        get�����ݼ���ȡֵ
        Object val = map.get("¹��");
        System.out.println("val=" + val);
//        size:��ȡԪ�ظ���
        System.out.println("k-v=" + map.size());
//        isEmpty:�жϸ����Ƿ�Ϊ0
        System.out.println(map.isEmpty());//F
//        clear:���k-v
        //map.clear();
        System.out.println("map=" + map);
//        containsKey:���Ҽ��Ƿ����
        System.out.println("���=" + map.containsKey("hsp"));//T


    }
}

class Book {
    private String name;
    private int num;

    public Book(String name, int num) {
        this.name = name;
        this.num = num;
    }
}


