/**
 * @author 何伟健
 * @version 1.0
 * @date 2022/10/22 22:10
 */


package lixi.arr_;

@SuppressWarnings("all")
public class Sum {
    public static void main(String[] args) {
        int[][] arr ={
                {1,2,3},
                {4,5,6},
                {9,8,9},};
        sum(arr);

    }
    public static int sum(int[][] arr){
        int sum = 0;
        int conut=0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i][i];
            conut += arr[i][arr.length-i-1];
        }
        System.out.println("左上角——右下角和为："+sum);
        System.out.println("右上角——左下角和为："+conut);
        return sum+conut;
    }
}
