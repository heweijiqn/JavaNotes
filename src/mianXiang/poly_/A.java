/**
 * @author 何伟健
 * @version 1.0
 * @date 2022/10/21 15:00
 */


package mianXiang.poly_;

public class A {
}
class Base{
    int i;
    Base(){
        add(1);//第一步
        System.out.println(i);//第三步
    }
    void add(int v){
        i+=v;
        System.out.println(i);
    }
}
class MyBase extends Base{
    MyBase(){//第四步
        System.out.println("MyBase");
        add(2);
    }
    @Override
    void add(int v){//第二步 第五步 第六步
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

