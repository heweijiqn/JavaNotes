package io.transformation;
import java.io.*;
public class OutputStreamWriter_ {
    //* ��ʾ OutputStreamWriter ʹ��
// * ��FileOutputStream �ֽ�����ת���ַ��� OutputStreamWriter
// * ָ������ı��� gbk/utf-8/utf8
    public static void main(String[] args) throws IOException {
        String filePath = "e:\\hsp.txt";
        String charSet = "utf-8";
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream(filePath), charSet);
        osw.write("hi, ��˳ƽ����");
        osw.close();
        System.out.println("���� " + charSet + " �����ļ��ɹ�~");


    }
}
