/**
 * @author hwj
 * @version 1.0
 * @date 2022/8/12 8:06
 */


package jdbc_.load;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;
@SuppressWarnings("all")
public class Jdbc_ {
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
        System.out.println(connection + "���ӳɹ�");


        String sql_1 = "create table connect(id int primary key auto_increment,title varchar(20),content varchar(20))";
        PreparedStatement preparedStatement = connection.prepareStatement(sql_1);   //����һ��Ԥ����������һ�㶼�������������Statement


        try {
            boolean execute = preparedStatement.execute();  //ִ��Ԥ������䣬���ؽ����
            System.out.println(execute);

            if (!execute) {
                System.out.println("������ɹ�");
            } else {
                System.out.println("������ʧ��");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        String sql_2 = "insert into connect(title,content) values(?,?)";  //��������
        PreparedStatement preparedStatement1 = connection.prepareStatement(sql_2);  //����һ��Ԥ����������һ�㶼�������������Statement

        for (int i = 0; i < 5; i++) {
            preparedStatement1.setString(1, "���մ���� " + i);
            preparedStatement1.setString(2, "���մ����� " + i);
            int row = preparedStatement1.executeUpdate();
            if (row > 0) {
                System.out.println("����ɹ�");
            } else {
                System.out.println("δ����ɹ�");
            }

        }


        preparedStatement.close();
        connection.close();
    }
}
