package thread.method;

public class DeadLock_ {
    public static void main(String[] args) {
        //ģ����������
        DeadLockDemo A = new DeadLockDemo(true);
        A.setName("A�߳�");
        DeadLockDemo B = new DeadLockDemo(false);
        B.setName("B�߳�");
        A.start();
        B.start();

    }
}

//�߳�
class DeadLockDemo extends Thread {
    static Object o1 = new Object();// ��֤���̣߳�����һ������,����ʹ��static
    static Object o2 = new Object();
    boolean flag;

    public DeadLockDemo(boolean flag) {//������
        this.flag = flag;
    }

    @Override
    public void run() {

        //����ҵ���߼��ķ���
        //1. ���flag Ϊ T, �߳�A �ͻ��ȵõ�/���� o1 ������, Ȼ����ȥ��ȡ o2 ������
        //2. ����߳�A �ò��� o2 ���������ͻ�Blocked
        //3. ���flag Ϊ F, �߳�B �ͻ��ȵõ�/���� o2 ������, Ȼ����ȥ��ȡ o1 ������
        //4. ����߳�B �ò��� o1 ���������ͻ�Blocked
        if (flag) {
            synchronized (o1) {//���󻥳���, �������ͬ������
                System.out.println(Thread.currentThread().getName() + " ����1");
                synchronized (o2) { // ������li����ļ���Ȩ
                    System.out.println(Thread.currentThread().getName() + " ����2");
                }

            }
        } else {
            synchronized (o2) {
                System.out.println(Thread.currentThread().getName() + " ����3");
                synchronized (o1) { // ������li����ļ���Ȩ
                    System.out.println(Thread.currentThread().getName() + " ����4");
                }
            }
        }
    }
}

