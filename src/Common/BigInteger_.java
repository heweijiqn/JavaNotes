package Common;

import java.math.BigInteger;

public class BigInteger_ {
    public static void main(String[] args) {
        /***�����Ǳ���У���Ҫ����ܴ��������long ������
        ����ʹ��BigInteger�������㶨
        long l = 23788888899999999999999999999l;
        System.out.println("l=" + l);***/

        BigInteger bigInteger = new BigInteger("23788888899999999999999999999");
        BigInteger bigInteger2 = new BigInteger("10099999999999999999999999999999999999999999999999999999999999999999999999999999999");
        System.out.println(bigInteger);
        //�Ϻ����
        //1. �ڶ� BigInteger ���мӼ��˳���ʱ����Ҫʹ�ö�Ӧ�ķ���������ֱ�ӽ��� + - * /
        //2. ���Դ���һ�� Ҫ������ BigInteger Ȼ�������Ӧ����
        BigInteger add = bigInteger.add(bigInteger2);
        System.out.println(add);//
        BigInteger subtract = bigInteger.subtract(bigInteger2);
        System.out.println(subtract);//��
        BigInteger multiply = bigInteger.multiply(bigInteger2);
        System.out.println(multiply);//��
        BigInteger divide = bigInteger.divide(bigInteger2);
        System.out.println(divide);//��


    }
}
