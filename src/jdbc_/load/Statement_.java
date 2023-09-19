/**
 * @author ��ΰ��
 * @version 1.0
 * @date 2022/8/12 15:21
 */


package jdbc_.load;

import com.mysql.jdbc.Driver;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class Statement_ {
    public static void main(String[] args) throws SQLException {
        //1. ע������
        Driver driver = new Driver(); //����driver����

        //2. �õ�����
        //(1) jdbc:mysql:// �涨�ñ�ʾЭ�飬ͨ��jdbc�ķ�ʽ����mysql
        //(2) localhost ������������ip��ַ
        //(3) 3306 ��ʾmysql�����Ķ˿�
        //(4) db02 ���ӵ�mysql dbms ���ĸ����ݿ�
        //(5) mysql�����ӱ��ʾ���ǰ��ѧ����socket����
        String url = "jdbc:mysql://localhost:3306/db02";
        //�� �û�����������뵽Properties ����
        Properties properties = new Properties();
        //˵�� user �� password �ǹ涨�ã������ֵ����ʵ�����д
        properties.setProperty("user", "root");// �û�
        properties.setProperty("password", "123456"); //����
        Connection connect = driver.connect(url, properties);

        //3. ִ��sql
        String sql = "insert into actor values(null, '���»�', '��', '1970-11-11', '110')";
        //String sql = "update actor set name='���ǳ�' where id = 1";
        //String sql = "delete from actor where id = 1";
        //statement ����ִ�о�̬SQL��䲢���������ɵĽ���Ķ���
        Statement statement = connect.createStatement();  //�˷����ᵼ��sqlע��
        int rows = statement.executeUpdate(sql); // ����� dml��䣬���صľ���Ӱ������  �����dql��䣬���صľ��ǽ����

        System.out.println(rows > 0 ? "�ɹ�" : "ʧ��");

        //4. �ر�������Դ
        statement.close();
        connect.close();

    }
}
