package intreface_.enter.InterfaceDetail;

public class Detail {
    public static void main(String[] args) {
        //֤�� �ӿ��е�����,�� public static final
        System.out.println(IB.n1);//˵��n1 ����static
        //IB.n1 = 30;  false ˵��n1 �� final
    }


}

interface IB {
    //�ӿ��е�����,ֻ����final�ģ������� public static final ���η�
    int n1 = 10; //�ȼ� public static final int n1 = 10;
    void hi();
}
interface IC {
    void say();
}
//�ӿڲ��ܼ̳���������,���ǿ��Լ̳ж����Ľӿ�
interface ID extends IB,IC {
}
//�ӿڵ����η� ֻ���� public ��Ĭ�ϣ�����������η���һ����
interface IE{}

//һ����ͬʱ����ʵ�ֶ���ӿ�
class Pig implements IB,IC {
    @Override
    public void hi() {
    }
    @Override
    public void say() {
    }
}
