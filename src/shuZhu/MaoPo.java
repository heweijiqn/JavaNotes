package shuZhu;

public class MaoPo {
    public static void main(String[] ages){
        int[] arr = {25,57,48,37,92,86,12,33};
        int temp = 0; //���ڸ��������ı���
        //����������ʹ�����ѭ��������������
        //������� =�� 4 ���� arr.length - 1
        for( int i = 0; i < arr.length - 1; i++) {//���ѭ���� 4 ��
            for (int j = 0; j < arr.length - 1 - i; j++) {//4 �αȽ�-3 ��-2 ��-1 ��
                //���ǰ�����>����������ͽ���
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
            System.out.println("\n==��" + (i + 1) + "��==");
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[j] + "\t");
            }
        }
    }
}
