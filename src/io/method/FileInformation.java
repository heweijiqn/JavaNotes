package io.method;

import org.junit.jupiter.api.Test;

import java.io.File;

public class FileInformation {
    public static void main(String[] args) {

    }
    //��ȡ�ļ�����Ϣ
    @Test
    public void info() {
        //�ȴ����ļ�����
         File file = new File("e:\\news1.txt");

        //������Ӧ�ķ������õ���Ӧ��Ϣ
        System.out.println("�ļ�����=" + file.getName());
        //getName��getAbsolutePath��getParent��length��exists��isFile��isDirectory
        System.out.println("�ļ�����·��=" + file.getAbsolutePath());
        System.out.println("�ļ�����Ŀ¼=" + file.getParent());
        System.out.println("�ļ���С(�ֽ�)=" + file.length());
        System.out.println("�ļ��Ƿ����=" + file.exists());//T
        System.out.println("�ǲ���һ���ļ�=" + file.isFile());//T
        System.out.println("�ǲ���һ��Ŀ¼=" + file.isDirectory());//F


    }
}
