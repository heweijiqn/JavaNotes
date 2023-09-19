/**
 * @auther ��ΰ��
 * @date 2022/8/3 14:06
 */


package tcpudp.socket_;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Api_ {
    public static void main(String[] args) throws UnknownHostException {

        //1. ��ȡ������InetAddress ����
        InetAddress localHost = InetAddress.getLocalHost();
        System.out.println(localHost);//LAPTOP-8CJJ6PDN/192.168.12.1

        //2. ����ָ�������� ��ȡ InetAddress����
        InetAddress host1 = InetAddress.getByName("LAPTOP-8CJJ6PDN");
        System.out.println("host1=" + host1);//DESKTOP-S4MP84S/192.168.12.1

        //3. ������������ InetAddress����, ���� www.baidu.com ��Ӧ
        InetAddress host2 = InetAddress.getByName("www.baidu.com");
        System.out.println("host2=" + host2);//www.baidu.com / 110.242.68.4

        //4. ͨ�� InetAddress ���󣬻�ȡ��Ӧ�ĵ�ַ ������ַ��ip
        String hostAddress = host2.getHostAddress();//IP 110.242.68.4
        System.out.println("host2 ��Ӧ��ip = " + hostAddress);//110.242.68.4

        //5. ͨ�� InetAddress ���󣬻�ȡ��Ӧ��������/���ߵ�����
        String hostName = host2.getHostName();
        System.out.println("host2��Ӧ��������/����=" + hostName); // www.baidu.com

        //��ȡ������ip��ַ
        String ip = InetAddress.getLocalHost().getHostAddress();
        System.out.println("������ip��ַ=" + ip);





    }
}
