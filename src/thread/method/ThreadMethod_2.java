package thread.method;

public class ThreadMethod_2 {
    public static void main(String[] args) throws InterruptedException {
        T2 t2 = new T2();
        t2.start();

        for(int i = 1; i <= 20; i++) {
            Thread.sleep(1000);
            System.out.println("���߳�(С��) ���� " + i  + " ����");
            if(i == 5) {
                System.out.println("���߳�(С��) �� ���߳�(�ϴ�) �ȳ�");
                //join, �̲߳��
                //t2.join();// �����൱����t2 �߳���ִ�����
                Thread.yield();//���ã���һ���ɹ�..
                System.out.println("�߳�(�ϴ�) ������ ���߳�(С��) ���ų�..");
            }

        }


    }
}

class T2 extends Thread {
    @Override
    public void run() {
        for (int i = 1; i <= 20; i++) {
            try {
                Thread.sleep(1000);//����1��
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("���߳�(�ϴ�) ���� " + i +  " ����");
        }
    }
}

