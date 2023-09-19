/**
 * @author ºÎÎ°½¡
 * @version 1.0
 * @date 2022/8/13 18:30
 */


package jdbc_.utils_;

import java.sql.*;

import jdbc_.utils_.JDBCUtils_;

public class Select_ {
    public static void main(String[] args) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        String sql = "select * from connect";

        try {
            connection = JDBCUtils_.getConnection();
            preparedStatement = connection.prepareStatement(sql);
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                System.out.println(resultSet.getString("id") + " " +
                        resultSet.getString("title") + " " + resultSet.getString("content"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JDBCUtils_.close(resultSet, preparedStatement, connection);
        }
    };


}
