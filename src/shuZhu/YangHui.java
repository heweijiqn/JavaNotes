package shuZhu;

public class YangHui {
    public static void main(String[] ages) {
        int[][] yangHui = new int[12][];
        for (int i = 0; i < yangHui.length; i++) {//���� yangHui ��ÿ��Ԫ��
            //��ÿ��һά����(��) ���ռ�
            yangHui[i] = new int[i + 1];
            //��ÿ��һά����(��) ��ֵ
            for (int j = 0; j < yangHui[i].length; j++) {
            //ÿһ�еĵ�һ��Ԫ�غ����һ��Ԫ�ض��� 1
                if (j == 0 || j == yangHui[i].length - 1) {
                    yangHui[i][j] = 1;
                } else {//�м��Ԫ��
                    yangHui[i][j] = yangHui[i - 1][j] + yangHui[i - 1][j - 1];
                }

            }
        }
        //����������
        for(int i = 0; i < yangHui.length; i++) {
            for (int j = 0; j < yangHui[i].length; j++) {//�����������
                System.out.print(yangHui[i][j] + "\t");
            }
            System.out.println();//����
        }
    }
}
