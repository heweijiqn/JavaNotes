/**
 * @author ��˳ƽ
 * @version 1.0
 * @date 2022/8/3 16:07
 */


package tcpudp.udp;

import java.io.IOException;
import java.net.*;

public class UDPSenderB {
    public static void main(String[] args) throws IOException {
        //1.���� DatagramSocket ����׼����9998�˿� ��������
        DatagramSocket socket = new DatagramSocket(9998);

        //2. ����Ҫ���͵����ݣ���װ�� DatagramPacket����
        byte[] data = "�Ǹ�����Ի��~".getBytes(); //��Ҫ���͵�����

        //˵��: ��װ�� DatagramPacket���� data �����ֽ����� , data.length , ����(IP) , �˿�
        DatagramPacket packet =
                new DatagramPacket(data, data.length, InetAddress.getByName("192.168.31.215"), 9999);

        socket.send(packet);



        //3.=== ���մ�A�˻ظ�����Ϣ
        //(1)   ����һ�� DatagramPacket ����׼����������
        //   ��ǰ�潲��UDP Э��ʱ����ʦ˵��һ�����ݰ���� 64k
        byte[] buf = new byte[1024];
        packet = new DatagramPacket(buf, buf.length);
        //(2)    ���� ���շ���, ��ͨ�����紫��� DatagramPacket ����
        //   ��䵽 packet����
        //��ʦ��ʾ: �������ݰ����͵� ������9998�˿�ʱ���ͻ���յ�����
        //   ���û�����ݰ����͵� ������9998�˿�, �ͻ������ȴ�.
        System.out.println("���ն�B �ȴ���������..");
        socket.receive(packet);

        //(3)  ���԰�packet ���в����ȡ�����ݣ�����ʾ.
        int length = packet.getLength();//ʵ�ʽ��յ��������ֽڳ���
        data = packet.getData();//���յ�����
        String s = new String(data, 0, length);
        System.out.println(s);




        socket.close();
        System.out.println("B�˿��ѹر�");
    }
}
