/**
 * @author hwj
 * @version 1.0
 * @date 2022/8/4 3:10
 * 该类用于管理和客户端通信的线程
 */


package qqserver.qqview.service;

import java.util.HashMap;
import java.util.Iterator;

public class ManageClientThreads {
    //我们把多个线程放入一个HashMap集合，key 就是用户id, value 就是线程
    private static HashMap<String, ServerConnectClientThread> hm = new HashMap<>();


    //返回 hm
    public static HashMap<String, ServerConnectClientThread> getHm() {
        return hm;
    }

    //添加线程对象到 hm 集合
    public static void addClientThread(String userId, ServerConnectClientThread serverConnectClientThread) {

        hm.put(userId, serverConnectClientThread);

    }

    //根据userId 返回ServerConnectClientThread线程
    public static ServerConnectClientThread getServerConnectClientThread(String userId) {
        return hm.get(userId);
    }
    public static String getOnlineUser() {
        //集合遍历 ，遍历 hashmap的key
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
