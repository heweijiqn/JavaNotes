package tcpudp.homework;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author ��˳ƽ
 * @version 1.0
 * �����, ʹ���ַ�����ʽ��д
 */
@SuppressWarnings({"all"})
public class Homework_1Server {
    public static void main(String[] args) throws IOException {
        //˼·
        //1. �ڱ��� ��9999�˿ڼ���, �ȴ�����
        //   ϸ��: Ҫ���ڱ���û�����������ڼ���9999
        //   ϸ�ڣ���� ServerSocket ����ͨ�� accept() ���ض��Socket[����ͻ������ӷ������Ĳ���]
        ServerSocket serverSocket = new ServerSocket(9999);
        System.out.println("����ˣ���9999�˿ڼ������ȴ�����..");
        //2. ��û�пͻ�������9999�˿�ʱ������� ����, �ȴ�����
        //   ����пͻ������ӣ���᷵��Socket���󣬳������

        Socket socket = serverSocket.accept();

        //
        //3. ͨ��socket.getInputStream() ��ȡ�ͻ���д�뵽����ͨ��������, ��ʾ
        InputStream inputStream = socket.getInputStream();
        //4. IO��ȡ, ʹ���ַ���, ��ʦʹ�� InputStreamReader �� inputStream ת���ַ���
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        String s = bufferedReader.readLine();
        String answer = "";
        if ("name".equals(s)) {
            answer = "���Ǻ�˳ƽ";
        } else if("hobby".equals(s)) {
            answer = "��дjava����";
        } else {
            answer = "��˵��ɶ��";
        }



        //5. ��ȡsocket������������
        OutputStream outputStream = socket.getOutputStream();
        //    ʹ���ַ�������ķ�ʽ�ظ���Ϣ
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream));
        bufferedWriter.write(answer);
        bufferedWriter.newLine();// ����һ�����з�����ʾ�ظ����ݵĽ���
        bufferedWriter.flush();//ע����Ҫ�ֶ���flush


        //6.�ر�����socket
        bufferedWriter.close();
        bufferedReader.close();
        socket.close();
        serverSocket.close();//�ر�

    }
}
