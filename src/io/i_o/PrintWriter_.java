package io.i_o;

import java.io.*;

public class PrintWriter_ {
    public static void main(String[] args) throws IOException {

        //PrintWriter printWriter = new PrintWriter(System.out);
        PrintWriter printWriter = new PrintWriter(new FileWriter("e:\\f2.txt"));
        printWriter.print("hi, �������~~~~");
        printWriter.close();//flush + �ر���, �ŻὫ����д�뵽�ļ�..

    }
}
