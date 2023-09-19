/**
 * @author 何伟健
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
    //方式1
    @Test
    public void connect01() throws SQLException {
        Driver driver = new Driver(); //创建driver对象
        String url = "jdbc:mysql://localhost:3306/db02";
        //将 用户名和密码放入到Properties 对象
        Properties properties = new Properties();
        //说明 user 和 password 是规定好，后面的值根据实际情况写
        properties.setProperty("user", "root");// 用户
        properties.setProperty("password", "123456"); //密码
        Connection connect = driver.connect(url, properties);
        System.out.println(connect);  //com.mysql.jdbc.JDBC4Connection@3d121db3
    }

    //方式2
    @Test
    public void connect02() throws ClassNotFoundException, IllegalAccessException, InstantiationException, SQLException {
        //使用反射加载Driver类 , 动态加载，更加的灵活，减少依赖性
        Class<?> aClass = Class.forName("com.mysql.jdbc.Driver");
        Driver driver = (Driver)aClass.newInstance();  //创建driver对象  反射  动态加载 加载驱动类

        String url = "jdbc:mysql://localhost:3306/db02";
        //将 用户名和密码放入到Properties 对象
        Properties properties = new Properties();
        //说明 user 和 password 是规定好，后面的值根据实际情况写
        properties.setProperty("user", "root");// 用户
        properties.setProperty("password", "123456"); //密码

        Connection connect = driver.connect(url, properties);
        System.out.println( connect);  //com.mysql.jdbc.JDBC4Connection@3d121db3

    }

    //方式3 使用DriverManager 替代 driver 进行统一管理
    @Test
    public void connect03() throws IllegalAccessException, InstantiationException, ClassNotFoundException, SQLException {

        //使用反射加载Driver
        Class<?> aClass = Class.forName("com.mysql.jdbc.Driver");
        Driver driver = (Driver) aClass.newInstance(); //创建driver对象  反射  动态加载 加载驱动类

        //创建url 和 user 和 password
        String url = "jdbc:mysql://localhost:3306/db02";
        String user = "root";
        String password = "123456";

        DriverManager.registerDriver(driver);  //注册驱动类

        Connection connection = DriverManager.getConnection(url, user, password);
        System.out.println( connection);  //com.mysql.jdbc.JDBC4Connection@3b07a0d6
    }

    //方式4: 使用Class.forName 自动完成注册驱动，简化代码
    //这种方式获取连接是使用的最多，推荐使用
    @Test
    public void connect04() throws ClassNotFoundException, SQLException {
        //使用反射加载了 Driver类
        //在加载 Driver类时，完成注册
        /*
            源码: 1. 静态代码块，在类加载时，会执行一次.
            2. DriverManager.registerDriver(new Driver());
            3. 因此注册driver的工作已经完成
            static {
                try {
                    DriverManager.registerDriver(new Driver());
                } catch (SQLException var1) {
                    throw new RuntimeException("Can't register driver!");
                }
            }
         */
        Class<?> aClass = Class.forName("com.mysql.jdbc.Driver");

        //创建url 和 user 和 password
        String url = "jdbc:mysql://localhost:3306/db02";
        String user = "root";
        String password = "123456";
        Connection connection = DriverManager.getConnection(url, user, password);

        System.out.println(connection);  //com.mysql.jdbc.JDBC4Connection@3d121db3

    }

    //方式5 , 在方式4的基础上改进，增加配置文件，让连接mysql更加灵活
    @Test
    public void connect05() throws IOException, ClassNotFoundException, SQLException {

        //通过Properties对象获取配置文件的信息
        Properties properties = new Properties();
        properties.load(new FileInputStream("src\\druid.properties"));
        //获取相关的值
        String user = properties.getProperty("username");
        String password = properties.getProperty("password");
        String driver = properties.getProperty("driverClassName");
        String url = properties.getProperty("url");

        Class.forName(driver);//建议写上  动态加载  加载驱动类

        Connection connection = DriverManager.getConnection(url, user, password);//

        System.out.println(connection);  //com.mysql.jdbc.JDBC4Connection@3d121db3


    }

}
