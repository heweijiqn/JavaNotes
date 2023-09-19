package Common;

public class Math {
    public static void main(String[] args) {
        //����Math���õķ���(��̬����)
        //1.abs ����ֵ
        int abs = java.lang.Math.abs(-9);
        System.out.println(abs);//9
        //2.pow ����
        double pow = java.lang.Math.pow(2, 4);//2��4�η�
        System.out.println(pow);//16
        //3.ceil ����ȡ��,����>=�ò�������С����(ת��double);
        double ceil = java.lang.Math.ceil(3.9);
        System.out.println(ceil);//4.0
        //4.floor ����ȡ��������<=�ò������������(ת��double)
        double floor = java.lang.Math.floor(4.001);
        System.out.println(floor);//4.0
        //5.round ��������  Math.floor(�ò���+0.5)
        long round = java.lang.Math.round(5.51);
        System.out.println(round);//6
        //6.sqrt �󿪷�
        double sqrt = java.lang.Math.sqrt(9.0);
        System.out.println(sqrt);//3.0

        //7.random �������
        //  random ���ص��� 0 <= x < 1 ֮���һ�����С��

        // Math.random() * (b-a) ���صľ��� 0  <= �� <= b-a
        // (1) (int)(a) <= x <= (int)(a + Math.random() * (b-a +1) )
        // ʹ�þ������ a = 2  b = 7
        //  (int)(a + Math.random() * (b-a +1) ) = (int)( 2 + Math.random()*6)
        //  Math.random()*6 ���ص��� 0 <= x < 6 С��
        //  2 + Math.random()*6 ���صľ��� 2<= x < 8 С��
        //  (int)(2 + Math.random()*6) = 2 <= x <= 7
        // (3) ��ʽ����  (int)(a + Math.random() * (b-a +1) )
        for(int i = 0; i < 10; i++) {
            System.out.println((int)(2 +  java.lang.Math.random() * (7 - 2 + 1)));
        }

        //max , min �������ֵ����Сֵ
        int min = java.lang.Math.min(1, 9);
        int max = java.lang.Math.max(45, 90);
        System.out.println("min=" + min);
        System.out.println("max=" + max);
        double p = 1.99d;
        System.out.println((int) p);

    }
}
