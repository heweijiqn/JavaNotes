/**
 * @author 何伟健
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
        //获取相关的值
        String username = properties.getProperty("username");
        String password = properties.getProperty("password");
        String driverClassName = properties.getProperty("driverClassName");
        String url = properties.getProperty("url");

        Class.forName(driverClassName);  //加载驱动程序
        Connection connection = DriverManager.getConnection(url, username, password);//获取连接
        //3. 得到PreparedStatement
        //3.1 组织SqL , Sql 语句的 ? 就相当于占位符
        //添加记录
        //String sql = "insert into admin values(?, ?)";
        //String sql = "update admin set pwd = ? where name = ?";
        String sql = "insert into connect (title,content) values (?,?)";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        //3.3 给 ? 赋值
        preparedStatement.setString(1,"今天的秘密 ");
        preparedStatement.setString(2,"是今天很爱你呀 ");


        int rows = preparedStatement.executeUpdate();
        System.out.println(rows > 0 ? "执行成功" : "执行失败");

        connection.close();
        preparedStatement.close();

    }
}
