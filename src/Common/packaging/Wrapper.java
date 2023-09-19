package Common.packaging;

public class Wrapper {
    public static void main(String[] args) {
        Double d = 100d; //ok, 自动装箱 Double.valueOf(100d);
        Float f = 1.5f; //ok, 自动装箱 Float.valueOf(1.5f);

        Object obj1 = true? new Integer(1) : new Double(2.0);//三元运算符【是一个整体】
        System.out.println(obj1);//  1.0 按最大的

        //输出 1， 分别计算
        Object obj2;
        if(true)
            obj2 = new Integer(1);
        else
            obj2 = new Double(2.0);
        System.out.println(obj2);//  1

        //自动拆箱
        int i1 = new Integer(1);//ok, 自动拆箱
        //自动装箱
        Integer in = 1;//ok, 自动装箱



        Integer i = new Integer(1);//new Integer(1) 是一个对象 1 是一个基本数据类型
        Integer j = new Integer(1);
        System.out.println(i == j);  //False
        //所以，这里主要是看范围 -128 ~ 127 就是直接返回
        /*

        //1. 如果i 在 IntegerCache.low(-128)~IntegerCache.high(127),就直接从数组返回
        //2. 如果不在 -128~127,就直接 new Integer(i)
         public static Integer valueOf(int i) {
            if (i >= IntegerCache.low && i <= IntegerCache.high)
                return IntegerCache.cache[i + (-IntegerCache.low)];
            return new Integer(i);
        }
         */
        Integer m = 1; //底层 Integer.valueOf(1); -> 阅读源码
        Integer n = 1;//底层 Integer.valueOf(1);
        System.out.println(m == n); //T
        //所以，这里主要是看范围 -128 ~ 127 就是直接返回
        //，否则，就new Integer(xx);
        Integer x = 128;//底层Integer.valueOf(1);
        Integer y = 128;//底层Integer.valueOf(1);
        System.out.println(x == y);//False



        Integer i11=127;
        int i12=127;
        //只有有基本数据类型，判断的是
        //值是否相同
        System.out.println(i11==i12); //T

        Integer i13=128;
        int i14=128;//底层Integer.valueOf(1);
        //只有有基本数据类型，判断的是    值是否相同
        System.out.println(i13==i14);//T


    }
}
