/**
 * @auther 何伟健
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

        bw.write("你好");
        // 如果使用的字符流，需要手动刷新，否则数据不会写入数据通道中
        bw.flush();
//        bufferedWriter.newLine();//插入一个换行符，表示写入的内容结束, 注意，要求对方使用readLine()!!!!
//        bufferedWriter.flush();// 如果使用的字符流，需要手动刷新，否则数据不会写入数据通道
        socket.shutdownOutput();// 写完数据，关闭输出流，不再发送数据



        BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream(), "GBK"));

        char[] buff = new char[1024];
        int readLen = 0;
        //当返回 -1 时，就表示文件读取完毕
        while ((readLen = br.read(buff)) != -1) {
            System.out.println(new String(buff, 0, readLen));

        }



        br.close();
        bw.close();
        socket.close();





    }
}
