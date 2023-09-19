/**
 * @author ��ΰ��
 * @version 1.0
 * @date 2022/8/14 9:36
 */


package jdbc_.connnn;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.util.Properties;

@SuppressWarnings("all")
public class C3p0_ {
    public static void main(String[] args) throws Exception {
        /*
        //1. ����һ������Դ����
        ComboPooledDataSource comboPooledDataSource = new ComboPooledDataSource();
        //2. ��ȡ�����ļ�����Ϣ
        Properties properties = new Properties();
        properties.load(new FileInputStream("src\\druid.properties"));
        //��ȡ��ص�ֵ
        String username = properties.getProperty("username");
        String password = properties.getProperty("password");
        String driverClassName = properties.getProperty("driverClassName");
        String url = properties.getProperty("url");

        //3. ��������Դ������
        comboPooledDataSource.setUser(username);
        comboPooledDataSource.setPassword(password);
        comboPooledDataSource.setJdbcUrl(url);
        comboPooledDataSource.setDriverClass(driverClassName);

        //4.��ʼ��������
        comboPooledDataSource.setInitialPoolSize(5);
        //5.���������
        comboPooledDataSource.setMaxPoolSize(10);
        */

        //1. �� c3p0 �ṩ�� c3p0.config.xml ������ src Ŀ¼��
        //2. ���ļ�ָ�����������ݿ�����ӳص���ز���
        ComboPooledDataSource comboPooledDataSource = new ComboPooledDataSource("hwj");  //����һ������Դ���󣬲���ָ������Դ������
        //�������ӳص�Ч��, ���Զ�mysql 5000�β�����Ч��
        long start = System.currentTimeMillis();
        for (int i = 0; i < 500000; i++) {
            Connection connection = comboPooledDataSource.getConnection(); //����������Ǵ� DataSource �ӿ�ʵ�ֵ�
            //System.out.println("����OK");
            connection.close();
        }
        long end = System.currentTimeMillis();
        //c3p0 5000����mysql ��ʱ=391
        System.out.println("c3p0 5000����mysql ��ʱ=" + (end - start));

    }
}
