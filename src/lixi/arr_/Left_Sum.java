/**
 * @author 何伟健
 * @version 1.0
 * @date 2022/10/23 14:15
 */


package lixi.arr_;


@SuppressWarnings("all")
public class Left_Sum {

    public static void main(String[] args) {

        int[][] arr ={
                {1,0,0,2,0,0,0,0,0,0},
                {0,4,0,1,0,0,0,0,0,0},
                {0,0,0,0,2,0,0,0,0,0},
                {0,0,9,0,0,0,0,0,0,0},
                {0,5,0,0,0,0,0,0,0,0},
        };
        System.out.println("稀疏数组为：");
       for (int i=0;i<arr.length;i++){
           for (int j=0;j<arr[i].length;j++){
               System.out.print(arr[i][j]+"\t");
           }
           System.out.println();
       }
       leftsum(arr);


    }
    public static void leftsum(int[][] arr){
        TupClass tupClass = new TupClass();
        tupClass.CreateTup(arr,arr.length,arr[0].length);
        System.out.println("转为三元组为：");
        tupClass.DispTup();
        int sum=0;
        for (int i=0;i<tupClass.nums;i++){
               if ((tupClass.data.get(i).r)==(tupClass.data.get(i).c)){
                  sum+=tupClass.data.get(i).d;
               }
        }
        System.out.println("左上角——右下角和为："+sum);


    }
}
