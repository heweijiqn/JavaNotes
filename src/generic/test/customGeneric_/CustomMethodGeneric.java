package generic.test.customGeneric_;

import java.util.ArrayList;

public class CustomMethodGeneric {
    public static void main(String[] args) {
        Car car = new Car();
        car.fly("����", 100);//�����÷���ʱ��������������������ͻ�ȷ������
        System.out.println("=======");
        car.fly(300, 100.1);//�����÷���ʱ��������������������ͻ�ȷ������

        //����
        //T->String, R-> ArrayList
        Fish<String, ArrayList> fish = new Fish<>();
        fish.hello(new ArrayList(), 11.3f);
    }
}

//���ͷ��������Զ�������ͨ����, Ҳ���Զ����ڷ�������
class Car {//��ͨ��

    public void run() {//��ͨ����
    }
    //˵�� ���ͷ���
    //1. <T,R> ���Ƿ���
    //2. ���ṩ�� flyʹ�õ�
    public <T, R> void fly(T t, R r) {//���ͷ���
        System.out.println(t.getClass());//String
        System.out.println(r.getClass());//Integer
    }
}

class Fish<T, R> {//������
    public void run() {//��ͨ����
    }
    public<U,M> void eat(U u, M m) {//���ͷ���

    }
    //˵��
    //1. ����hi�������Ƿ��ͷ���
    //2. ��hi����ʹ������������ ����
    public void hi(T t) {//����ʹ�õ�����
    }
    //���ͷ���������ʹ���������ķ��ͣ�Ҳ����ʹ���Լ���������
    public<K> void hello(R r, K k) {
        System.out.println(r.getClass());//ArrayList
        System.out.println(k.getClass());//Float
    }

}


