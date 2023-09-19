/**
 * @auther 何伟健
 * @date 2022/8/3 14:18
 */


package tcpudp.socket_;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class SocketTCP_char_Serve {
    public static void main(String[] args) throws IOException {
        //1. 在本机 的8o8o端口监听, 等待连接
        //   细节: 要求在本机没有其它服务在监听8080端口, 否则会报错
        //   细节：这个 ServerSocket 可以通过 accept() 返回多个Socket[多个客户端连接服务器的并发]
        ServerSocket serverSocket = new ServerSocket(8080);
        System.out.println("服务端，在9999端口监听，等待连接..");
        Socket socket =serverSocket.accept();
        System.out.println("服务端，收到一个连接，开始处理..");

        InputStream inputStream = socket.getInputStream();
        BufferedReader gbk = new BufferedReader((new InputStreamReader((inputStream), "GBK")));
        char[] buff = new char[1024];
        int readLen = 0;
        //当返回 -1 时，就表示文件读取完毕
        while ((readLen = gbk.read(buff)) != -1) {
            System.out.println(new String(buff, 0, readLen));

        }

        OutputStream outputStream = socket.getOutputStream();
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter((outputStream), "GBK"));
        bw.write("我知道了");
        bw.flush();
        socket.shutdownOutput();


        gbk.close();
        bw.close();
        socket.close(); //关闭连接
        serverSocket.close(); //关闭监听


    }
}
