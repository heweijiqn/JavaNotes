package intreface_.enter.InterfaceDetail;

public class InterfaceDetail {
    public static void main(String[] args) {
        //new IA();
    }



}
//1.�ӿڲ��ܱ�ʵ����
//2.�ӿ������еķ����� public����,  �ӿ��г��󷽷������Բ���abstract ����
//3.һ����ͨ��ʵ�ֽӿ�,�ͱ��뽫�ýӿڵ����з�����ʵ��,����ʹ��alt+enter�����
//4.������ȥʵ�ֽӿ�ʱ�����Բ�ʵ�ֽӿڵĳ��󷽷�
interface IA {
    void say();//���η� public protected Ĭ�� private
    void hi();
}
class Cat implements IA{
    @Override
    public void say() {

    }

    @Override
    public void hi() {

    }
}
abstract class Tiger implements  IA {

}
