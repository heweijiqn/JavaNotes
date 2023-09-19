/**
 * @author 何伟健
 * @version 1.0
 * @date 2022/11/25 16:27
 */


package lixi.lan;

public class Main {
    public static void main(String[] args) {
        //计算2022可以分成多少组，每组的和为2022的质数
        int sum = 2022;
        int count = 0;
        //添加一个数组，用来存储质数
        int[] arr = new int[307];
        for (int i = 1; i <= sum; i++) {
            if (isPrime(i) ) {
                count++;
                arr[count] = i;
            }
        }
        //计算2022可以分成多少组质数且每组的和为2022
        int count1 = 0;
        for (int i = 1; i < count/2; i++) {
            for (int j = count/2; j < count; j++) {
                //如果两个质数相加等于2022，每个质数只能出现一次
                if (arr[i] + arr[j] == sum && arr[i] != arr[j]) {
                    count1++;
                    System.out.println(arr[i] + "+" + arr[j] + "=" + sum);
                }
            }
        }



        System.out.println(count);
        System.out.println(count1);


    }
    //判断是否为质数
    public static boolean isPrime(int n){//n为要判断的数
        if(n <= 1){
            return false;
        }
        for (int i = 2; i < n; i++) {
            if(n % i == 0){//如果能被整除，说明不是质数
                return false;
            }
        }
        return true;
    }
}