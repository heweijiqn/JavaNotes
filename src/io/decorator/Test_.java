package io.decorator;

import io.decorator.BufferedReader_;
import io.decorator.FileReader_;
import io.decorator.StringReader_;
public class Test_ {
    public static void main(String[] args) {


        BufferedReader_ bufferedReader_ = new BufferedReader_(new FileReader_());
        bufferedReader_.readFiles(10);
        bufferedReader_.readFile();
        //Serializable
        //Externalizable
        //ObjectInputStream
        //ObjectOutputStream
        //���ϣ��ͨ�� BufferedReader_ ��ζ�ȡ�ַ���
        BufferedReader_ bufferedReader_2 = new BufferedReader_(new StringReader_());
        bufferedReader_2.readStrings(5);
    }
}
