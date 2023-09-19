package thread.thread_;

public class Thread_2 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Thread thread = new Thread(dog);
        thread.start();

//        Tiger tiger = new Tiger();//实现了 Runnable
//        ThreadProxy threadProxy = new ThreadProxy(tiger);
//        threadProxy.start();

    }
}

//线程代理类 ,代理模式的设计动机是通过代理对象来访问真实对象，通过建立一个对象代理类，由代理对象控制原对象的引用，从而实现对真实对象的操作。
// 在代理模式中，代理对象主要起到一个中介的作用，用于协调与连接调用者(即客户端)和被调用者(即目标对象)，
// 在一定程度上降低了系统的耦合度，同时也保护了目标对象。
// 但缺点是在调用者与被调用者之间增加了代理对象，可能会造成请求的处理速度变慢
// 模拟了一个极简的Thread类
class ThreadProxy implements Runnable {//你可以把Proxy类当做 ThreadProxy

    private Runnable target = null;//属性，类型是 Runnable

    @Override
    public void run() {
        if (target != null) {
            target.run();//动态绑定（运行类型Tiger）
        }
    }

    public ThreadProxy(Runnable target) {
        this.target = target;
    }

    public void start() {
        start0();//这个方法时真正实现多线程方法
    }

    public void start0() {
        run();
    }
}

class Animal{

}


class Tiger extends Animal implements Runnable{
    @Override
    public void run() {
        System.out.println("老虎啊哇哇哇");

    }
}




class Dog implements Runnable {
    int time = 0;

    @Override
    public void run() {
        while (true) {
            System.out.println("小狗汪汪叫..hi" + (++time) + Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            if (time == 50) {
                break;
            }
        }

    }
}