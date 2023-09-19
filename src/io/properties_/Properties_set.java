package io.properties_;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Properties_set {
    public static void main(String[] args) throws IOException {
        //ʹ��Properties �������� �����ļ�, �޸������ļ�����

        Properties properties = new Properties();
        //����
        //1.������ļ�û��key ���Ǵ���
        //2.������ļ���key ,�����޸�
        /*
            Properties ������ Hashtable �� �ײ����Hashtable ���ķ���
            public synchronized V put(K key, V value) {
                // Make sure the value is not null
                if (value == null) {
                    throw new NullPointerException();
                }

                // Makes sure the key is not already in the hashtable.
                Entry<?,?> tab[] = table;
                int hash = key.hashCode();
                int index = (hash & 0x7FFFFFFF) % tab.length;
                @SuppressWarnings("unchecked")
                Entry<K,V> entry = (Entry<K,V>)tab[index];
                for(; entry != null ; entry = entry.next) {
                    if ((entry.hash == hash) && entry.key.equals(key)) {
                        V old = entry.value;
                        entry.value = value;//���key ���ڣ����滻
                        return old;
                    }
                }

                addEntry(hash, key, value, index);//�������k, ��addEntry
                return null;
            }

         */
        properties.setProperty("charset", "utf8");
        properties.setProperty("user", "��ķ");//ע�Ᵽ��ʱ�������ĵ� unicode��ֵ
        properties.setProperty("pwd", "888888");

        //��k-v �洢�ļ��м���
        properties.store(new FileOutputStream("src\\mysql2.properties"), null);
        System.out.println("���������ļ��ɹ�~");

    }
}
