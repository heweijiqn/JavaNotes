/**
 * @author 何伟健
 * @version 1.0
 * @date 2022/8/13 17:33
 */


package jdbc_.utils_;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;

public class JDBCUtils_ {
    //定义相关的属性(4个), 因为只需要一份，因此，我们做出static
    private static String username; //用户名
    private static String password; //密码
    private static String url; //url

    private static String driverClassName; //驱动名

    //在static代码块去初始化
    static {

        try {
            Properties properties = new Properties();
            properties.load(new FileInputStream("src\\druid.properties"));

            //获取相关的值
                username = properties.getProperty("username");
                password = properties.getProperty("password");
                driverClassName = properties.getProperty("driverClassName");
                url = properties.getProperty("url");

                Class<?> aClass = Class.forName(driverClassName);//加载驱动程序


        } catch (Exception e) {
            //在实际开发中，我们可以这样处理
            //1. 将编译异常转成 运行异常
            //2. 调用者，可以选择捕获该异常，也可以选择默认处理该异常，比较方便.
            throw new RuntimeException(e);

        }
    }

    //连接数据库, 返回Connection
    public static Connection getConnection() {

        try {
            return DriverManager.getConnection(url, username, password);//获取连接
        } catch (SQLException e) {
            //1. 将编译异常转成 运行异常
            //2. 调用者，可以选择捕获该异常，也可以选择默认处理该异常，比较方便.
            throw new RuntimeException(e);
        }
    }

    //关闭相关资源
    /*
        1. ResultSet 结果集
        2. Statement 或者 PreparedStatement
        3. Connection
        4. 如果需要关闭资源，就传入对象，否则传入 null
     */
    public static void close(ResultSet set, Statement statement, Connection connection) {

        //判断是否为null
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
            //将编译异常转成运行异常抛出
            throw new RuntimeException(e);
        }

    }

}
