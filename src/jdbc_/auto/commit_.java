/**
 * @author 何伟健
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
        Connection connection = null; // 得到连接
        PreparedStatement preparedStatement = null;  // 组织一个sql
        String sql = "update account set balance = balance - 100 where id = ?";
        String sql2 = "update account set balance = balance + 100 where id = ?";
        Savepoint savepoint = null; // 事务的保存点


        try {
            connection = JDBCUtils_.getConnection();
            connection.setAutoCommit(false); // 关闭自动提交
            savepoint = connection.setSavepoint("savepointB"); // 创建一个保存点


            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, "2");
            preparedStatement.executeUpdate();
            int i = 1 / 0; // 模拟异常
            preparedStatement = connection.prepareStatement(sql2);
            preparedStatement.setString(1, "1");
            preparedStatement.executeUpdate();

            connection.commit(); // 提交事务


        } catch (SQLException e) {
            try { // 出现异常，回滚到保存点
                connection.rollback(savepoint); // 撤销事务
            } catch (SQLException ex) {
                throw new RuntimeException(ex);
            }
            throw new RuntimeException(e);
        } finally {
            JDBCUtils_.close(null, preparedStatement, connection);
        }


    }
}
