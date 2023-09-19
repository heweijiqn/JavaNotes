/**
 * @author ��ΰ��
 * @version 1.0
 * @date 2022/8/13 18:00
 */


package jdbc_.utils_;

import java.sql.*;
import jdbc_.utils_.JDBCUtils_;

public class Jbdc_dml {
    public static void main(String[] args) {
        //1. �õ�����
        Connection connection = null;
        //2. ��֯һ��sql
        String sql = "insert into connect values(?,?,?)";
        // ���� delete �� insert ����
        PreparedStatement preparedStatement = null;

        try {
            connection = JDBCUtils_.getConnection();
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1,null);
            preparedStatement.setString(2,"��������� ");
            preparedStatement.setString(3,"�ǽ���ܰ���ѽ ");
            int i = preparedStatement.executeUpdate();
            System.out.println(i > 0 ? "ִ�гɹ�" : "ִ��ʧ��");
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JDBCUtils_.close(null, preparedStatement, connection);
        }


    }
}
