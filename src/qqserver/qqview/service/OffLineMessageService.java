/**
 * @author 韩顺平
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
    private static ConcurrentHashMap<String, ArrayList<Message>> offLineDb = new ConcurrentHashMap<>();  //离线消息的数据库  key->getterId value->contents


    //将离线消息存入到集合中
    //编写getter不在线 并将离线消息添加到offlineMap
    public static void addOfflineMap(Message message) {
        //如果getter不存在 那么创建一个ArrayList 并将message放入
        if (!offLineDb.containsKey(message.getGetter())) {   //如果不存在  那么创建一个ArrayList 并将message放入
            ArrayList<Message> messages = new ArrayList<>();
            messages.add(message);
            offLineDb.put(message.getGetter(), messages);
            System.out.println("离线消息已经存放在offLineDb中");
        } else {
            ArrayList arrayList = offLineDb.get(message.getGetter());
            arrayList.add(message);
            System.out.println("消息已经存放在offLineDb中");
        }

    }


    public static ConcurrentHashMap<String, ArrayList<Message>> getOffLineDb() {
        return offLineDb;
    }

    public static void setOffLineDb(ConcurrentHashMap<String, ArrayList<Message>> offLineDb) {
        OffLineMessageService.offLineDb = offLineDb;
    }
    //编写方法判断id是否存在于offLineDb 中 如果存在 就获取对应getter的socket 将ArrayList中的所有内容发送
    public static void sendOffLineMessage(String getter) {
        if (offLineDb.containsKey(getter)) {//判断该 ID是否存在
            ArrayList<Message> messages = offLineDb.get(getter);  //获取该ID的ArrayList
            Iterator<Message> iterator = messages.iterator();  //获取该ID的Iterator
            while (iterator.hasNext()) {
                Message message = iterator.next();  //获取该ID的消息
                try {
                    OutputStream outputStream = manageClientThreads.getServerConnectClientThread(getter).getSocket().getOutputStream();
                    ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
                    objectOutputStream.writeObject(message);
                    objectOutputStream.flush();
                    System.out.println("离线消息已经发送");
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            offLineDb.remove(getter);
        }
    }


    //编写方法判断getter是否在线
    public static boolean isOnline(String getterId) {

        HashMap<String, ServerConnectClientThread> hm = ManageClientThreads.getHm();

        Iterator<String> iterator = hm.keySet().iterator(); //获取key的集合
        while (iterator.hasNext()) {

            //取出在线用户id
            String onLineUserId = iterator.next().toString();
            if (onLineUserId.equals(getterId)) {
                return true;
            } else {
                return false;  //如果不存在 就返回false
            }
        }
        return true; //如果没有找到 就返回true
    }

    //将离线消息从offlineMap删除
    public static void removeOfflineMap(String getterId) {
        offLineDb.remove(getterId);
    }



}
