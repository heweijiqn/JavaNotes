package shuZhu;

public class ShuZhu_Nai {
    public static void main(String[] ages){
        //int arr[][] = new int[2][3];
        int arr[][]; //������ά����
        arr = new int[2][3];//�ٿ��ռ�
        //arr[1][1] = 8;
        //���� arr ����
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[i].length; j++) {//��ÿ��һά�������
                System.out.print(arr[i][j] +" ");
            }
            System.out.println();//����
        }

    }
}
