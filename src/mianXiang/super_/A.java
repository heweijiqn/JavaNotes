package mianXiang.super_;

public class A extends Basis {
    protected int n2 = 200;
    public int n1 = 111;
    int n3 = 300;
    private int n4 = 400;

    public A() {
        System.out.println("调用了A类的无参构造器");
    }
    public A(String name) {}
    public A(String name, int age) {}

    public void cal() {
        System.out.println("A类的cal() 方法...");
    }

    public void test100() {
    }

    protected void test200() {
    }

    void test300() {
    }

    private void test400() {
    }
}
