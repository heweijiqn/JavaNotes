package Common.packaging;

public class Wrapper {
    public static void main(String[] args) {
        Double d = 100d; //ok, �Զ�װ�� Double.valueOf(100d);
        Float f = 1.5f; //ok, �Զ�װ�� Float.valueOf(1.5f);

        Object obj1 = true? new Integer(1) : new Double(2.0);//��Ԫ���������һ�����塿
        System.out.println(obj1);//  1.0 ������

        //��� 1�� �ֱ����
        Object obj2;
        if(true)
            obj2 = new Integer(1);
        else
            obj2 = new Double(2.0);
        System.out.println(obj2);//  1

        //�Զ�����
        int i1 = new Integer(1);//ok, �Զ�����
        //�Զ�װ��
        Integer in = 1;//ok, �Զ�װ��



        Integer i = new Integer(1);//new Integer(1) ��һ������ 1 ��һ��������������
        Integer j = new Integer(1);
        System.out.println(i == j);  //False
        //���ԣ�������Ҫ�ǿ���Χ -128 ~ 127 ����ֱ�ӷ���
        /*

        //1. ���i �� IntegerCache.low(-128)~IntegerCache.high(127),��ֱ�Ӵ����鷵��
        //2. ������� -128~127,��ֱ�� new Integer(i)
         public static Integer valueOf(int i) {
            if (i >= IntegerCache.low && i <= IntegerCache.high)
                return IntegerCache.cache[i + (-IntegerCache.low)];
            return new Integer(i);
        }
         */
        Integer m = 1; //�ײ� Integer.valueOf(1); -> �Ķ�Դ��
        Integer n = 1;//�ײ� Integer.valueOf(1);
        System.out.println(m == n); //T
        //���ԣ�������Ҫ�ǿ���Χ -128 ~ 127 ����ֱ�ӷ���
        //�����򣬾�new Integer(xx);
        Integer x = 128;//�ײ�Integer.valueOf(1);
        Integer y = 128;//�ײ�Integer.valueOf(1);
        System.out.println(x == y);//False



        Integer i11=127;
        int i12=127;
        //ֻ���л����������ͣ��жϵ���
        //ֵ�Ƿ���ͬ
        System.out.println(i11==i12); //T

        Integer i13=128;
        int i14=128;//�ײ�Integer.valueOf(1);
        //ֻ���л����������ͣ��жϵ���    ֵ�Ƿ���ͬ
        System.out.println(i13==i14);//T


    }
}
