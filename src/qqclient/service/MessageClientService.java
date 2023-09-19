package qqclient.service;


import com.Message;
import com.MessageType;


import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Date;

/**
 * @author ��˳ƽ
 * @version 1.0
 * ����/�����ṩ����Ϣ��صķ��񷽷�
 */
public class MessageClientService {


    /**
     * @param content  ����
     * @param senderId ������
     */
    public void sendMessageToAll(String content, String senderId) {
        //����message
        Message message = new Message();
        message.setMesType(MessageType.MESSAGE_TO_ALL_MES);//Ⱥ����Ϣ��������
        message.setSender(senderId);
        message.setContent(content);
        message.setSendTime(new Date().toString());//����ʱ�����õ�message����
        System.out.println(senderId + " �Դ��˵ " + content);
        //���͸������

        try {
            ObjectOutputStream oos =
                    new ObjectOutputStream(ManageClientConnectServerThread.getClientConnectServerThread(senderId).getSocket().getOutputStream());
            oos.writeObject(message);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * @param content  ����
     * @param senderId �����û�id
     * @param getterId �����û�id
     */
    public void sendMessageToOne(String content, String senderId, String getterId) {
        //����message
        Message message = new Message();
        message.setMesType(MessageType.MESSAGE_COMM_MES);//��ͨ��������Ϣ��������
        message.setSender(senderId);
        message.setGetter(getterId);
        message.setContent(content);
        message.setSendTime(new Date().toString());//����ʱ�����õ�message����
        System.out.println(senderId + " �� " + getterId + " ˵ " + content);
        //���͸������

        try {
            ObjectOutputStream oos =
                    new ObjectOutputStream(ManageClientConnectServerThread.getClientConnectServerThread(senderId).getSocket().getOutputStream());
            oos.writeObject(message);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
