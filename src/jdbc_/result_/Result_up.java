/**
 * @author ��ΰ��
 * @version 1.0
 * @date 2022/8/13 17:24
 */


package jdbc_.result_;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;

@SuppressWarnings("all")
public class Result_up {
    public static void main(String[] args) throws Exception {
        Properties properties = new Properties();
        properties.load(new FileInputStream("src\\druid.properties"));
        //��ȡ��ص�ֵ
        String username = properties.getProperty("username");
        String password = properties.getProperty("password");
        String driverClassName = properties.getProperty("driverClassName");
        String url = properties.getProperty("url");

        Class.forName(driverClassName);  //������������
        Connection connection = DriverManager.getConnection(url, username, password);//��ȡ����
        //3. �õ�PreparedStatement
        //3.1 ��֯SqL , Sql ���� ? ���൱��ռλ��
        //��Ӽ�¼
        //String sql = "insert into admin values(?, ?)";
        //String sql = "update admin set pwd = ? where name = ?";
        String sql = "insert into connect (title,content) values (?,?)";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        //3.3 �� ? ��ֵ
        preparedStatement.setString(1,"��������� ");
        preparedStatement.setString(2,"�ǽ���ܰ���ѽ ");


        int rows = preparedStatement.executeUpdate();
        System.out.println(rows > 0 ? "ִ�гɹ�" : "ִ��ʧ��");

        connection.close();
        preparedStatement.close();

    }
}
