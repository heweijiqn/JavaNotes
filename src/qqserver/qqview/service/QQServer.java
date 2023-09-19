/**
 @author hwj
 * @version 1.0
 * @date 2022/8/4 3:34
 */


package qqserver.qqview.service;



import com.Message;
import com.MessageType;
import com.User;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.concurrent.ConcurrentHashMap;

public class QQServer {
    private ServerSocket ss = null;
    private User user = new User();
    private Message message = new Message();


    //����һ�����ϣ���Ŷ���û����������Щ�û���¼������Ϊ�ǺϷ�
    //��������Ҳ����ʹ�� ConcurrentHashMap, ���Դ������ļ��ϣ�û���̰߳�ȫ
    //HashMap û�д����̰߳�ȫ������ڶ��߳�������ǲ���ȫ
    //ConcurrentHashMap ������̰߳�ȫ,���߳�ͬ������, �ڶ��߳�������ǰ�ȫ
    private static ConcurrentHashMap<String, User> validUsers = new ConcurrentHashMap<>();
    private static ConcurrentHashMap<String, ArrayList<Message>> offLineDb = new ConcurrentHashMap<>();

    private  static  OffLineMessageService offLineMessageService = new OffLineMessageService();

    static { //�ھ�̬����飬��ʼ�� validUsers

        validUsers.put("100", new User("100", "123456"));
        validUsers.put("200", new User("200", "123456"));
        validUsers.put("300", new User("300", "123456"));
        validUsers.put("����", new User("����", "123456"));
        validUsers.put("��ϼ����", new User("��ϼ����", "123456"));
        validUsers.put("��������", new User("��������", "123456"));

    }

    //��֤�û��Ƿ���Ч�ķ���
    private boolean checkUser(String userId, String passwd) {

        User user = validUsers.get(userId);
        //���ص���֤��ʽ
        if(user == null) {//˵��userIdû�д���validUsers ��key��
            return  false;
        }
        if(!user.getPasswd().equals(passwd)) {//userId��ȷ�������������
            return false;
        }
        return  true;
    }

    public QQServer() {
        try {
            System.out.println("�������9999�˿ڼ���...");
            new Thread(new SendNewsToAllService()).start();
            ss = new ServerSocket(9999);

            while (true) { //����ĳ���ͻ������Ӻ󣬻��������, ���while
                Socket socket = ss.accept();//���û�пͻ������ӣ��ͻ�����������
                //�õ�socket�����Ķ���������
                ObjectInputStream ois =
                        new ObjectInputStream(socket.getInputStream());

                //�õ�socket�����Ķ��������
                ObjectOutputStream oos =
                        new ObjectOutputStream(socket.getOutputStream());
                user = (User) ois.readObject();//��ȡ�ͻ��˷��͵�User����
                //����һ��Message����׼���ظ��ͻ���
                message = new Message();
                //��֤�û� ����
                if (checkUser(user.getUserId(), user.getPasswd())) {//��¼ͨ��
                    message.setMesType(MessageType.MESSAGE_LOGIN_SUCCEED);
                    //��message����ظ��ͻ���
                    oos.writeObject(message);

                    //����һ���̣߳��Ϳͻ��˱���ͨ��, ���߳���Ҫ����socket����
                    ServerConnectClientThread serverConnectClientThread =
                            new ServerConnectClientThread(socket, user.getUserId());
                    //�������߳�
                    serverConnectClientThread.start();
                    //�Ѹ��̶߳��󣬷��뵽һ�������У����й���.
                    ManageClientThreads.addClientThread(user.getUserId(), serverConnectClientThread);

                    //����������Ϣ
                    offLineMessageService.sendOffLineMessage(user.getUserId());
                    offLineMessageService.removeOfflineMap(user.getUserId());

                }else {
                System.out.println("�û� id=" + user.getUserId() + " pwd=" + user.getPasswd() + " ��֤ʧ��");
                message.setMesType(MessageType.MESSAGE_LOGIN_FAIL);
                oos.writeObject(message);
                //�ر�socket
                socket.close();
                }
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
