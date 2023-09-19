/**
 * @author ��ΰ��
 * @version 1.0
 * @date 2022/8/12 18:24
 */


package jdbc_.result_;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Properties;


@SuppressWarnings("all")
public class Result_ {  //��ѯ����� ���н��
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
        String sql = "select title,content from connect where title=? and content=?";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);   //����һ��Ԥ����������һ�㶼�������������Statement

        preparedStatement.setString(1, "���մ���� 0");
        preparedStatement.setString(2, "���մ����� 0");

        ResultSet resultSet = preparedStatement.executeQuery();
        if (resultSet.next()) {
            System.out.println("��ѯ�ɹ�");
        } else {
            System.out.println("��ѯʧ��");
        }
        preparedStatement.close();
        connection.close();
        resultSet.close();


    }
}
