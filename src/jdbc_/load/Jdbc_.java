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
        //获取相关的值
        String username = properties.getProperty("username");
        String password = properties.getProperty("password");
        String driverClassName = properties.getProperty("driverClassName");
        String url = properties.getProperty("url");

        Class.forName(driverClassName);  //加载驱动程序
        Connection connection = DriverManager.getConnection(url, username, password);//获取连接
        System.out.println(connection + "连接成功");


        String sql_1 = "create table connect(id int primary key auto_increment,title varchar(20),content varchar(20))";
        PreparedStatement preparedStatement = connection.prepareStatement(sql_1);   //创建一个预编译语句对象，一般都是用这个而不用Statement


        try {
            boolean execute = preparedStatement.execute();  //执行预编译语句，返回结果集
            System.out.println(execute);

            if (!execute) {
                System.out.println("创建表成功");
            } else {
                System.out.println("创建表失败");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        String sql_2 = "insert into connect(title,content) values(?,?)";  //插入数据
        PreparedStatement preparedStatement1 = connection.prepareStatement(sql_2);  //创建一个预编译语句对象，一般都是用这个而不用Statement

        for (int i = 0; i < 5; i++) {
            preparedStatement1.setString(1, "今日大标题 " + i);
            preparedStatement1.setString(2, "今日大新闻 " + i);
            int row = preparedStatement1.executeUpdate();
            if (row > 0) {
                System.out.println("插入成功");
            } else {
                System.out.println("未插入成功");
            }

        }


        preparedStatement.close();
        connection.close();
    }
}
