/**
 * @auther ��ΰ��
 * @date 2022/8/3 14:26
 */


package tcpudp.socket_;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;


@SuppressWarnings("all")

public class SocketTCP_char_Client {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket(InetAddress.getByName("192.168.31.215"), 8080);

        OutputStream outputStream = socket.getOutputStream();

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter((outputStream), "Gbk"));

        bw.write("���");
        // ���ʹ�õ��ַ�������Ҫ�ֶ�ˢ�£��������ݲ���д������ͨ����
        bw.flush();
//        bufferedWriter.newLine();//����һ�����з�����ʾд������ݽ���, ע�⣬Ҫ��Է�ʹ��readLine()!!!!
//        bufferedWriter.flush();// ���ʹ�õ��ַ�������Ҫ�ֶ�ˢ�£��������ݲ���д������ͨ��
        socket.shutdownOutput();// д�����ݣ��ر�����������ٷ�������



        BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream(), "GBK"));

        char[] buff = new char[1024];
        int readLen = 0;
        //������ -1 ʱ���ͱ�ʾ�ļ���ȡ���
        while ((readLen = br.read(buff)) != -1) {
            System.out.println(new String(buff, 0, readLen));

        }



        br.close();
        bw.close();
        socket.close();





    }
}
