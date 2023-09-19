/**
 * @author ��˳ƽ
 * @version 1.0
 * @date 2022/8/4 8:26
 */


package qqserver.qqview.service;



import com.Message;

import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

public class OffLineMessageService {
     private static ManageClientThreads manageClientThreads = new ManageClientThreads();
    private static ConcurrentHashMap<String, ArrayList<Message>> offLineDb = new ConcurrentHashMap<>();  //������Ϣ�����ݿ�  key->getterId value->contents


    //��������Ϣ���뵽������
    //��дgetter������ ����������Ϣ��ӵ�offlineMap
    public static void addOfflineMap(Message message) {
        //���getter������ ��ô����һ��ArrayList ����message����
        if (!offLineDb.containsKey(message.getGetter())) {   //���������  ��ô����һ��ArrayList ����message����
            ArrayList<Message> messages = new ArrayList<>();
            messages.add(message);
            offLineDb.put(message.getGetter(), messages);
            System.out.println("������Ϣ�Ѿ������offLineDb��");
        } else {
            ArrayList arrayList = offLineDb.get(message.getGetter());
            arrayList.add(message);
            System.out.println("��Ϣ�Ѿ������offLineDb��");
        }

    }


    public static ConcurrentHashMap<String, ArrayList<Message>> getOffLineDb() {
        return offLineDb;
    }

    public static void setOffLineDb(ConcurrentHashMap<String, ArrayList<Message>> offLineDb) {
        OffLineMessageService.offLineDb = offLineDb;
    }
    //��д�����ж�id�Ƿ������offLineDb �� ������� �ͻ�ȡ��Ӧgetter��socket ��ArrayList�е��������ݷ���
    public static void sendOffLineMessage(String getter) {
        if (offLineDb.containsKey(getter)) {//�жϸ� ID�Ƿ����
            ArrayList<Message> messages = offLineDb.get(getter);  //��ȡ��ID��ArrayList
            Iterator<Message> iterator = messages.iterator();  //��ȡ��ID��Iterator
            while (iterator.hasNext()) {
                Message message = iterator.next();  //��ȡ��ID����Ϣ
                try {
                    OutputStream outputStream = manageClientThreads.getServerConnectClientThread(getter).getSocket().getOutputStream();
                    ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
                    objectOutputStream.writeObject(message);
                    objectOutputStream.flush();
                    System.out.println("������Ϣ�Ѿ�����");
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            offLineDb.remove(getter);
        }
    }


    //��д�����ж�getter�Ƿ�����
    public static boolean isOnline(String getterId) {

        HashMap<String, ServerConnectClientThread> hm = ManageClientThreads.getHm();

        Iterator<String> iterator = hm.keySet().iterator(); //��ȡkey�ļ���
        while (iterator.hasNext()) {

            //ȡ�������û�id
            String onLineUserId = iterator.next().toString();
            if (onLineUserId.equals(getterId)) {
                return true;
            } else {
                return false;  //��������� �ͷ���false
            }
        }
        return true; //���û���ҵ� �ͷ���true
    }

    //��������Ϣ��offlineMapɾ��
    public static void removeOfflineMap(String getterId) {
        offLineDb.remove(getterId);
    }



}
