package io.write;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriter_ {
    public static void main(String[] args) throws IOException {
        String filePath = "e:\\ok.txt";
        //����BufferedWriter
        //˵��:
        //1. new FileWriter(filePath, true) ��ʾ��׷�ӵķ�ʽд��
        //2. new FileWriter(filePath) , ��ʾ�Ը��ǵķ�ʽд��
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(filePath));
        bufferedWriter.write("hello, ��˳ƽ����!");
        bufferedWriter.newLine();//����һ����ϵͳ��صĻ���
        bufferedWriter.write("hello2, ��˳ƽ����!");
        bufferedWriter.newLine();
        bufferedWriter.write("hello3, ��˳ƽ����!");
        bufferedWriter.newLine();

        //˵�����ر���������� �� ����� new FileWriter(filePath) ,���ڵײ�ر�
        bufferedWriter.close();

    }

}
