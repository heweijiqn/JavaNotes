/**
 *@author hwj
 * @version 1.0
 * @date 2022/8/4 3:10
 * �������ͻ������ӵ��������˵��̵߳���
 */


package qqclient.service;

import java.util.HashMap;

public class ManageClientConnectServerThread {
    //���ǰѶ���̷߳���һ��HashMap���ϣ�key �����û�id, value �����߳�
    private static HashMap<String, ClientConnectServerThread> hm = new HashMap<>();

    //��ĳ���̼߳��뵽����
    public static void addClientConnectServerThread(String userId, ClientConnectServerThread clientConnectServerThread) {
        hm.put(userId, clientConnectServerThread);
    }
    //ͨ��userId ���Եõ���Ӧ�߳�
    public static ClientConnectServerThread getClientConnectServerThread(String userId) {
        return hm.get(userId);
    }
}
