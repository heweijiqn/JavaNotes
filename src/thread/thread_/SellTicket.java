package thread.thread_;

public class SellTicket {
    public static void main(String[] args) {
        //����
//        SellTicket01 sellTicket01 = new SellTicket01();
//        SellTicket01 sellTicket02 = new SellTicket01();
//        SellTicket01 sellTicket03 = new SellTicket01();
//
//        //�������ǻ���ֳ���..
//        sellTicket01.start();//������Ʊ�߳�
//        sellTicket02.start();//������Ʊ�߳�
//        sellTicket03.start();//������Ʊ�߳�

        //�̲߳���ȫ

        System.out.println("===ʹ��ʵ�ֽӿڷ�ʽ����Ʊ=====");
        SellTicket02 sellTicket02 = new SellTicket02();

        new Thread(sellTicket02).start();//��1���߳�-����
        new Thread(sellTicket02).start();//��2���߳�-����
        new Thread(sellTicket02).start();//��3���߳�-����

    }
}

//ʹ��Thread��ʽ

class SellTicket01 extends Thread {

    private static int ticketNum = 100;//�ö���̹߳��� ticketNum

    @Override
    public void run() {
        while (true) {

            if (ticketNum <= 0) {
                System.out.println("��Ʊ����...");
                break;
            }

            //����50����, ģ��
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println("���� " + Thread.currentThread().getName() + " �۳�һ��Ʊ"
                    + " ʣ��Ʊ��=" + (--ticketNum));

        }
    }
}



//ʵ�ֽӿڷ�ʽ
class SellTicket02 implements Runnable {
    private int ticketNum = 100;//�ö���̹߳��� ticketNum

    @Override
    public void run() {
        while (true) {

            if (ticketNum <= 0) {
                System.out.println("��Ʊ����...");
                break;
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
}
