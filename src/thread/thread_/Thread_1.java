package thread.thread_;

public class Thread_1 {
    public static void main(String[] args) throws InterruptedException {
        Cat cat = new Cat();  //创建一个Cat对象,当做线程使用
        cat.start();  //启动线程-> 最终会执行cat的run方法

        //cat.run();    run方法就是一个普通的方法, 没有真正的启动一个线程，就会把run方法执行完毕，才向下执行


        //说明: 当main线程启动一个子线程 Thread-0, 主线程不会阻塞, 会继续执行
        //这时 主线程和子线程是交替执行..
        System.out.println("主线程继续执行" + Thread.currentThread().getName());//名字main
        for(int i = 0; i < 60; i++) {
            System.out.println("主线程 i=" + i);
            //让主线程休眠
            Thread.sleep(1000);
        }


         /*
            (1)
            public synchronized void start() {
                start0();
            }
            (2)
            //start0() 是本地方法，是JVM调用, 底层是c/c++实现
            //真正实现多线程的效果， 是start0(), 而不是 run
            private native void start0();

         */



    }
}
class Cat extends Thread{  //继承Thread类

    int times = 0;
    @Override
    public void run() {     //重写run方法
        while (true){
            System.out.println("喵喵, 我是小猫咪" + (++times) + " 线程名=" + Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {  //捕获异常
                e.printStackTrace();
            }
            if (times == 50){
                break;
            }
        }
    }
}