package io.home;

import java.io.*;

public class Home_2 {
    public static void main(String[] args) {
        /**
         * 要求:  使用BufferedReader读取一个文本文件，为每行加上行号，
         * 再连同内容一并输出到屏幕上。
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
