package final_;

public class FinalDetail {
    public static void main(String[] args) {
        CC cc = new CC();

        new EE().cal();
        System.out.println(BBB.num);

/**                                                ��װ��
 *       byte                            java.lang.Byte             Number
 *       short                           java.lang.Short            Number
 *       Integer                         java.lang.Integer          Number
 *       long                            java.lang.Long             Number
 *       Float                           java.lang.Float            Number
 *       Double                          java.lang.Double           Number
 *       boolean                         java.lang.Boolean          Object
 *       char                            java.lang.Character        Object
 *            ��װ��,String ��final�࣬���ܱ��̳�
 *
 * */
    }

}
class AA {
    /*
    1. ����ʱ���� public final double TAX_RATE=0.08;
    2. �ڹ�������
    3. �ڴ������
     */
    public final double TAX_RATE = 0.08;//1.����ʱ��ֵ
    public final double TAX_RATE2 ;
    public final double TAX_RATE3 ;

    public AA() {//�������и�ֵ
        TAX_RATE2 = 1.1;
    }
    {//�ڴ���鸳ֵ
        TAX_RATE3 = 8.8;
    }
}

class BB {
    /*
    ���final���ε������Ǿ�̬�ģ����ʼ����λ��ֻ����
    1 ����ʱ  2 �ھ�̬����� �����ڹ������и�ֵ��
     */
    public static final double TAX_RATE = 99.9;
    public static final double TAX_RATE2 ;

    static {
        TAX_RATE2 = 3.3;
    }


}
//final �� static ��������ʹ�ã�Ч�ʸ��ߣ����ᵼ�������.�ײ�����������Ż�����
class BBB  {
    public final static  int num = 10000;
    public final static String s ="hhh";
    static {
        System.out.println("BBB ��̬����鱻ִ��");
    }
}
final class AAA{
    //һ����˵�����һ�����Ѿ���final���ˣ���û�б�Ҫ�ٽ��������γ�final����
    //public final void cry() {}
}


//final�಻�ܼ̳У����ǿ���ʵ��������
final class CC {

}


//����಻��final�࣬���Ǻ���final��������÷�����Ȼ������д�����ǿ��Ա��̳�
//������Ȼ���ؼ̳еĻ���.
class DD {
    public final void cal() {
        System.out.println("cal()����");
    }
}
class EE extends DD {

}

