package thread.work;

import java.util.Scanner;

public class Home_1 {
    public static void main(String[] args) {
        A a = new A();
        B b = new B(a);//һ��Ҫע��.
        a.start();
        b.start();

    }
}

//����A�߳���
class A extends Thread {
    private boolean loop = true;

    @Override
    public void run() {
        //���1-100����
        while (loop) {
            System.out.println((int)(Math.random() * 100 + 1));
            //����
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("a�߳��˳�...");

    }

    public void setLoop(boolean loop) {//�����޸�loop����
        this.loop = loop;
    }
}

//ֱ����2���̴߳Ӽ��̶�ȡ�ˡ�Q������
class B extends Thread {
    private A a;
    private Scanner scanner = new Scanner(System.in);

    public B(A a) {//�������У�ֱ�Ӵ���A�����
        this.a = a;
    }

    @Override
    public void run() {
        while (true) {
            //���յ��û�������
            System.out.println("��������ָ��(Q)��ʾ�˳�:");
            char key = scanner.next().toUpperCase().charAt(0);
            if(key == 'Q') {
                //��֪ͨ�ķ�ʽ����a�߳�
                a.setLoop(false);
                System.out.println("b�߳��˳�.");
                break;
            }
        }
    }
}
