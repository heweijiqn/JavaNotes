package io.write;
import java.io.*;
public class BufferedCopy_ {
    public static void main(String[] args) {

        //1. BufferedReader �� BufferedWriter �ǰ�װ�ַ�����
        //2. ��Ҫȥ���� �������ļ�[��������Ƶ��doc, pdf ], ��������ļ���
        //BufferedInputStream
        //BufferedOutputStream
        String srcFilePath = "e:\\a.java";
        String destFilePath = "e:\\a2.java";

        BufferedReader br = null;
        BufferedWriter bw = null;
        String line;
        try {
            br = new BufferedReader(new FileReader(srcFilePath));
            bw = new BufferedWriter(new FileWriter(destFilePath));

            //˵��: readLine ��ȡһ�����ݣ�����û�л���
            while ((line = br.readLine()) != null) {
                //ÿ��ȡһ�У���д��
                bw.write(line);
                //����һ������
                bw.newLine();
            }
            System.out.println("�������...");

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //�ر���
            try {
                if(br != null) {
                    br.close();
                }
                if(bw != null) {
                    bw.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }
}
