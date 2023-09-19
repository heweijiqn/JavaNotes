/**
 * @author hwj
 * @version 1.0
 * @date 2022/8/4 2:45
 * 该类完成用户登录验证和用户注册等功能.
 */


package qqclient.service;

import com.Message;
import com.MessageType;
import com.User;


import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.InetAddress;
import java.net.Socket;

public class UserClientService {
    //因为我们可能在其他地方用使用user信息, 因此作出成员属性
    private User user =new User();
    //因为Socket在其它地方也可能使用，因此作出属性
    private Socket socket ;

    private Message ms;

    public boolean checkUser(String userId, String pwd){
        boolean flag = false;
        user.setUserId(userId);
        user.setPasswd(pwd);

        //连接到服务端，发送u对象
        try {
            socket = new Socket(InetAddress.getByName("127.0.0.1"), 9999);

            //得到ObjectOutputStream对象
            ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
            oos.writeObject(user);//发送User对象

            //读取从服务器回复的Message对象
            ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());
            ms = (Message) ois.readObject();

            if (ms.getMesType().equals(MessageType.MESSAGE_LOGIN_SUCCEED)) {//登录成功



                //创建一个和服务器端保持通信的线程-> 创建一个类 ClientConnectServerThread
                //创建一个和服务器端保持通信的线程-> 创建一个类 ClientConnectServerThread
                ClientConnectServerThread clientConnectServerThread =
                        new ClientConnectServerThread(socket);
                //启动客户端的线程
                clientConnectServerThread.start();
                ManageClientConnectServerThread.addClientConnectServerThread(userId, clientConnectServerThread);


                flag = true;

            }else {
                System.out.println("登录失败");
                socket.close();
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        return flag;

    }
    //向服务器端请求在线用户列表
    public void onlineFriendList() {

        //发送一个Message , 类型MESSAGE_GET_ONLINE_FRIEND
        Message message = new Message();
        message.setMesType(MessageType.MESSAGE_GET_ONLINE_FRIEND);
        message.setSender(user.getUserId());

        //发送给服务器

        try {
            //从管理线程的集合中，通过userId, 得到这个线程对象
            ClientConnectServerThread clientConnectServerThread =
                    ManageClientConnectServerThread.getClientConnectServerThread(user.getUserId());
            //通过这个线程得到关联的socket
            Socket socket = clientConnectServerThread.getSocket();
            //得到当前线程的Socket 对应的 ObjectOutputStream对象
            ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
            oos.writeObject(message); //发送一个Message对象，向服务端要求在线用户列表
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    public void logout() {
        Message message = new Message();
        message.setMesType(MessageType.MESSAGE_CLIENT_EXIT);
        message.setSender(user.getUserId());//一定要指定我是哪个客户端id

        //发送message
        try {
            //ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
            ObjectOutputStream oos =
                    new ObjectOutputStream(ManageClientConnectServerThread.getClientConnectServerThread(user.getUserId()).getSocket().getOutputStream());
            oos.writeObject(message);
            System.out.println(user.getUserId() + " 退出系统 ");
            System.exit(0);//结束进程
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
