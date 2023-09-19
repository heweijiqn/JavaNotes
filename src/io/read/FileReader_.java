package io.read;

import org.junit.jupiter.api.Test;
import java.io.*;

public class FileReader_ {
    public static void main(String[] args) {

    }
    /**
     * �����ַ���ȡ�ļ�
     */
    @Test
    public void readFile01() {
        String filePath = "e:\\story.txt";
        FileReader fileReader = null;
        int data = 0;
        //1. ����FileReader����
        try {
            fileReader = new FileReader(filePath);
            //ѭ����ȡ ʹ��read, �����ַ���ȡ
            while ((data = fileReader.read()) != -1) {
                System.out.print((char) data);
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fileReader != null) {
                    fileReader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * �ַ������ȡ�ļ�
     */
    @Test
    public void readFile02() {
        System.out.println("~~~readFile02 ~~~");
        String filePath = "e:\\story.txt";
        FileReader fileReader = null;

        int readLen = 0;
        char[] buf = new char[8];
        //1. ����FileReader����
        try {
            fileReader = new FileReader(filePath);
            //ѭ����ȡ ʹ��read(buf), ���ص���ʵ�ʶ�ȡ�����ַ���
            //�������-1, ˵�����ļ�����
            while ((readLen = fileReader.read(buf)) != -1) {
                System.out.print(new String(buf, 0, readLen));
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fileReader != null) {
                    fileReader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
