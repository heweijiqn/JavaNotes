package thread.method;

public class ThreadMethod_3 {
    public static void main(String[] args) throws InterruptedException {
        MyDaemonThread myDaemonThread = new MyDaemonThread();
        //�������ϣ����main�߳̽��������߳��Զ�����
        //,ֻ�轫���߳���Ϊ�ػ��̼߳���
        myDaemonThread.setDaemon(true);
        myDaemonThread.start();

        for( int i = 1; i <= 10; i++) {//main�߳�
            System.out.println("��ǿ������Ĺ���...");
            Thread.sleep(1000); //
        }

    }
}

class MyDaemonThread extends Thread {
    public void run() {
        for (; ; ) {//����ѭ��
            try {
                Thread.sleep(1000);//����1000����
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("���غ��Ά��������죬������~~~");
        }
    }
}
