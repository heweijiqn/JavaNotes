package io.inputStream_;

import io.outputStream.Dog;

import java.io.*;

public class ObjectInputStream_ {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        //ָ�������л����ļ�
        String filePath = "e:\\data.dat";

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filePath));

        //��ȡ

        //1. ��ȡ(�����л�)��˳����Ҫ���㱣������(���л�)��˳��һ��
        //2. ���������쳣

        System.out.println(ois.readInt());
        System.out.println(ois.readBoolean());

        System.out.println(ois.readChar());
        System.out.println(ois.readDouble());
        System.out.println(ois.readUTF());


        //dog �ı��������� Object , dog ������������ Dog
        Object dog = ois.readObject();
        System.out.println("��������=" + dog.getClass());
        System.out.println("dog��Ϣ=" + dog);//�ײ� Object -> Dog

        //�������ر���Ҫ��ϸ��:

        //1. �������ϣ������Dog�ķ���, ��Ҫ����ת��
        //2. ��Ҫ���ǽ�Dog��Ķ��壬���ڵ��������õ�λ��
        Dog dog2 = (Dog)dog;
        System.out.println(dog2.getName()); //����..

        //�ر���, �ر���������ɣ��ײ��ر� FileInputStream ��
        ois.close();


    }
}
