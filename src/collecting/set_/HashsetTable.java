package collecting.set_;

import java.util.Hashtable;

public class HashsetTable {
    public static void main(String[] args) {
        Hashtable table = new Hashtable();//ok
        table.put("john", 100); //ok
        //table.put(null, 100); //�쳣 NullPointerException
        //table.put("john", null);//�쳣 NullPointerException
        table.put("lucy", 100);//ok
        table.put("lic", 100);//ok
        table.put("lic", 88);//�滻
        table.put("hello1", 1);
        table.put("hello2", 1);
        table.put("hello3", 1);
        table.put("hello4", 1);
        table.put("hello5", 1);
        table.put("hello6", 1);
        System.out.println(table);

        //��˵��һ��Hashtable�ĵײ�
        //1. �ײ������� Hashtable$Entry[] ��ʼ����СΪ 11
        //2. �ٽ�ֵ threshold 8 = 11 * 0.75
        //3. ����: �����Լ������ݻ��������м���.
        //4. ִ�� ���� addEntry(hash, key, value, index); ���K-V ��װ��Entry
        //5. �� if (count >= threshold) ����ʱ���ͽ�������
        //5. ���� int newCapacity = (oldCapacity << 1) + 1; �Ĵ�С����.

    }
}
