package io.home;

import java.io.*;

public class Home_2 {
    public static void main(String[] args) {
        /**
         * Ҫ��:  ʹ��BufferedReader��ȡһ���ı��ļ���Ϊÿ�м����кţ�
         * ����ͬ����һ���������Ļ�ϡ�
         */
        String filePath = "e:\\ok.txt";
        BufferedReader br = null;
        String line = "";
        int lineNum = 0;
        try {
             br = new BufferedReader(new InputStreamReader(new FileInputStream(filePath), "utf-8"));
            while ((line= br.readLine())!=null ){
                lineNum++;
                System.out.println(lineNum+"" +line);

            }

        } catch (FileNotFoundException | UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }finally {
            if (br!=null){
                try {
                    br.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }


    }
}
