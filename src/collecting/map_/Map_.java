package collecting.map_;

import java.util.HashMap;
import java.util.Map;

public class Map_ {
    public static void main(String[] args) {
        //1. Map��Collection���д��ڡ����ڱ������ӳ���ϵ������:Key-Value(˫��Ԫ��)
        //2. Map �е� key ��  value �������κ��������͵����ݣ����װ��HashMap$Node ������
        //3. Map �е� key �������ظ���ԭ���HashSet һ����ǰ�������Դ��.
        //4. Map �е� value �����ظ�
        //5. Map ��key ����Ϊ null, value Ҳ����Ϊnull ��ע�� key Ϊnull,
        //   ֻ����һ����value Ϊnull ,���Զ��
        //6. ����String����ΪMap�� key
        //7. key �� value ֮����ڵ���һ��һ��ϵ����ͨ��ָ���� key �����ҵ���Ӧ�� value
        Map map = new HashMap();
        map.put("no1", "��˳ƽ");//k-v
        map.put("no2", "���޼�");//k-v
        map.put("no1", "������");//������ͬ��k , �͵ȼ����滻.
        map.put("no3", "������");//k-v
        map.put(null, null); //k-v
        map.put(null, "abc"); //�ȼ��滻
        map.put("no4", null); //k-v
        map.put("no5", null); //k-v
        map.put(1, "����");//k-v
        map.put(new Object(), "��ëʨ��");//k-v
        // ͨ��get ���������� key ,�᷵�ض�Ӧ��value
        System.out.println(map.get("no2"));//���޼�

        System.out.println("map=" + map);



    }
}

