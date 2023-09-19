package thread.thread_;

public class Thread_2 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Thread thread = new Thread(dog);
        thread.start();

//        Tiger tiger = new Tiger();//ʵ���� Runnable
//        ThreadProxy threadProxy = new ThreadProxy(tiger);
//        threadProxy.start();

    }
}

//�̴߳����� ,����ģʽ����ƶ�����ͨ�����������������ʵ����ͨ������һ����������࣬�ɴ���������ԭ��������ã��Ӷ�ʵ�ֶ���ʵ����Ĳ�����
// �ڴ���ģʽ�У����������Ҫ��һ���н�����ã�����Э�������ӵ�����(���ͻ���)�ͱ�������(��Ŀ�����)��
// ��һ���̶��Ͻ�����ϵͳ����϶ȣ�ͬʱҲ������Ŀ�����
// ��ȱ�����ڵ������뱻������֮�������˴�����󣬿��ܻ��������Ĵ����ٶȱ���
// ģ����һ�������Thread��
class ThreadProxy implements Runnable {//����԰�Proxy�൱�� ThreadProxy

    private Runnable target = null;//���ԣ������� Runnable

    @Override
    public void run() {
        if (target != null) {
            target.run();//��̬�󶨣���������Tiger��
        }
    }

    public ThreadProxy(Runnable target) {
        this.target = target;
    }

    public void start() {
        start0();//�������ʱ����ʵ�ֶ��̷߳���
    }

    public void start0() {
        run();
    }
}

class Animal{

}


class Tiger extends Animal implements Runnable{
    @Override
    public void run() {
        System.out.println("�ϻ���������");

    }
}




class Dog implements Runnable {
    int time = 0;

    @Override
    public void run() {
        while (true) {
            System.out.println("С��������..hi" + (++time) + Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            if (time == 50) {
                break;
            }
        }

    }
}