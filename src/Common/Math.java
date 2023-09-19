package Common;

public class Math {
    public static void main(String[] args) {
        //看看Math常用的方法(静态方法)
        //1.abs 绝对值
        int abs = java.lang.Math.abs(-9);
        System.out.println(abs);//9
        //2.pow 求幂
        double pow = java.lang.Math.pow(2, 4);//2的4次方
        System.out.println(pow);//16
        //3.ceil 向上取整,返回>=该参数的最小整数(转成double);
        double ceil = java.lang.Math.ceil(3.9);
        System.out.println(ceil);//4.0
        //4.floor 向下取整，返回<=该参数的最大整数(转成double)
        double floor = java.lang.Math.floor(4.001);
        System.out.println(floor);//4.0
        //5.round 四舍五入  Math.floor(该参数+0.5)
        long round = java.lang.Math.round(5.51);
        System.out.println(round);//6
        //6.sqrt 求开方
        double sqrt = java.lang.Math.sqrt(9.0);
        System.out.println(sqrt);//3.0

        //7.random 求随机数
        //  random 返回的是 0 <= x < 1 之间的一个随机小数

        // Math.random() * (b-a) 返回的就是 0  <= 数 <= b-a
        // (1) (int)(a) <= x <= (int)(a + Math.random() * (b-a +1) )
        // 使用具体的数 a = 2  b = 7
        //  (int)(a + Math.random() * (b-a +1) ) = (int)( 2 + Math.random()*6)
        //  Math.random()*6 返回的是 0 <= x < 6 小数
        //  2 + Math.random()*6 返回的就是 2<= x < 8 小数
        //  (int)(2 + Math.random()*6) = 2 <= x <= 7
        // (3) 公式就是  (int)(a + Math.random() * (b-a +1) )
        for(int i = 0; i < 10; i++) {
            System.out.println((int)(2 +  java.lang.Math.random() * (7 - 2 + 1)));
        }

        //max , min 返回最大值和最小值
        int min = java.lang.Math.min(1, 9);
        int max = java.lang.Math.max(45, 90);
        System.out.println("min=" + min);
        System.out.println("max=" + max);
        double p = 1.99d;
        System.out.println((int) p);

    }
}
