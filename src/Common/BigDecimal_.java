package Common;

import java.math.BigDecimal;

public class BigDecimal_ {
    public static void main(String[] args) {
       /*** ��������Ҫ����һ�����Ⱥܸߵ���ʱ��double ������
        ������ BigDecimal
        double d = 1999.11111111111999999999999977788d;
        System.out.println(d);***/
        BigDecimal bigDecimal = new BigDecimal("1999.11111111111111111111345611112311111178911111111111111111111111");
        BigDecimal bigDecimal2 = new BigDecimal("3");
        System.out.println(bigDecimal);


        //1. ����� BigDecimal�������㣬����Ӽ��˳�����Ҫʹ�ö�Ӧ�ķ���
        //2. ����һ����Ҫ������ BigDecimal Ȼ�������Ӧ�ķ�������
        System.out.println(bigDecimal.add(bigDecimal2));
        System.out.println(bigDecimal.subtract(bigDecimal2));
        System.out.println(bigDecimal.multiply(bigDecimal2));
        //System.out.println(bigDecimal.divide(bigDecimal2));//�����׳��쳣ArithmeticException
        //�ڵ���divide ����ʱ��ָ�����ȼ���. BigDecimal.ROUND_CEILING
        //���������ѭ��С�����ͻᱣ�� ���� �ľ���
        System.out.println(bigDecimal.divide(bigDecimal2, BigDecimal.ROUND_CEILING));
    }
}
