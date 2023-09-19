/**
 * @author ��ΰ��
 * @version 1.0
 * @date 2022/8/12 18:41
 */


package jdbc_.result_;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Properties;

public class Result_many {
    public static void main(String[] args) throws Exception {
        Properties properties = new Properties();
        properties.load(new FileInputStream("src\\druid.properties"));

        //��ȡ��ص�ֵ
        String username = properties.getProperty("username");
        String password = properties.getProperty("password");
        String driverClassName = properties.getProperty("driverClassName");
        String url = properties.getProperty("url");

        Class<?> aClass = Class.forName(driverClassName);//������������

        Connection connection
                = DriverManager.getConnection(url, username, password);//��ȡ����
        String sql = "select * from connect";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);

        ResultSet resultSet = preparedStatement.executeQuery();

        while (resultSet.next()) {
            Integer id = resultSet.getInt("id");
            String title = resultSet.getString("title");
            String content = resultSet.getString("content");
            System.out.println(id + " " + title + " " + content);



        }
        connection.close();
        resultSet.close();
        preparedStatement.close();
    }
}
