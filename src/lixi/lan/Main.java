/**
 * @author ��ΰ��
 * @version 1.0
 * @date 2022/11/25 16:27
 */


package lixi.lan;

public class Main {
    public static void main(String[] args) {
        //����2022���Էֳɶ����飬ÿ��ĺ�Ϊ2022������
        int sum = 2022;
        int count = 0;
        //���һ�����飬�����洢����
        int[] arr = new int[307];
        for (int i = 1; i <= sum; i++) {
            if (isPrime(i) ) {
                count++;
                arr[count] = i;
            }
        }
        //����2022���Էֳɶ�����������ÿ��ĺ�Ϊ2022
        int count1 = 0;
        for (int i = 1; i < count/2; i++) {
            for (int j = count/2; j < count; j++) {
                //�������������ӵ���2022��ÿ������ֻ�ܳ���һ��
                if (arr[i] + arr[j] == sum && arr[i] != arr[j]) {
                    count1++;
                    System.out.println(arr[i] + "+" + arr[j] + "=" + sum);
                }
            }
        }



        System.out.println(count);
        System.out.println(count1);


    }
    //�ж��Ƿ�Ϊ����
    public static boolean isPrime(int n){//nΪҪ�жϵ���
        if(n <= 1){
            return false;
        }
        for (int i = 2; i < n; i++) {
            if(n % i == 0){//����ܱ�������˵����������
                return false;
            }
        }
        return true;
    }
}