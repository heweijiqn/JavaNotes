package io.outputStream;

import java.io.*;



public class ObjectOutStream_ {
    //��ʾObjectOutputStream��ʹ��, ������ݵ����л�
    public static void main(String[] args) throws IOException {
        //���л��󣬱�����ļ���ʽ�����Ǵ��ı������ǰ������ĸ�ʽ������
        String filePath = "e:\\data.dat";

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filePath));

        //���л����ݵ� e:\data.dat
        oos.writeInt(100);// int -> Integer (ʵ���� Serializable)
        oos.writeBoolean(true);// boolean -> Boolean (ʵ���� Serializable)
        oos.writeChar('a');// char -> Character (ʵ���� Serializable)
        oos.writeDouble(9.5);// double -> Double (ʵ���� Serializable)
        oos.writeUTF("��˳ƽ����");//String
        //����һ��dog����
        oos.writeObject(new Dog("����", 10, "�ձ�", "��ɫ"));
        oos.close();
        System.out.println("���ݱ������(���л���ʽ)");




    }
}
