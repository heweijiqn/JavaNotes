package collecting.map_;

import java.util.Properties;

public class Properties_ {
    public static void main(String[] args) {
        //1. Properties �̳�  Hashtable
        //2. ����ͨ�� k-v ������ݣ���Ȼkey �� value ����Ϊ null
        //����
        Properties properties = new Properties();
        //properties.put(null, "abc");//�׳� ��ָ���쳣
        //properties.put("abc", null); //�׳� ��ָ���쳣
        properties.put("john", 100);//k-v
        properties.put("lucy", 100);
        properties.put("lic", 100);
        properties.put("lic", 88);//�������ͬ��key �� value���滻

        System.out.println("properties=" + properties);

        //ͨ��k ��ȡ��Ӧֵ
        System.out.println(properties.get("lic"));//88

        //ɾ��
        properties.remove("lic");
        System.out.println("properties=" + properties);

        //�޸�
        properties.put("john", "Լ��");
        System.out.println("properties=" + properties);





    }
}
