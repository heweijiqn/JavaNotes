package io.transformation;

import java.io.*;

public class InputStreamReader_ {
    public static void main(String[] args) throws IOException {


            String filePath = "e:\\a.txt";
            //���
            //1. �� FileInputStream ת�� InputStreamReader
            //2. ָ������ gbk
            //InputStreamReader isr = new InputStreamReader(new FileInputStream(filePath), "gbk");
            //3. �� InputStreamReader ���� BufferedReader
            //BufferedReader br = new BufferedReader(isr);

            //��2 �� 3 ����һ��
            BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(filePath), "gbk"));

            //4. ��ȡ
            String s = br.readLine();
            System.out.println("��ȡ����=" + s);
            //5. �ر������
            br.close();


    }
}
