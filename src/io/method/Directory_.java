package io.method;

import org.junit.jupiter.api.Test;

import java.io.File;

public class Directory_ {
    public static void main(String[] args) {


    }

    //�ж� d:\\news1.txt �Ƿ���ڣ�������ھ�ɾ��
    @Test
    public void m1() {

        String filePath = "e:\\news1.txt";
        File file = new File(filePath);
        if (file.exists()) {
            if (file.delete()) {
                System.out.println(filePath + "ɾ���ɹ�");
            } else {
                System.out.println(filePath + "ɾ��ʧ��");
            }
        } else {
            System.out.println("���ļ�������...");
        }

    }

    //�ж� D:\\demo02 �Ƿ���ڣ����ھ�ɾ����������ʾ������
    //����������Ҫ��ᵽ����java����У�Ŀ¼Ҳ�������ļ�
    @Test
    public void m2() {

        String filePath = "D:\\demo02";
        File file = new File(filePath);
        if (file.exists()) {
            if (file.delete()) {
                System.out.println(filePath + "ɾ���ɹ�");
            } else {
                System.out.println(filePath + "ɾ��ʧ��");
            }
        } else {
            System.out.println("��Ŀ¼������...");
        }

    }

    //�ж� D:\\demo\\a\\b\\c Ŀ¼�Ƿ���ڣ�������ھ���ʾ�Ѿ����ڣ�����ʹ���
    @Test
    public void m3() {

        String directoryPath = "D:\\demo\\a\\b\\c";
        File file = new File(directoryPath);
        if (file.exists()) {
            System.out.println(directoryPath + "����..");
        } else {
            if (file.mkdirs()) { //����һ��Ŀ¼ʹ��mkdir() �������༶Ŀ¼ʹ��mkdirs()
                System.out.println(directoryPath + "�����ɹ�..");
            } else {
                System.out.println(directoryPath + "����ʧ��...");
            }
        }



    }
}
