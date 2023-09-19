/**
 * @author hwj
 * @version 1.0
 * @date 2022/8/4 2:45
 * ��������û���¼��֤���û�ע��ȹ���.
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
    //��Ϊ���ǿ����������ط���ʹ��user��Ϣ, ���������Ա����
    private User user =new User();
    //��ΪSocket�������ط�Ҳ����ʹ�ã������������
    private Socket socket ;

    private Message ms;

    public boolean checkUser(String userId, String pwd){
        boolean flag = false;
        user.setUserId(userId);
        user.setPasswd(pwd);

        //���ӵ�����ˣ�����u����
        try {
            socket = new Socket(InetAddress.getByName("127.0.0.1"), 9999);

            //�õ�ObjectOutputStream����
            ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
            oos.writeObject(user);//����User����

            //��ȡ�ӷ������ظ���Message����
            ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());
            ms = (Message) ois.readObject();

            if (ms.getMesType().equals(MessageType.MESSAGE_LOGIN_SUCCEED)) {//��¼�ɹ�



                //����һ���ͷ������˱���ͨ�ŵ��߳�-> ����һ���� ClientConnectServerThread
                //����һ���ͷ������˱���ͨ�ŵ��߳�-> ����һ���� ClientConnectServerThread
                ClientConnectServerThread clientConnectServerThread =
                        new ClientConnectServerThread(socket);
                //�����ͻ��˵��߳�
                clientConnectServerThread.start();
                ManageClientConnectServerThread.addClientConnectServerThread(userId, clientConnectServerThread);


                flag = true;

            }else {
                System.out.println("��¼ʧ��");
                socket.close();
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        return flag;

    }
    //������������������û��б�
    public void onlineFriendList() {

        //����һ��Message , ����MESSAGE_GET_ONLINE_FRIEND
        Message message = new Message();
        message.setMesType(MessageType.MESSAGE_GET_ONLINE_FRIEND);
        message.setSender(user.getUserId());

        //���͸�������

        try {
            //�ӹ����̵߳ļ����У�ͨ��userId, �õ�����̶߳���
            ClientConnectServerThread clientConnectServerThread =
                    ManageClientConnectServerThread.getClientConnectServerThread(user.getUserId());
            //ͨ������̵߳õ�������socket
            Socket socket = clientConnectServerThread.getSocket();
            //�õ���ǰ�̵߳�Socket ��Ӧ�� ObjectOutputStream����
            ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
            oos.writeObject(message); //����һ��Message����������Ҫ�������û��б�
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    public void logout() {
        Message message = new Message();
        message.setMesType(MessageType.MESSAGE_CLIENT_EXIT);
        message.setSender(user.getUserId());//һ��Ҫָ�������ĸ��ͻ���id

        //����message
        try {
            //ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
            ObjectOutputStream oos =
                    new ObjectOutputStream(ManageClientConnectServerThread.getClientConnectServerThread(user.getUserId()).getSocket().getOutputStream());
            oos.writeObject(message);
            System.out.println(user.getUserId() + " �˳�ϵͳ ");
            System.exit(0);//��������
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
