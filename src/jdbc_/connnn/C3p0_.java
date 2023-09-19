/**
 * @author 何伟健
 * @version 1.0
 * @date 2022/8/14 9:36
 */


package jdbc_.connnn;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.util.Properties;

@SuppressWarnings("all")
public class C3p0_ {
    public static void main(String[] args) throws Exception {
        /*
        //1. 创建一个数据源对象
        ComboPooledDataSource comboPooledDataSource = new ComboPooledDataSource();
        //2. 获取配置文件的信息
        Properties properties = new Properties();
        properties.load(new FileInputStream("src\\druid.properties"));
        //获取相关的值
        String username = properties.getProperty("username");
        String password = properties.getProperty("password");
        String driverClassName = properties.getProperty("driverClassName");
        String url = properties.getProperty("url");

        //3. 设置数据源的属性
        comboPooledDataSource.setUser(username);
        comboPooledDataSource.setPassword(password);
        comboPooledDataSource.setJdbcUrl(url);
        comboPooledDataSource.setDriverClass(driverClassName);

        //4.初始化连接数
        comboPooledDataSource.setInitialPoolSize(5);
        //5.最大连接数
        comboPooledDataSource.setMaxPoolSize(10);
        */

        //1. 将 c3p0 提供的 c3p0.config.xml 拷贝到 src 目录下
        //2. 该文件指定了连接数据库和连接池的相关参数
        ComboPooledDataSource comboPooledDataSource = new ComboPooledDataSource("hwj");  //创建一个数据源对象，并且指定数据源的名称
        //测试连接池的效率, 测试对mysql 5000次操作的效率
        long start = System.currentTimeMillis();
        for (int i = 0; i < 500000; i++) {
            Connection connection = comboPooledDataSource.getConnection(); //这个方法就是从 DataSource 接口实现的
            //System.out.println("连接OK");
            connection.close();
        }
        long end = System.currentTimeMillis();
        //c3p0 5000连接mysql 耗时=391
        System.out.println("c3p0 5000连接mysql 耗时=" + (end - start));

    }
}
