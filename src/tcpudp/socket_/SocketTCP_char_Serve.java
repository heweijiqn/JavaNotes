/**
 * @auther ��ΰ��
 * @date 2022/8/3 14:18
 */


package tcpudp.socket_;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class SocketTCP_char_Serve {
    public static void main(String[] args) throws IOException {
        //1. �ڱ��� ��8o8o�˿ڼ���, �ȴ�����
        //   ϸ��: Ҫ���ڱ���û�����������ڼ���8080�˿�, ����ᱨ��
        //   ϸ�ڣ���� ServerSocket ����ͨ�� accept() ���ض��Socket[����ͻ������ӷ������Ĳ���]
        ServerSocket serverSocket = new ServerSocket(8080);
        System.out.println("����ˣ���9999�˿ڼ������ȴ�����..");
        Socket socket =serverSocket.accept();
        System.out.println("����ˣ��յ�һ�����ӣ���ʼ����..");

        InputStream inputStream = socket.getInputStream();
        BufferedReader gbk = new BufferedReader((new InputStreamReader((inputStream), "GBK")));
        char[] buff = new char[1024];
        int readLen = 0;
        //������ -1 ʱ���ͱ�ʾ�ļ���ȡ���
        while ((readLen = gbk.read(buff)) != -1) {
            System.out.println(new String(buff, 0, readLen));

        }

        OutputStream outputStream = socket.getOutputStream();
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter((outputStream), "GBK"));
        bw.write("��֪����");
        bw.flush();
        socket.shutdownOutput();


        gbk.close();
        bw.close();
        socket.close(); //�ر�����
        serverSocket.close(); //�رռ���


    }
}
