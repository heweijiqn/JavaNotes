package thread.method;

public class ThreadExit_ {
    public static void main(String[] args) throws InterruptedException {
        F t1 = new F();
        t1.start();

        //���ϣ��main�߳�ȥ����t1 �̵߳���ֹ, ��������޸� loop
        //��t1 �˳�run�������Ӷ���ֹ t1�߳� -> ֪ͨ��ʽ

        //�����߳����� 10 �룬��֪ͨ t1�߳��˳�
        System.out.println("main�߳�����10s...");
        Thread.sleep(10 * 1000);
        t1.setLoop(false);

    }


}

class F extends Thread {
    private int count = 0;
    //����һ�����Ʊ���
    private boolean loop = true;
    @Override
    public void run() {
        while (loop) {

            try {
                Thread.sleep(50);// �õ�ǰ�߳�����50ms
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("T ������...." + (++count));
        }

    }

    public void setLoop(boolean loop) {
        this.loop = loop;
    }
}

