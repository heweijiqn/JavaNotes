/**
 * @auther ��ΰ��
 * @date 2022/8/3 15:18
 */


package tcpudp.socket_;

import java.io.*;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class SocketTCP_byte_Server {
    public static void main(String[] args) throws IOException {

        //1. �ڱ��� ��9999�˿ڼ���, �ȴ�����
        //   ϸ��: Ҫ���ڱ���û�����������ڼ���9999
        //   ϸ�ڣ���� ServerSocket ����ͨ�� accept() ���ض��Socket[����ͻ������ӷ������Ĳ���]
        ServerSocket serverSocket = new ServerSocket(9999);
        System.out.println("����ˣ���9999�˿ڼ������ȴ�����..");
        //2. ��û�пͻ�������9999�˿�ʱ������� ����, �ȴ�����
        //   ����пͻ������ӣ���᷵��Socket���󣬳������

        Socket socket = serverSocket.accept();//���� �ȴ��ͻ�������

        System.out.println("����� socket =" + socket.getClass());  //class java.net.Socket  �ͻ������Ӻ󣬷���˷��ص���Socket����

        //3. ͨ��socket.getInputStream() ��ȡ�ͻ���д�뵽����ͨ��������, ��ʾ
        InputStream inputStream = socket.getInputStream();
        //4. IO��ȡ
        byte[] buf = new byte[1024];
        int readLen = 0;
        while ((readLen = inputStream.read(buf)) != -1) {
            System.out.println(new String(buf, 0, readLen));//���ݶ�ȡ����ʵ�ʳ��ȣ���ʾ����.
        }
        //5. ��ȡsocket������������
        OutputStream outputStream = socket.getOutputStream();
        outputStream.write("hello, client".getBytes());
        //   ���ý������
        socket.shutdownOutput();

        //6.�ر�����socket
        outputStream.close();
        inputStream.close();
        socket.close();
        serverSocket.close();//�ر�


    }
}
