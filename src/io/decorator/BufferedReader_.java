package io.decorator;


public class BufferedReader_ extends Reader_ {

    private Reader_ reader_; //������ Reader_����

    //����Reader_ �������
    public BufferedReader_(Reader_ reader_) {
        this.reader_ = reader_;
    }

    public void readFile() { //��װһ��
        reader_.readFile();
    }

    //�÷��������� ��ζ�ȡ�ļ�, ���߼ӻ���byte[] ....
    public void readFiles(int num) {
        for(int i = 0; i < num; i++) {
            reader_.readFile();
        }
    }

    //��չ readString, ���������ַ�������
    public void readStrings(int num) {
        for(int i = 0; i <num; i++) {
            reader_.readString();
        }
    }

}
