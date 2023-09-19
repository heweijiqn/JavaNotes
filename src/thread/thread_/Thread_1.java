package thread.thread_;

public class Thread_1 {
    public static void main(String[] args) throws InterruptedException {
        Cat cat = new Cat();  //����һ��Cat����,�����߳�ʹ��
        cat.start();  //�����߳�-> ���ջ�ִ��cat��run����

        //cat.run();    run��������һ����ͨ�ķ���, û������������һ���̣߳��ͻ��run����ִ����ϣ�������ִ��


        //˵��: ��main�߳�����һ�����߳� Thread-0, ���̲߳�������, �����ִ��
        //��ʱ ���̺߳����߳��ǽ���ִ��..
        System.out.println("���̼߳���ִ��" + Thread.currentThread().getName());//����main
        for(int i = 0; i < 60; i++) {
            System.out.println("���߳� i=" + i);
            //�����߳�����
            Thread.sleep(1000);
        }


         /*
            (1)
            public synchronized void start() {
                start0();
            }
            (2)
            //start0() �Ǳ��ط�������JVM����, �ײ���c/c++ʵ��
            //����ʵ�ֶ��̵߳�Ч���� ��start0(), ������ run
            private native void start0();

         */



    }
}
class Cat extends Thread{  //�̳�Thread��

    int times = 0;
    @Override
    public void run() {     //��дrun����
        while (true){
            System.out.println("����, ����Сè��" + (++times) + " �߳���=" + Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {  //�����쳣
                e.printStackTrace();
            }
            if (times == 50){
                break;
            }
        }
    }
}