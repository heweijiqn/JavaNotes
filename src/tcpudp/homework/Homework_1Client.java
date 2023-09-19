package tcpudp.homework;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Scanner;

/**
 * �ͻ��ˣ����� "hello, server" ������ˣ� ʹ���ַ���
 */
@SuppressWarnings({"all"})
public class Homework_1Client {
    public static void main(String[] args) throws IOException {
        //˼·
        //1. ���ӷ���� (ip , �˿ڣ�
        //���: ���ӱ����� 9999�˿�, ������ӳɹ�������Socket����
        Socket socket = new Socket(InetAddress.getLocalHost(), 9999);

        //2. �����Ϻ�����Socket, ͨ��socket.getOutputStream()
        //   �õ� �� socket������������������
        OutputStream outputStream = socket.getOutputStream();
        //3. ͨ���������д�����ݵ� ����ͨ��, ʹ���ַ���
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream));

        //�Ӽ��̶�ȡ�û�������
        Scanner scanner = new Scanner(System.in);
        System.out.println("�������������");
        String question = scanner.next();

        bufferedWriter.write(question);

        bufferedWriter.flush();// ���ʹ�õ��ַ�������Ҫ�ֶ�ˢ�£��������ݲ���д������ͨ��
        socket.shutdownOutput();// д�����ݣ��ر�����������ٷ�������


        //4. ��ȡ��socket������������. ��ȡ����(�ַ�)������ʾ
        InputStream inputStream = socket.getInputStream();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        String answer;
        while ((answer = bufferedReader.readLine()) != null) {
            System.out.println(answer);
        }

        //5. �ر��������socket, ����ر�
        bufferedReader.close();//�ر������
        bufferedWriter.close();
        socket.close();
        System.out.println("�ͻ����˳�.....");
    }
}
