/**
 * @author hwj
 * @version 1.0
 * @date 2022/8/4 3:10
 * �������ڹ���Ϳͻ���ͨ�ŵ��߳�
 */


package qqserver.qqview.service;

import java.util.HashMap;
import java.util.Iterator;

public class ManageClientThreads {
    //���ǰѶ���̷߳���һ��HashMap���ϣ�key �����û�id, value �����߳�
    private static HashMap<String, ServerConnectClientThread> hm = new HashMap<>();


    //���� hm
    public static HashMap<String, ServerConnectClientThread> getHm() {
        return hm;
    }

    //����̶߳��� hm ����
    public static void addClientThread(String userId, ServerConnectClientThread serverConnectClientThread) {

        hm.put(userId, serverConnectClientThread);

    }

    //����userId ����ServerConnectClientThread�߳�
    public static ServerConnectClientThread getServerConnectClientThread(String userId) {
        return hm.get(userId);
    }
    public static String getOnlineUser() {
        //���ϱ��� ������ hashmap��key
        Iterator<String> iterator = hm.keySet().iterator();
        String onlineUserList = "";
        while (iterator.hasNext()) {
            onlineUserList += iterator.next().toString() + " ";
        }
        return  onlineUserList;
    }

    public static void removeServerConnectClientThread(String sender) {
        hm.remove(sender);
    }
}
