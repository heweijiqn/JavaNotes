package thread.work;

public class Home_2 {
    public static void main(String[] args) {
        T t = new T();
        Thread thread1 = new Thread(t);
        thread1.setName("t1");
        Thread thread2 = new Thread(t);
        thread2.setName("t2");
        thread1.start();
        thread2.start();
    }

}

//���ȡ����߳�
//1.��Ϊ�����漰������̹߳�����Դ����������ʹ��ʵ��Runnable��ʽ
//2. ÿ��ȡ�� 1000
class T implements  Runnable {
    private int money = 10000;

    @Override
    public void run() {
        while (true) {

            //���
            //1. ����ʹ�� synchronized ʵ�����߳�ͬ��
            //2. ������߳�ִ�е�����ʱ���ͻ�ȥ���� this������
            //3. �ĸ��߳����ᵽ(��ȡ)this����������ִ�� synchronized �����, ִ����󣬻��ͷ�this������
            //4. ���᲻��this����������blocked ��׼����������
            //5. this�������Ƿǹ�ƽ��.

            synchronized (this) {//
                //�ж�����Ƿ�
                if (money < 1000) {
                    System.out.println("����");
                    break;
                }

                money -= 1000;
                System.out.println(Thread.currentThread().getName() + " ȡ����1000 ��ǰ���=" + money);
            }

            //����1s
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
