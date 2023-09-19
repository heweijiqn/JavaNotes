/**
 * @author ��ΰ��
 * @version 1.0
 * @date 2022/8/14 14:52
 */


package jdbc_.connnn;

import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.util.Properties;

public class Druid_ {
    public static void main(String[] args) throws Exception {

        //1. ���� Druid jar��
        //2. ���� �����ļ� druid.properties , �����ļ�������Ŀ��srcĿ¼
        //3. ����Properties����, ��ȡ�����ļ�
        Properties properties = new Properties();
        properties.load(new FileInputStream("src\\druid.properties"));

        DataSource dataSource =
                DruidDataSourceFactory.createDataSource(properties);

        long start = System.currentTimeMillis();
        for (int i = 0; i < 500000; i++) {
            Connection connection = dataSource.getConnection();
            //System.out.println(connection.getClass());
            //System.out.println("���ӳɹ�!");
            connection.close();
        }
        long end = System.currentTimeMillis();
        //druid���ӳ� ����5000 ��ʱ=412
        System.out.println("druid���ӳ� ����500000 ��ʱ=" + (end - start));
    }
}
