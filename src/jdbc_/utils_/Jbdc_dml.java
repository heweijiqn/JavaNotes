/**
 * @author 何伟健
 * @version 1.0
 * @date 2022/8/13 18:00
 */


package jdbc_.utils_;

import java.sql.*;
import jdbc_.utils_.JDBCUtils_;

public class Jbdc_dml {
    public static void main(String[] args) {
        //1. 得到连接
        Connection connection = null;
        //2. 组织一个sql
        String sql = "insert into connect values(?,?,?)";
        // 测试 delete 和 insert 操作
        PreparedStatement preparedStatement = null;

        try {
            connection = JDBCUtils_.getConnection();
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1,null);
            preparedStatement.setString(2,"今天的秘密 ");
            preparedStatement.setString(3,"是今天很爱你呀 ");
            int i = preparedStatement.executeUpdate();
            System.out.println(i > 0 ? "执行成功" : "执行失败");
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JDBCUtils_.close(null, preparedStatement, connection);
        }


    }
}
