package generic.test.customGeneric_;

import java.util.Arrays;

public class CustomGeneric_ {
    public static void main(String[] args) {

        //T=Double, R=String, M=Integer
        Tiger<Double,String,Integer> g = new Tiger<>("john");
        g.setT(10.9); //OK
        //g.setT("yy"); //�������Ͳ���
        System.out.println(g);
        Tiger g2 = new Tiger("john~~");//OK T=Object R=Object M=Object
        g2.setT("yy"); //OK ,��Ϊ T=Object "yy"=String ��Object����
        System.out.println("g2=" + g2);

    }
}



//1. Tiger ���淺�ͣ��������ǰ� Tiger �ͳ�Ϊ�Զ��巺����
//2, T, R, M ���͵ı�ʶ��, һ���ǵ�����д��ĸ
//3. ���ͱ�ʶ�������ж��.
//4. ��ͨ��Ա����ʹ�÷��� (���ԡ�����)
//5. ʹ�÷��͵����飬���ܳ�ʼ��
//6. ��̬�����в���ʹ����ķ���
class Tiger<T, R, M> {
    String name;
    R r; //����ʹ�õ�����
    M m;
    T t;
    //��Ϊ������new ����ȷ��T�����ͣ����޷����ڴ濪�ռ�
    T[] ts;

    public Tiger(String name) {
        this.name = name;
    }

    public Tiger(R r, M m, T t) {//������ʹ�÷���

        this.r = r;
        this.m = m;
        this.t = t;
    }

    public Tiger(String name, R r, M m, T t) {//������ʹ�÷���
        this.name = name;
        this.r = r;
        this.m = m;
        this.t = t;
    }

    //��Ϊ��̬�Ǻ�����صģ��������ʱ������û�д���
    //���ԣ������̬�����;�̬����ʹ���˷��ͣ�JVM���޷���ɳ�ʼ��
//    static R r2;
//    public static void m1(M m) {
//
//    }

    //����ʹ�÷���

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public R getR() {
        return r;
    }

    public void setR(R r) {//����ʹ�õ�����
        this.r = r;
    }

    public M getM() {//�������Ϳ���ʹ�÷���.
        return m;
    }

    public void setM(M m) {
        this.m = m;
    }

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    @Override
    public String toString() {
        return "Tiger{" +
                "name='" + name + '\'' +
                ", r=" + r +
                ", m=" + m +
                ", t=" + t +
                ", ts=" + Arrays.toString(ts) +
                '}';
    }
}



