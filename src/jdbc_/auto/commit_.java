/**
 * @author ��ΰ��
 * @version 1.0
 * @date 2022/8/13 18:51
 */


package jdbc_.auto;

import jdbc_.utils_.JDBCUtils_;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Savepoint;

@SuppressWarnings("all")
public class commit_ {
    public static void main(String[] args) {
        Connection connection = null; // �õ�����
        PreparedStatement preparedStatement = null;  // ��֯һ��sql
        String sql = "update account set balance = balance - 100 where id = ?";
        String sql2 = "update account set balance = balance + 100 where id = ?";
        Savepoint savepoint = null; // ����ı����


        try {
            connection = JDBCUtils_.getConnection();
            connection.setAutoCommit(false); // �ر��Զ��ύ
            savepoint = connection.setSavepoint("savepointB"); // ����һ�������


            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, "2");
            preparedStatement.executeUpdate();
            int i = 1 / 0; // ģ���쳣
            preparedStatement = connection.prepareStatement(sql2);
            preparedStatement.setString(1, "1");
            preparedStatement.executeUpdate();

            connection.commit(); // �ύ����


        } catch (SQLException e) {
            try { // �����쳣���ع��������
                connection.rollback(savepoint); // ��������
            } catch (SQLException ex) {
                throw new RuntimeException(ex);
            }
            throw new RuntimeException(e);
        } finally {
            JDBCUtils_.close(null, preparedStatement, connection);
        }


    }
}
