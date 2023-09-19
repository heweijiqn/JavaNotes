package io.method;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;

public class FileCreate {
    public static void main(String[] args) {


    }
    //��ʽ1 new File(String pathname)
    @Test
    public void create01() {
        String filePath = "d:\\news1.txt";
        File file = new File(filePath);

        try {
            file.createNewFile();
            System.out.println("�ļ������ɹ�");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    //��ʽ2 new File(File parent,String child) //���ݸ�Ŀ¼�ļ�+��·������
    //e:\\news2.txt
    @Test
    public  void create02() {
        File parentFile = new File("d:\\");
        String fileName = "news2.txt";
        //�����file������java�����У�ֻ��һ������
        //ֻ��ִ����createNewFile �������Ż������ģ��ڴ��̴������ļ�
        File file = new File(parentFile, fileName);

        try {
            file.createNewFile();
            System.out.println("�����ɹ�~");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //��ʽ3 new File(String parent,String child) //���ݸ�Ŀ¼+��·������
    @Test
    public void create03() {
        //String parentPath = "e:\\";
        String parentPath = "d:\\";
        String fileName = "news4.txt";
        File file = new File(parentPath, fileName);

        try {
            file.createNewFile();
            System.out.println("�����ɹ�~");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //�����ĸ����ǳ�����
    //
    //InputStream
    //OutputStream
    //Reader //�ַ�������
    //Writer  //�ַ������
}
