/**
 * @author ��ΰ��
 * @version 1.0
 * @date 2022/8/14 16:35
 */


package jdbc_.utils_;

import org.junit.jupiter.api.Test;

import javax.xml.transform.Result;
import java.sql.*;
import java.util.ArrayList;

public class JDBCUse_Druid {
    public static void main(String[] args) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        String sql = "select * from connect where id = ?";

        /*try {
            connection = JDBCUtilsByDruid.getConnection();
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, "1");
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                System.out.println(resultSet.getString("id") + " " +
                        resultSet.getString("title") + " " + resultSet.getString("content"));
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            JDBCUtilsByDruid.close(resultSet, preparedStatement, connection);
        }*/
        JDBCUse_Druid.testSelectToArrayList();  //����selectToArrayList����
    }
    @Test
    public  static ArrayList<Actor> testSelectToArrayList() {

        //1. �õ�����
        Connection connection = null;
        //2. ��֯һ��sql
        String sql = "select * from actor where id >= ?";
        PreparedStatement preparedStatement = null;
        ResultSet set = null;
        ArrayList<Actor> list = new ArrayList<>();//����ArrayList����,���actor����
        //3. ����PreparedStatement ����
        try {
            connection = JDBCUtilsByDruid.getConnection();
            System.out.println(connection.getClass());//�������� com.alibaba.druid.pool.DruidPooledConnection
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, 1);//��?�Ÿ�ֵ
            //ִ��, �õ������
            set = preparedStatement.executeQuery();

            //�����ý����
            while (set.next()) {
                int id = set.getInt("id");
                String name = set.getString("name");//getName()
                String sex = set.getString("sex");//getSex()
                Date borndate = set.getDate("borndate");
                String phone = set.getString("phone");
                //�ѵõ���resultset �ļ�¼����װ�� Actor���󣬷��뵽list����
                list.add(new Actor(id, name, sex, borndate, phone));
            }

            System.out.println("list��������=" + list);
            for(Actor actor : list) {
                System.out.println("id=" + actor.getId() + "\t" + actor.getName());
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            //�ر���Դ
            JDBCUtilsByDruid.close(set, preparedStatement, connection);
        }
        //��ΪArrayList �� connection û���κι��������Ըü��Ͽ��Ը���.
        return  list;
    }

}
