/**
 * @author ��ΰ��
 * @version 1.0
 * @date 2022/8/13 17:33
 */


package jdbc_.utils_;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;

public class JDBCUtils_ {
    //������ص�����(4��), ��Ϊֻ��Ҫһ�ݣ���ˣ���������static
    private static String username; //�û���
    private static String password; //����
    private static String url; //url

    private static String driverClassName; //������

    //��static�����ȥ��ʼ��
    static {

        try {
            Properties properties = new Properties();
            properties.load(new FileInputStream("src\\druid.properties"));

            //��ȡ��ص�ֵ
                username = properties.getProperty("username");
                password = properties.getProperty("password");
                driverClassName = properties.getProperty("driverClassName");
                url = properties.getProperty("url");

                Class<?> aClass = Class.forName(driverClassName);//������������


        } catch (Exception e) {
            //��ʵ�ʿ����У����ǿ�����������
            //1. �������쳣ת�� �����쳣
            //2. �����ߣ�����ѡ�񲶻���쳣��Ҳ����ѡ��Ĭ�ϴ�����쳣���ȽϷ���.
            throw new RuntimeException(e);

        }
    }

    //�������ݿ�, ����Connection
    public static Connection getConnection() {

        try {
            return DriverManager.getConnection(url, username, password);//��ȡ����
        } catch (SQLException e) {
            //1. �������쳣ת�� �����쳣
            //2. �����ߣ�����ѡ�񲶻���쳣��Ҳ����ѡ��Ĭ�ϴ�����쳣���ȽϷ���.
            throw new RuntimeException(e);
        }
    }

    //�ر������Դ
    /*
        1. ResultSet �����
        2. Statement ���� PreparedStatement
        3. Connection
        4. �����Ҫ�ر���Դ���ʹ�����󣬷����� null
     */
    public static void close(ResultSet set, Statement statement, Connection connection) {

        //�ж��Ƿ�Ϊnull
        try {
            if (set != null) {
                set.close();
            }
            if (statement != null) {
                statement.close();
            }
            if (connection != null) {
                connection.close();
            }
        } catch (SQLException e) {
            //�������쳣ת�������쳣�׳�
            throw new RuntimeException(e);
        }

    }

}
