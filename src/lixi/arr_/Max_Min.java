/**
 * @author ��ΰ��
 * @version 1.0
 * @date 2022/10/22 22:17
 */


package lixi.arr_;

@SuppressWarnings("all")
public class Max_Min {
    public static void main(String[] args) {
        int[][] arr ={
                {1,2,3},
                {4,5,6},
                {9,8,9},
                {19,3,4}
        };
        max(arr);

    }
//    ����������
    public static void max(int[][] arr){
        for (int i=0;i<arr.length;i++){
            for (int j=0;j<arr[i].length;j++){
                    System.out.print(arr[i][j]+"\t");
                }
                    System.out.println();
            }

        for(int i=0;i<arr.length;i++) {
            boolean flag = true;
            int min=arr[i][0];
            int list=0;

            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] < min) {
                    min = arr[i][j];
                    list = j;
                }
            }

            for (int k = 0; k < arr.length; k++) {
                if (min < arr[k][list]) {
                    flag = false;
                }
            }

            if (flag) {
                System.out.println("����Ϊ��" + (i + 1) + "�е�" + (list + 1) + "�д�СΪ" + min);
            }
        }

        }



}
