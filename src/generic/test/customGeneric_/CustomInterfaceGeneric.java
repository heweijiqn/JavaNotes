package generic.test.customGeneric_;

public class CustomInterfaceGeneric {
    public static void main(String[] args) {

    }
}

/**
 *  ���ͽӿ�ʹ�õ�˵��
 *  1. �ӿ��У���̬��ԱҲ����ʹ�÷���
 *  2. ���ͽӿڵ�����, �ڼ̳нӿڻ���ʵ�ֽӿ�ʱȷ��
 *  3. û��ָ�����ͣ�Ĭ��ΪObject
 */

//�ڼ̳нӿ� ָ�����ͽӿڵ�����
interface IA extends IUsb<String, Double> {

}
//������ȥʵ��IA�ӿ�ʱ����ΪIA�ڼ̳�IUsu �ӿ�ʱ��ָ����U ΪString RΪDouble
//����ʵ��IUsu�ӿڵķ���ʱ��ʹ��String�滻U, ��Double�滻R
class AA implements IA {

    @Override
    public Double get(String s) {
        return null;
    }
    @Override
    public void hi(Double aDouble) {

    }
    @Override
    public void run(Double r1, Double r2, String u1, String u2) {

    }
}

//ʵ�ֽӿ�ʱ��ֱ��ָ�����ͽӿڵ�����
//��U ָ��Integer �� R ָ���� Float
//���ԣ�������ʵ��IUsb����ʱ����ʹ��Integer�滻U, ʹ��Float�滻R
class BB implements IUsb<Integer, Float> {

    @Override
    public Float get(Integer integer) {
        return null;
    }

    @Override
    public void hi(Float aFloat) {

    }

    @Override
    public void run(Float r1, Float r2, Integer u1, Integer u2) {

    }
}
//û��ָ�����ͣ�Ĭ��ΪObject
//����ֱ��д�� IUsb<Object,Object>
class CC implements IUsb { //�ȼ� class CC implements IUsb<Object,Object> {
    @Override
    public Object get(Object o) {
        return null;
    }
    @Override
    public void hi(Object o) {
    }
    @Override
    public void run(Object r1, Object r2, Object u1, Object u2) {

    }

}

interface IUsb<U, R> {

    int n = 10;
    //U name; ��������ʹ��  �ڽӿ������ĳ�Ա���Ǿ�̬����

    //��ͨ�����У�����ʹ�ýӿڷ���
    R get(U u);

    void hi(R r);

    void run(R r1, R r2, U u1, U u2);

    //��jdk8 �У������ڽӿ��У�ʹ��Ĭ�Ϸ���, Ҳ�ǿ���ʹ�÷���
    default R method(U u) {
        return null;
    }
}




