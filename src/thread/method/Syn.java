package thread.method;

public class Syn {
    public static void main(String[] args) {
        SellTicket03 sellTicket03 = new SellTicket03();
        new Thread(sellTicket03).start();//��1���߳�-����
        new Thread(sellTicket03).start();//��2���߳�-����
        new Thread(sellTicket03).start();//��3���߳�-����


    }
}
class SellTicket03 implements Runnable {
    private int ticketNum = 100;//�ö���̹߳��� ticketNum
    private boolean loop = true;//����run��������
    Object object = new Object();


    //ͬ����������̬�ģ�����Ϊ��ǰ�౾��
    //�Ϻ����
    //1. public synchronized static void m1() {} ���Ǽ��� SellTicket03.class
    //2. ����ھ�̬�����У�ʵ��һ��ͬ�������.
    /*
        synchronized (SellTicket03.class) {
            System.out.println("m2");
        }
     */
    public synchronized static void m1() {

    }
    public static  void m2() {
        synchronized (SellTicket03.class) {
            System.out.println("m2");
        }
    }

    //�Ϻ�˵��
    //1. public synchronized void sell() {} ����һ��ͬ������
    //2. ��ʱ���� this����
    //3. Ҳ�����ڴ������д synchronize ,ͬ�������, ������������this����
    public /*synchronized*/ void sell() { //ͬ������, ��ͬһʱ�̣� ֻ����һ���߳���ִ��sell����

        synchronized (/*this*/object) {
            if (ticketNum <= 0) {
                System.out.println("��Ʊ����...");
                loop = false;
                return;
            }

            //����50����, ģ��
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println("���� " + Thread.currentThread().getName() + " �۳�һ��Ʊ"
                    + " ʣ��Ʊ��=" + (--ticketNum));//1 - 0 - -1  - -2
        }

    }

    @Override
    public void run() {
        while (loop) {

            sell();//sell������һ��ͬ������
        }
    }
}

