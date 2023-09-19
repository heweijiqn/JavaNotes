/**
 * @author ��ΰ��
 * @version 1.0
 * @date 2022/8/13 14:20
 */


package jdbc_.sql_;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;
import java.util.Scanner;


@SuppressWarnings("all")
public class prepare {

        public static void main(String[] args) throws Exception {

            Scanner scanner = new Scanner(System.in);

            //���û��������Ա��������
            System.out.print("���������Ա������: ");
            //next(): �����յ� �ո���� '���Ǳ�ʾ����
            String admin_name = scanner.nextLine();
            System.out.print("���������Ա������: ");
            String admin_pwd = scanner.nextLine(); // ���ϣ������SQLע�룬������Ҫ��nextLine

            //ͨ��Properties�����ȡ�����ļ�����Ϣ


            Properties properties = new Properties();
            properties.load(new FileInputStream("src\\du.properties"));
            //��ȡ��ص�ֵ
            String user = properties.getProperty("user");
            String password = properties.getProperty("password");
            String driver = properties.getProperty("driver");
            String url = properties.getProperty("url");

            //1. ע������
            Class.forName(driver);//����д��

            //2. �õ�����
            Connection connection = DriverManager.getConnection(url, user, password);

            //3. �õ�Statement
            Statement statement = connection.createStatement();   //����һ������������
            //4. ��֯SqL
            String sql = "select name , pwd  from admin where name ='"
                    + admin_name + "' and pwd = '" + admin_pwd + "'";
            ResultSet resultSet = statement.executeQuery(sql);
            if (resultSet.next()) { //�����ѯ��һ����¼����˵���ù������
                System.out.println("��ϲ�� ��¼�ɹ�");
            } else {
                System.out.println("�Բ��𣬵�¼ʧ��");
            }

            //�ر�����
            resultSet.close();
            statement.close();
            connection.close();

        }

}
