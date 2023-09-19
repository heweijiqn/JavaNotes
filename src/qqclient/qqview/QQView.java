/**
 * @author hwj
 * @version 1.0
 * @date 2022/8/4 2:23
 */


package qqclient.qqview;

import qqclient.service.FileClientService;
import qqclient.service.MessageClientService;
import qqclient.service.UserClientService;
import qqclient.utils.Utility;

public class QQView {

    private boolean loop = true; //�����Ƿ���ʾ�˵�
    private String key = ""; // �����û��ļ�������

    private MessageClientService messageClientService = new MessageClientService();//�����û�˽��/Ⱥ��.

    private UserClientService userClientService = new UserClientService();//���������ڵ�¼����/ע���û�

    private  FileClientService fileClientService = new FileClientService();//�����������ļ�����


    public static void main(String[] args) {
        new QQView().mainMenu();

    }


    public void mainMenu(){
        while (loop){
            System.out.println("===========��ӭ��¼����ͨ��ϵͳ===========");
            System.out.println("\t\t 1 ��¼ϵͳ");
            System.out.println("\t\t 9 �˳�ϵͳ");
            System.out.print("���������ѡ��: ");
            key = Utility.readString(1);

            switch (key) {
                case "1":
                    System.out.print("�������û���: ");
                    String userId = Utility.readString(50);
                    System.out.print("��������  ��: ");
                    String pwd = Utility.readString(50);

                    //��Ҫ�������ȥ��֤���û��Ƿ�Ϸ�
                    //���������дһ���� UserClientService[�û���¼/ע��]
                    if (userClientService.checkUser(userId,pwd)) { //��û��д��, �Ȱ������߼���ͨ....
                        System.out.println("===========��ӭ (�û� " + userId + " ��¼�ɹ�) ===========");
                        //���뵽�����˵�
                        while (loop) {
                            System.out.println("\n=========����ͨ��ϵͳ�����˵�(�û� " + userId + " )=======");
                            System.out.println("\t\t 1 ��ʾ�����û��б�");
                            System.out.println("\t\t 2 Ⱥ����Ϣ");
                            System.out.println("\t\t 3 ˽����Ϣ");
                            System.out.println("\t\t 4 �����ļ�");
                            System.out.println("\t\t 9 �˳�ϵͳ");
                            System.out.print("���������ѡ��: ");
                            key = Utility.readString(1);
                            switch (key) {
                                case "1":
                                    //������ʦ׼��дһ������������ȡ�����û��б�
                                    //System.out.println("===========�����û��б�===========");
                                    userClientService.onlineFriendList();
                                    break;
                                case "2":
                                    System.out.println("��������Դ��˵�Ļ�: ");
                                    String s = Utility.readString(100);
                                    messageClientService.sendMessageToAll(s, userId);

                                    break;
                                case "3":
                                    System.out.print("��������������û���(����): ");
                                    String getterId = Utility.readString(50);
                                    System.out.print("��������˵�Ļ�: ");
                                    String content = Utility.readString(100);
                                    //��дһ������������Ϣ���͸���������
                                    messageClientService.sendMessageToOne(content, userId, getterId);

                                    break;
                                case "4":
                                    System.out.print("������������ļ����͸����û�(�����û�): ");
                                    getterId = Utility.readString(50);
                                    System.out.print("�����뷢���ļ���·��(��ʽ d:\\xx.jpg)");
                                    String src = Utility.readString(100);
                                    System.out.print("��������ļ����͵���Ӧ��·��(��ʽ d:\\yy.jpg)");
                                    String dest = Utility.readString(100);
                                    fileClientService.sendFileToOne(src,dest,userId,getterId);

                                    break;
                                case "9":
                                    //���÷�����������������һ���˳�ϵͳ��message
                                    userClientService.logout();
                                    loop = false;
                                    break;
                            }

                        }
                    }
                    break;
                case "9":
                    loop = false;
                    break;
                default:
                    System.out.println("�����������������");
                    break;
            }
        }
    }
}
