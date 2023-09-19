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
            System.out.println("文件夹存在,无需再创建");

        }else {
            if (file.mkdirs()){
                System.out.println("文件夹创建成功");
            }else {
                System.out.println("文件夹创建失败");
            }

        }
        String filePath  = directoryPath + "\\hello.txt";
        File file1 = new File(filePath);
        if (file1.exists()){
            System.out.println("文件存在,无需再创建");
        }else {
            if (file.createNewFile()){
                System.out.println("文件创建成功");
                BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file1));
                bufferedWriter.write("hello");
                bufferedWriter.close();

            }else {
                System.out.println("文件创建失败");
            }
        }


    }
}
