/**
 * @author 何伟健
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
public class Result_ {  //查询结果集 单行结果
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
        String sql = "select title,content from connect where title=? and content=?";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);   //创建一个预编译语句对象，一般都是用这个而不用Statement

        preparedStatement.setString(1, "今日大标题 0");
        preparedStatement.setString(2, "今日大新闻 0");

        ResultSet resultSet = preparedStatement.executeQuery();
        if (resultSet.next()) {
            System.out.println("查询成功");
        } else {
            System.out.println("查询失败");
        }
        preparedStatement.close();
        connection.close();
        resultSet.close();


    }
}
