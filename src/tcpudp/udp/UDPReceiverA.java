/**
 * @author ��˳ƽ
 * @version 1.0
 * @date 2022/8/3 16:00
 */


package tcpudp.udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class UDPReceiverA {
    public static void main(String[] args) throws IOException {
        //1. ����һ�� DatagramSocket ����׼����9999��������
        DatagramSocket socket = new DatagramSocket(9999);

        //2. ����һ�� DatagramPacket ����׼����������
        //   ��ǰ�潲��UDP Э��ʱ����ʦ˵��һ�����ݰ���� 64k
        byte[] buf = new byte[1024];
        DatagramPacket packet = new DatagramPacket(buf, buf.length);
        //3. ���� ���շ���, ��ͨ�����紫��� DatagramPacket ����
        //   ��䵽 packet����
        //��ʦ��ʾ: �������ݰ����͵� ������9999�˿�ʱ���ͻ���յ�����
        //   ���û�����ݰ����͵� ������9999�˿�, �ͻ������ȴ�.
        System.out.println("���ն�A �ȴ���������..");
        socket.receive(packet);

        //4. ���԰�packet ���в����ȡ�����ݣ�����ʾ.
        int length = packet.getLength();//ʵ�ʽ��յ��������ֽڳ���
        byte[] data = packet.getData();//���յ�����
        String s = new String(data, 0, length);
        System.out.println(s);


        //===�ظ���Ϣ��B��
        //����Ҫ���͵����ݣ���װ�� DatagramPacket����
        data = "�õ�, �����".getBytes();
        //˵��: ��װ�� DatagramPacket���� data �����ֽ����� , data.length , ����(IP) , �˿�
        packet =
                new DatagramPacket(data, data.length, InetAddress.getByName("192.168.31.215"), 9998);

        socket.send(packet);//����


        //5. �ر���Դ
        socket.close();
        System.out.println("A���˳�...");
    }
}
