package com;

public interface MessageType {
    //1. �ڽӿ��ж�����һЩ����
    //2. ��ͬ�ĳ�����ֵ����ʾ��ͬ����Ϣ����.
    String MESSAGE_LOGIN_SUCCEED = "1"; //��ʾ��¼�ɹ�    ���͸��ͻ���  �ͻ��˽��յ��󣬽��û���Ϣ���浽����  ���ҽ��û���Ϣ���͸�������  ���������յ��󣬽��û���Ϣ���浽����  ���ҽ��û���Ϣ���͸��ͻ���
    String MESSAGE_LOGIN_FAIL = "2"; // ��ʾ��¼ʧ��
    String MESSAGE_COMM_MES = "3"; //��ͨ��Ϣ��
    String MESSAGE_GET_ONLINE_FRIEND = "4"; //Ҫ�󷵻������û��б�
    String MESSAGE_RET_ONLINE_FRIEND = "5"; //���������û��б�
    String MESSAGE_CLIENT_EXIT = "6"; //�ͻ��������˳�
    String MESSAGE_TO_ALL_MES = "7"; //Ⱥ����Ϣ��
    String MESSAGE_FILE_MES = "8"; //�ļ���Ϣ(�����ļ�)
}
