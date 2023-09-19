package io.outputStream;
import java.io.*;

public class BufferedCopy {
    public static void main(String[] args) {
//        ʹ�����ǣ�������ɶ������ļ�����
//    �ֽ������Բ����������ļ���Ҳ���Բ����ı��ļ�
//        String srcFilePath = "e:\\Koala.jpg";
//        String destFilePath = "e:\\hsp.jpg";
//        String srcFilePath = "e:\\0245_��˳ƽ�����ѧJava_����this.avi";
//        String destFilePath = "e:\\hsp.avi";
        String srcFilePath = "e:\\a.java";
        String destFilePath = "e:\\a3.java";

        //����BufferedOutputStream����BufferedInputStream����
        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;

        try {
            //��Ϊ FileInputStream  �� InputStream ����
            bis = new BufferedInputStream(new FileInputStream(srcFilePath));
            bos = new BufferedOutputStream(new FileOutputStream(destFilePath));

            //ѭ���Ķ�ȡ�ļ�����д�뵽 destFilePath
            byte[] buff = new byte[1024];
            int readLen = 0;
            //������ -1 ʱ���ͱ�ʾ�ļ���ȡ���
            while ((readLen = bis.read(buff)) != -1) {
                bos.write(buff, 0, readLen);
            }

            System.out.println("�ļ��������~~~");

        } catch (IOException e) {
            e.printStackTrace();
        } finally {

            //�ر��� , �ر����Ĵ��������ɣ��ײ��ȥ�رսڵ���
            try {
                if(bis != null) {
                    bis.close();
                }
                if(bos != null) {
                    bos.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

        }



    }
}
