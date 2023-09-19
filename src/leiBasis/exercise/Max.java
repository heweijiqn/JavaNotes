package leiBasis.exercise;

public class Max {
    /*
编写类Home_1，定义方法max，实现求某个double数组的最大值，并返回

思路分析
1. 类名 Home_1
2. 方法名 max
3. 形参 (double[])
4. 返回值 double

先完成正常业务，然后再考虑代码健壮性
 */
    public Double max(double[] arr) {
        //老韩先判断arr是否为null,然后再判断 length 是否>0
        if( arr!= null && arr.length > 0 ) {

            //保证arr至少有一个元素
            double max = arr[0];//假定第一个元素就是最大值
            for(int i = 1; i < arr.length; i++) {
                if(max < arr[i]) {
                    max = arr[i];
                }
            }

            return max;//double
        } else {
            return null;
        }
    }

    public static void main(String[] args) {
        Max a01 = new Max();
        double[] arr = {1, 1.4, -1.3, 89.8, 123.8 , 66}; //;{};
        Double res = a01.max(arr);
        if(res != null) {
            System.out.println("arr的最大值=" + res);
        } else {
            System.out.println("arr的输入有误, 数组不能为null, 或者{}");
        }
    }
}
