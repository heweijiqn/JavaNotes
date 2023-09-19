package io.read;
import java.io.*;

public class BufferedReader_ {
    public static void main(String[] args) throws IOException {
        String filePath = "e:\\a.java";
        //����bufferedReader
        BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath));
        //��ȡ
        String line; //���ж�ȡ, Ч�ʸ�
        //˵��
        //1. bufferedReader.readLine() �ǰ��ж�ȡ�ļ�
        //2. ������null ʱ����ʾ�ļ���ȡ���
        while ((line = bufferedReader.readLine()) != null) {
            System.out.println(line);
        }

        //�ر���, ����ע�⣬ֻ��Ҫ�ر� BufferedReader ����Ϊ�ײ���Զ���ȥ�ر� �ڵ���
        //FileReader��
        /*
            public void close() throws IOException {
                synchronized (lock) {
                    if (in == null)
                        return;
                    try {
                        in.close();//in �������Ǵ���� new FileReader(filePath), �ر���.
                    } finally {
                        in = null;
                        cb = null;
                    }
                }
            }

         */
        bufferedReader.close();

    }

}

