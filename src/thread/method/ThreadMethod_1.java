package thread.method;

public class ThreadMethod_1 {
    public static void main(String[] args) throws InterruptedException {
        T t = new T();
        t.setName("�Ϻ�");
        t.setPriority(Thread.MIN_PRIORITY);//1
        t.start();//�������߳�


        //���̴߳�ӡ5 hi ,Ȼ���Ҿ��ж� ���̵߳�����
        for(int i = 0; i < 5; i++) {
            Thread.sleep(20);
            System.out.println("hi " + i);
        }

        System.out.println(t.getName() + " �̵߳����ȼ� =" + t.getPriority());//1

        t.interrupt();//��ִ�е�����ͻ��ж� t�̵߳�����.




    }
}

class T extends Thread { //�Զ�����߳���
    @Override
    public void run() {
        while (true) {
            for (int i = 0; i < 100; i++) {
                //Thread.currentThread().getName() ��ȡ��ǰ�̵߳�����
                System.out.println(Thread.currentThread().getName() + "  �԰���~~~~" + i);
            }
            try {
                System.out.println(Thread.currentThread().getName() + " ������~~~");
                Thread.sleep(20000);//20��
            } catch (InterruptedException e) {
                //�����߳�ִ�е�һ��interrupt ����ʱ���ͻ�catch һ�� �쳣, ���Լ����Լ���ҵ�����
                //InterruptedException �ǲ���һ���ж��쳣.
                System.out.println(Thread.currentThread().getName() + "�� interrupt��");
            }
        }
    }
}

