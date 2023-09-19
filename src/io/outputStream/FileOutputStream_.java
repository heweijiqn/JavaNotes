package io.outputStream;

import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStream_ {
    public static void main(String[] args) {

    }
    /**
     * ��ʾʹ��FileOutputStream ������д���ļ���,
     * ������ļ������ڣ��򴴽����ļ�
     */
    @Test
    public void writeFile() {

        //���� FileOutputStream����
        String filePath = "e:\\a.txt";
        FileOutputStream fileOutputStream = null;
        try {
            //�õ� FileOutputStream���� ����
            //��ʦ˵��
            //1. new FileOutputStream(filePath) ������ʽ����д�������ǣ��Ḳ��ԭ��������
            //2. new FileOutputStream(filePath, true) ������ʽ����д�������ǣ���׷�ӵ��ļ�����
            fileOutputStream = new FileOutputStream(filePath, true);
            //д��һ���ֽ�
            //fileOutputStream.write('H');//
            //д���ַ���
            String str = "hsp,world!";
            //str.getBytes() ���԰� �ַ���-> �ֽ�����
            //fileOutputStream.write(str.getBytes());
            /*
            write(byte[] b, int off, int len) �� len�ֽڴ�λ��ƫ���� off��ָ���ֽ�����д����ļ������
             */
            fileOutputStream.write(str.getBytes(), 0, 3);

        } catch (IOException  e) {
            e.printStackTrace();
        } finally {
            try {
                fileOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
