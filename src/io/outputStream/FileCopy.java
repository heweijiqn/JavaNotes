package io.outputStream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy {
    public static void main(String[] args) {
        //��� �ļ��������� e:\\Koala.jpg ���� c:\\
        //˼·����
        //1. �����ļ��������� , ���ļ����뵽����
        //2. �����ļ���������� ����ȡ�����ļ����ݣ�д�뵽ָ�����ļ�.
        String srcFilePath = "e:\\Koala.jpg";
        String destFilePath = "e:\\Koala3.jpg";
        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream = null;

        try {

            fileInputStream = new FileInputStream(srcFilePath);
            fileOutputStream = new FileOutputStream(destFilePath);//����ļ������ڣ����Զ������ļ�
            //����һ���ֽ�����,��߶�ȡЧ��
            byte[] buf = new byte[1024];
            int readLen = 0;
            while ((readLen = fileInputStream.read(buf)) != -1) {
                //��ȡ���󣬾�д�뵽�ļ� ͨ�� fileOutputStream
                //������һ�߶���һ��д
                fileOutputStream.write(buf, 0, readLen);//һ��Ҫʹ���������

            }
            System.out.println("����ok~");


        } catch (IOException  e) {
            e.printStackTrace();
        } finally {
            try {
                //�ر�����������������ͷ���Դ
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                if (fileOutputStream != null) {
                    fileOutputStream.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }

}
