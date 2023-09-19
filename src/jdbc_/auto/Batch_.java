package jdbc_.auto;

import jdbc_.utils_.JDBCUtils_;
import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.PreparedStatement;


public class Batch_ {

    //��ͳ���������5000�����ݵ�admin2

    @Test
    public void noBatch() throws Exception {

        Connection connection = JDBCUtils_.getConnection();
        String sql = "insert into admin2 values(null, ?, ?)";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        System.out.println("��ʼִ��");
        long start = System.currentTimeMillis();//��ʼʱ��
        for (int i = 0; i < 5000; i++) {//5000ִ��
            preparedStatement.setString(1, "jack" + i);
            preparedStatement.setString(2, "666");
            preparedStatement.executeUpdate();
        }
        long end = System.currentTimeMillis();
        System.out.println("��ͳ�ķ�ʽ ��ʱ=" + (end - start));//��ͳ�ķ�ʽ ��ʱ=10702
        //�ر�����
        JDBCUtils_.close(null, preparedStatement, connection);
    }

    //ʹ��������ʽ�������
    @Test
    public void batch() throws Exception {

        Connection connection = JDBCUtils_.getConnection();
        String sql = "insert into admin2 values(null, ?, ?)";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        System.out.println("��ʼִ��");
        long start = System.currentTimeMillis();//��ʼʱ��
        for (int i = 0; i < 5000; i++) {//5000ִ��
            preparedStatement.setString(1, "jack" + i);
            preparedStatement.setString(2, "666");
            //��sql �����뵽��������� -> ��Դ��
            /*
            //1. //��һ�ʹ��� ArrayList - elementData => Object[]
            //2. elementData => Object[] �ͻ�������Ԥ�����sql���
            //3. ��elementData����,�Ͱ���1.5����
            //4. ����ӵ�ָ����ֵ�󣬾�executeBatch
            //5. ���������������Ƿ���sql�������翪�������Ҽ��ٱ�����������Ч�����
            public void addBatch() throws SQLException {
                synchronized(this.checkClosed().getConnectionMutex()) {
                    if (this.batchedArgs == null) {

                        this.batchedArgs = new ArrayList();
                    }

                    for(int i = 0; i < this.parameterValues.length; ++i) {
                        this.checkAllParametersSet(this.parameterValues[i], this.parameterStreams[i], i);
                    }

                    this.batchedArgs.add(new PreparedStatement.BatchParams(this.parameterValues, this.parameterStreams, this.isStream, this.streamLengths, this.isNull));
                }
            }

             */
            preparedStatement.addBatch();
            //����1000����¼ʱ��������ִ��
            if((i + 1) % 1000 == 0) {//��1000��sql
                preparedStatement.executeBatch();
                //���һ��
                preparedStatement.clearBatch();
            }
        }
        long end = System.currentTimeMillis();
        System.out.println("������ʽ ��ʱ=" + (end - start));//������ʽ ��ʱ=108
        //�ر�����
        JDBCUtils_.close(null, preparedStatement, connection);
    }
}
