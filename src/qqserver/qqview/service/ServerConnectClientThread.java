/**
 @author hwj
 * @version 1.0
 * @date 2022/8/4 3:43
 */


package qqserver.qqview.service;



import com.Message;
import com.MessageType;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.HashMap;
import java.util.Iterator;

public class ServerConnectClientThread extends Thread {
    private Socket socket;
    private String userId;//���ӵ�����˵��û�id

    private Message message;

    public ServerConnectClientThread(Socket socket, String userId) {
        this.socket = socket;
        this.userId = userId;
    }

    public Socket getSocket() {
        return socket;
    }

    @Override
    public void run() {
        while (true){
            try {
                System.out.println("����˺Ϳͻ���" + userId + " ����ͨ�ţ���ȡ����...");
                ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());
                Message message = (Message) ois.readObject();
                if (message.getMesType().equals(MessageType.MESSAGE_GET_ONLINE_FRIEND)) {
                    //�ͻ���Ҫ�����û��б�
                    /*
                    �����û��б���ʽ 100  200  ��ϼ����
                     */
                    System.out.println(message.getSender() + " Ҫ�����û��б�");
                    String onlineUser = ManageClientThreads.getOnlineUser();
                    //����message
                    //����һ��Message ���󣬷��ظ��ͻ���
                    Message message2 = new Message();
                    message2.setMesType(MessageType.MESSAGE_RET_ONLINE_FRIEND);
                    message2.setContent(onlineUser);
                    message2.setGetter(message.getSender());
                    //���ظ��ͻ���
                    ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
                    oos.writeObject(message2);
                   }else if (message.getMesType().equals(MessageType.MESSAGE_COMM_MES)) {
                    //����message��ȡgetter id, Ȼ���ڵõ���Ӧ���߳�
                    ServerConnectClientThread serverConnectClientThread =
                            ManageClientThreads.getServerConnectClientThread(message.getGetter());
                    //�õ���Ӧsocket�Ķ������������message����ת����ָ���Ŀͻ���
                    //Ҫ�ж϶���治���� ��������ڣ����ܷ�����Ϣ
                    //����һ��Message ���󣬷��ظ��ͻ���

                    if (!OffLineMessageService.isOnline(message.getGetter())){
                        //��������ߣ����ܷ�����Ϣ
                        message.setContent("�Է������ߣ���Ϣ����ʧ��");
                        OffLineMessageService.addOfflineMap(message);

                    }else {
                        //����message��ȡgetter id, Ȼ���ڵõ���Ӧ���߳�
                        ServerConnectClientThread serverConnectClientThread_1 =
                                ManageClientThreads.getServerConnectClientThread(message.getGetter());
                        //�õ���Ӧsocket�Ķ������������message����ת����ָ���Ŀͻ���
                        ObjectOutputStream oos =
                                new ObjectOutputStream(serverConnectClientThread_1.getSocket().getOutputStream());
                        oos.writeObject(message);//ת������ʾ����ͻ������ߣ����Ա��浽���ݿ⣬�����Ϳ���ʵ����������
                    }

                }else if (message.getMesType().equals(MessageType.MESSAGE_FILE_MES)){
                    ServerConnectClientThread serverConnectClientThread = ManageClientThreads.getServerConnectClientThread(message.getGetter());


                    ObjectOutputStream oos =
                            new ObjectOutputStream(serverConnectClientThread.getSocket().getOutputStream());
                    oos.writeObject(message);//ת����

                }
                else if (message.getMesType().equals(MessageType.MESSAGE_TO_ALL_MES)) {
                    //��Ҫ���� �����̵߳ļ��ϣ������е��̵߳�socket�õ���Ȼ���message����ת������
                    HashMap<String, ServerConnectClientThread> hm = ManageClientThreads.getHm();

                    Iterator<String> iterator = hm.keySet().iterator();
                    while (iterator.hasNext()) {

                        //ȡ�������û�id
                        String onLineUserId = iterator.next().toString();

                        if (!onLineUserId.equals(message.getSender())) {//�ų�Ⱥ����Ϣ������û�

                            //����ת��message
                            ObjectOutputStream oos =
                                    new ObjectOutputStream(hm.get(onLineUserId).getSocket().getOutputStream());
                            oos.writeObject(message);
                        }

                    }

                }
                else if (message.getMesType().equals(MessageType.MESSAGE_CLIENT_EXIT)) {//�ͻ����˳�

                    System.out.println(message.getSender() + " �˳�");
                    //������ͻ��˶�Ӧ�̣߳��Ӽ���ɾ��.
                    ManageClientThreads.removeServerConnectClientThread(message.getSender());
                    socket.close();//�ر�����
                    //�˳��߳�
                    break;

                }

            } catch (Exception e) {
                e.printStackTrace();
            }

            }
            //�����ʹ��message, ����message�����ͣ�����Ӧ��ҵ����
        }

}
