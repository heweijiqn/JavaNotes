package io.home;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Home_1 {
    public static void main(String[] args) throws IOException {
        String directoryPath = "d:\\mytemp";
        File file = new File(directoryPath);
        if (file.exists()){
            System.out.println("�ļ��д���,�����ٴ���");

        }else {
            if (file.mkdirs()){
                System.out.println("�ļ��д����ɹ�");
            }else {
                System.out.println("�ļ��д���ʧ��");
            }

        }
        String filePath  = directoryPath + "\\hello.txt";
        File file1 = new File(filePath);
        if (file1.exists()){
            System.out.println("�ļ�����,�����ٴ���");
        }else {
            if (file.createNewFile()){
                System.out.println("�ļ������ɹ�");
                BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file1));
                bufferedWriter.write("hello");
                bufferedWriter.close();

            }else {
                System.out.println("�ļ�����ʧ��");
            }
        }


    }
}
