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
    private Socket socket; //���ںͷ�����ͨ�ŵ�Socket

    private Message message; //���ڽ��մӷ��������͵���Ϣ

   ;

    public ClientConnectServerThread(Socket socket) { //���췽�� ����һ��Socket���� ��Ϊ����
        this.socket = socket;
    }

    //Ϊ�˸�����ĵõ�Socket
    public Socket getSocket() {
        return socket;
    }

    @Override
    public void run() {    //��дrun����   ʵ���̵߳ľ��幦��  ʵ�ֽ��շ��������͵���Ϣ
        while (true) {
            try {
                //���շ��������͵���Ϣ
                System.out.println("�ͻ����̣߳��ȴ��Ӷ�ȡ�ӷ������˷��͵���Ϣ");
                ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());
                //���������û�з���Message����,�̻߳�����������
                 message= (Message) ois.readObject();
                //����������Ϣ ������������͵���������Ϣ����ִ������Ĵ���
                if(OffLineMessageService.getOffLineDb().containsKey(message.getGetter())){
                    System.out.println("�ͻ����̣߳����յ�������Ϣ");
                    ArrayList<Message> offLineMessage = OffLineMessageService.getOffLineDb().get(message.getGetter());
                    for(Message m:offLineMessage){
                        System.out.println(m.getGetter()+"���͵�������Ϣ��"+m.getContent());
                    }
                    OffLineMessageService.getOffLineDb().remove(message.getGetter());
                }




                //����Ƕ�ȡ������ ����˷��ص������û��б�
                if (message.getMesType().equals(MessageType.MESSAGE_RET_ONLINE_FRIEND)) {
                    //ȡ�������б���Ϣ������ʾ
                    //�涨
                    String[] onlineUsers = message.getContent().split(" ");
                    System.out.println("\n=======��ǰ�����û��б�========");
                    for (int i = 0; i < onlineUsers.length; i++) {
                        System.out.println("�û�: " + onlineUsers[i]);
                    }
                }else if (message.getMesType().equals(MessageType.MESSAGE_COMM_MES)) {//��ͨ��������Ϣ
                    //�Ѵӷ�����ת������Ϣ����ʾ������̨����
                    //˽�Ķ���Ҫ����  �����ڵĻ���������Ϣ ����ʾ������̨

                    System.out.println("\n" + message.getSender()
                            + " �� " + message.getGetter() + " ˵: " + message.getContent());
                }else if (message.getMesType().equals(MessageType.MESSAGE_TO_ALL_MES)) {
                    //��ʾ�ڿͻ��˵Ŀ���̨
                    System.out.println("\n" + message.getSender() + " �Դ��˵: " + message.getContent());
                }else if (message.getMesType().equals(MessageType.MESSAGE_FILE_MES)) {//������ļ���Ϣ
                    //���û�ָ������·��������
                    System.out.println("\n" + message.getSender() + " �� " + message.getGetter()
                            + " ���ļ�: " + message.getSrc() + " ���ҵĵ��Ե�Ŀ¼ " + message.getDest());

                    //ȡ��message���ļ��ֽ����飬ͨ���ļ������д��������
                    FileOutputStream fileOutputStream = new FileOutputStream(message.getDest(), true);
                    fileOutputStream.write(message.getFileBytes());
                    fileOutputStream.close();
                    System.out.println("\n �����ļ��ɹ�~");

                }

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
