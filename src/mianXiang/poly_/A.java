/**
 * @author ��ΰ��
 * @version 1.0
 * @date 2022/10/21 15:00
 */


package mianXiang.poly_;

public class A {
}
class Base{
    int i;
    Base(){
        add(1);//��һ��
        System.out.println(i);//������
    }
    void add(int v){
        i+=v;
        System.out.println(i);
    }
}
class MyBase extends Base{
    MyBase(){//���Ĳ�
        System.out.println("MyBase");
        add(2);
    }
    @Override
    void add(int v){//�ڶ��� ���岽 ������
        System.out.println("MyBase Add");
        i+=v*2;
        System.out.println(i);
    }
}
class test01 extends MyBase {
    public static void main(String[] args) {
        MyBase base=new test01();
        go(base);

    }
    static void go(Base b){
        b.add(8);
    }
}

