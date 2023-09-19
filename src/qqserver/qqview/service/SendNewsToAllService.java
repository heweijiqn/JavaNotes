package qqserver.qqview.service;

import com.Message;
import com.MessageType;

import qqclient.utils.Utility;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.*;

/**
 * @author ��˳ƽ
 * @version 1.0
 */
public class SendNewsToAllService implements Runnable {


    @Override
    public void run() {

        //Ϊ�˿������Ͷ�����ţ�ʹ��while
        while (true) {
            System.out.println("�����������Ҫ���͵�����/��Ϣ[����exit��ʾ�˳����ͷ����߳�]");
            String news = Utility.readString(100);
            if("exit".equals(news)) {
                break;
            }
            //����һ����Ϣ , Ⱥ����Ϣ
            Message message = new Message();
            message.setSender("������");
            message.setMesType(MessageType.MESSAGE_TO_ALL_MES);
            message.setContent(news);
            message.setSendTime(new Date().toString());
            System.out.println("������������Ϣ�������� ˵: " + news);

            //������ǰ���е�ͨ���̣߳��õ�socket,������message

            HashMap<String, ServerConnectClientThread> hm = ManageClientThreads.getHm();

            Iterator<String> iterator = hm.keySet().iterator();
            while (iterator.hasNext()) {
                String onLineUserId = iterator.next().toString();
                try {
                    ObjectOutputStream oos =
                            new ObjectOutputStream(hm.get(onLineUserId).getSocket().getOutputStream());
                    oos.writeObject(message);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
