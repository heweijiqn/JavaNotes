/**
 * @author hwj
 * @version 1.0
 * @date 2022/8/4 2:58
 */


package qqclient.service;

import com.Message;
import com.MessageType;
import qqserver.qqview.service.OffLineMessageService;

import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.net.Socket;
import java.util.ArrayList;

public class ClientConnectServerThread extends Thread {
    private Socket socket; //用于和服务器通信的Socket

    private Message message; //用于接收从服务器发送的消息

   ;

    public ClientConnectServerThread(Socket socket) { //构造方法 传入一个Socket对象 作为参数
        this.socket = socket;
    }

    //为了更方便的得到Socket
    public Socket getSocket() {
        return socket;
    }

    @Override
    public void run() {    //重写run方法   实现线程的具体功能  实现接收服务器发送的消息
        while (true) {
            try {
                //接收服务器发送的消息
                System.out.println("客户端线程，等待从读取从服务器端发送的消息");
                ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());
                //如果服务器没有发送Message对象,线程会阻塞在这里
                 message= (Message) ois.readObject();
                //发送离线信息 如果服务器发送的是离线消息，则执行下面的代码
                if(OffLineMessageService.getOffLineDb().containsKey(message.getGetter())){
                    System.out.println("客户端线程，接收到离线消息");
                    ArrayList<Message> offLineMessage = OffLineMessageService.getOffLineDb().get(message.getGetter());
                    for(Message m:offLineMessage){
                        System.out.println(m.getGetter()+"发送的离线消息："+m.getContent());
                    }
                    OffLineMessageService.getOffLineDb().remove(message.getGetter());
                }




                //如果是读取到的是 服务端返回的在线用户列表
                if (message.getMesType().equals(MessageType.MESSAGE_RET_ONLINE_FRIEND)) {
                    //取出在线列表信息，并显示
                    //规定
                    String[] onlineUsers = message.getContent().split(" ");
                    System.out.println("\n=======当前在线用户列表========");
                    for (int i = 0; i < onlineUsers.length; i++) {
                        System.out.println("用户: " + onlineUsers[i]);
                    }
                }else if (message.getMesType().equals(MessageType.MESSAGE_COMM_MES)) {//普通的聊天消息
                    //把从服务器转发的消息，显示到控制台即可
                    //私聊对象要存在  不存在的话不发送信息 不显示到控制台

                    System.out.println("\n" + message.getSender()
                            + " 对 " + message.getGetter() + " 说: " + message.getContent());
                }else if (message.getMesType().equals(MessageType.MESSAGE_TO_ALL_MES)) {
                    //显示在客户端的控制台
                    System.out.println("\n" + message.getSender() + " 对大家说: " + message.getContent());
                }else if (message.getMesType().equals(MessageType.MESSAGE_FILE_MES)) {//如果是文件消息
                    //让用户指定保存路径。。。
                    System.out.println("\n" + message.getSender() + " 给 " + message.getGetter()
                            + " 发文件: " + message.getSrc() + " 到我的电脑的目录 " + message.getDest());

                    //取出message的文件字节数组，通过文件输出流写出到磁盘
                    FileOutputStream fileOutputStream = new FileOutputStream(message.getDest(), true);
                    fileOutputStream.write(message.getFileBytes());
                    fileOutputStream.close();
                    System.out.println("\n 保存文件成功~");

                }

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
