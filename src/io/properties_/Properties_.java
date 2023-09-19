package io.properties_;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class Properties_ {
    public static void main(String[] args) throws IOException {
        //ʹ��Properties ������ȡmysql.properties �ļ�

        //1. ����Properties ����
        Properties properties = new Properties();
        //2. ����ָ�������ļ�
        properties.load(new FileReader("src\\mysql.properties"));
        //3. ��k-v��ʾ����̨
        properties.list(System.out);
        //4. ����key ��ȡ��Ӧ��ֵ
        String user = properties.getProperty("user");
        String pwd = properties.getProperty("pwd");
        System.out.println("�û���=" + user);
        System.out.println("������=" + pwd);
    }
}
