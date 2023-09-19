package intreface_.enter.poly;

public class Arr{
    public static void main(String[] args) {
        //��̬���� -> �ӿ���������
        Usb[] usbs = new Usb[2];
        usbs[0] = new Phone_();
        usbs[1] = new Camera_();
        /*
        ��Usb�����У���� Phone  ��  �������Phone�໹��һ�����еķ���call������
        �����Usb���飬�����Phone���󣬳��˵���Usb �ӿڶ���ķ����⣬
        ����Ҫ����Phone ���з��� call
         */
        for(int i = 0; i < usbs.length; i++) {
            usbs[i].work();//��̬��..
            //��ǰ��һ����������Ȼ��Ҫ�������͵�����ת��
            if(usbs[i] instanceof Phone_) {//�ж��������������� Phone_
                ((Phone_) usbs[i]).call();
            } else if(usbs[i] instanceof  Camera_){
                ((Camera_) usbs[i]).call();
            }
        }
    }


}



interface Usb{
    void work();
}
class Phone_ implements Usb {
    public void call() {
        System.out.println("�ֻ����Դ�绰...");
    }

    @Override
    public void work() {
        System.out.println("�ֻ�������...");
    }
}
class Camera_ implements Usb {

    @Override
    public void work() {
        System.out.println("���������...");
    }

    public void call() {
        System.out.println("������Դ�绰...");
    }
}
