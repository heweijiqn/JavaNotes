/**
 * @auther ��ΰ��
 * @date 2022/8/3 15:19
 */


package tcpudp.socket_;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;

public class SocketTCP_byteClient {
    public static void main(String[] args) throws IOException {
        //˼·
        //1. ���ӷ���� (ip , �˿ڣ�
        //���: ���ӱ����� 9999�˿�, ������ӳɹ�������Socket����
        Socket socket = new Socket(InetAddress.getLocalHost(), 9999);
        System.out.println("�ͻ��� socket����=" + socket.getClass());
        //2. �����Ϻ�����Socket, ͨ��socket.getOutputStream()
        //   �õ� �� socket������������������
        OutputStream outputStream = socket.getOutputStream();
        //3. ͨ���������д�����ݵ� ����ͨ��
        outputStream.write("hello, server".getBytes());
        //   ���ý������
        socket.shutdownOutput();

        //4. ��ȡ��socket������������. ��ȡ����(�ֽ�)������ʾ
        InputStream inputStream = socket.getInputStream();
        byte[] buf = new byte[1024];
        int readLen = 0;
        while ((readLen = inputStream.read(buf)) != -1) {
            System.out.println(new String(buf, 0, readLen));
        }

        //5. �ر��������socket, ����ر�
        inputStream.close();
        outputStream.close();
        socket.close();
        System.out.println("�ͻ����˳�.....");
    }

}
