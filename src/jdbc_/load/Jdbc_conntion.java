/**
 * @author ��ΰ��
 * @version 1.0
 * @date 2022/8/12 18:06
 */


package jdbc_.load;

import com.mysql.jdbc.Driver;
import org.junit.jupiter.api.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class Jdbc_conntion {
    //��ʽ1
    @Test
    public void connect01() throws SQLException {
        Driver driver = new Driver(); //����driver����
        String url = "jdbc:mysql://localhost:3306/db02";
        //�� �û�����������뵽Properties ����
        Properties properties = new Properties();
        //˵�� user �� password �ǹ涨�ã������ֵ����ʵ�����д
        properties.setProperty("user", "root");// �û�
        properties.setProperty("password", "123456"); //����
        Connection connect = driver.connect(url, properties);
        System.out.println(connect);  //com.mysql.jdbc.JDBC4Connection@3d121db3
    }

    //��ʽ2
    @Test
    public void connect02() throws ClassNotFoundException, IllegalAccessException, InstantiationException, SQLException {
        //ʹ�÷������Driver�� , ��̬���أ����ӵ�������������
        Class<?> aClass = Class.forName("com.mysql.jdbc.Driver");
        Driver driver = (Driver)aClass.newInstance();  //����driver����  ����  ��̬���� ����������

        String url = "jdbc:mysql://localhost:3306/db02";
        //�� �û�����������뵽Properties ����
        Properties properties = new Properties();
        //˵�� user �� password �ǹ涨�ã������ֵ����ʵ�����д
        properties.setProperty("user", "root");// �û�
        properties.setProperty("password", "123456"); //����

        Connection connect = driver.connect(url, properties);
        System.out.println( connect);  //com.mysql.jdbc.JDBC4Connection@3d121db3

    }

    //��ʽ3 ʹ��DriverManager ��� driver ����ͳһ����
    @Test
    public void connect03() throws IllegalAccessException, InstantiationException, ClassNotFoundException, SQLException {

        //ʹ�÷������Driver
        Class<?> aClass = Class.forName("com.mysql.jdbc.Driver");
        Driver driver = (Driver) aClass.newInstance(); //����driver����  ����  ��̬���� ����������

        //����url �� user �� password
        String url = "jdbc:mysql://localhost:3306/db02";
        String user = "root";
        String password = "123456";

        DriverManager.registerDriver(driver);  //ע��������

        Connection connection = DriverManager.getConnection(url, user, password);
        System.out.println( connection);  //com.mysql.jdbc.JDBC4Connection@3b07a0d6
    }

    //��ʽ4: ʹ��Class.forName �Զ����ע���������򻯴���
    //���ַ�ʽ��ȡ������ʹ�õ���࣬�Ƽ�ʹ��
    @Test
    public void connect04() throws ClassNotFoundException, SQLException {
        //ʹ�÷�������� Driver��
        //�ڼ��� Driver��ʱ�����ע��
        /*
            Դ��: 1. ��̬����飬�������ʱ����ִ��һ��.
            2. DriverManager.registerDriver(new Driver());
            3. ���ע��driver�Ĺ����Ѿ����
            static {
                try {
                    DriverManager.registerDriver(new Driver());
                } catch (SQLException var1) {
                    throw new RuntimeException("Can't register driver!");
                }
            }
         */
        Class<?> aClass = Class.forName("com.mysql.jdbc.Driver");

        //����url �� user �� password
        String url = "jdbc:mysql://localhost:3306/db02";
        String user = "root";
        String password = "123456";
        Connection connection = DriverManager.getConnection(url, user, password);

        System.out.println(connection);  //com.mysql.jdbc.JDBC4Connection@3d121db3

    }

    //��ʽ5 , �ڷ�ʽ4�Ļ����ϸĽ������������ļ���������mysql�������
    @Test
    public void connect05() throws IOException, ClassNotFoundException, SQLException {

        //ͨ��Properties�����ȡ�����ļ�����Ϣ
        Properties properties = new Properties();
        properties.load(new FileInputStream("src\\druid.properties"));
        //��ȡ��ص�ֵ
        String user = properties.getProperty("username");
        String password = properties.getProperty("password");
        String driver = properties.getProperty("driverClassName");
        String url = properties.getProperty("url");

        Class.forName(driver);//����д��  ��̬����  ����������

        Connection connection = DriverManager.getConnection(url, user, password);//

        System.out.println(connection);  //com.mysql.jdbc.JDBC4Connection@3d121db3


    }

}
