package thread.thread_;

public class Thread_3 {
    public static void main(String[] args) {
        T1 t1 = new T1();
        T2 t2 = new T2();
        Thread thread1 = new Thread(t1);
        Thread thread2 = new Thread(t2);
        thread1.start();//������1���߳�
        thread2.start();//������2���߳�
        //...



    }
}

class T1 implements Runnable {

    int count = 0;

    @Override
    public void run() {
        while (true) {
            //ÿ��1����� ��hello,world��,���10��
            System.out.println("hello,world " + (++count));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if(count == 60) {
                break;
            }
        }
    }
}

class T2 implements Runnable {

    int count = 0;

    @Override
    public void run() {
        //ÿ��1����� ��hi��,���5��
        while (true) {
            System.out.println("hi " + (++count));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if(count == 50) {
                break;
            }
        }
    }
}
