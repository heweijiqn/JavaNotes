package abstract_;

public class Dynamic {
    public static void main(String[] args) {

        AA aa = new AA();
        aa.calculateTime(); //���ﻹ����Ҫ�����õ�OOP�������Զ�̬

        BB bb = new BB();
        bb.calculateTime();
    }

}

class AA extends Template {

    //��������
    //1+....+ 800000
    @Override
    public void job() { //ʵ��Template�ĳ��󷽷�job

        long num = 0;
        for (long i = 1; i <= 800000; i++) {
            num += i;
        }
    }

}


class BB extends Template{

    public void job() {//����Ҳȥ����д��Template��job����

        long num = 0;
        for (long i = 1; i <= 80000; i++) {
            num *= i;
        }

    }
}