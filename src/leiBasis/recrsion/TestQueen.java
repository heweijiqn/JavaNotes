package leiBasis.recrsion;

public class TestQueen {
    // �ʺ�/���̵ĸ���
    private static final int QUEEN_NUM = 8;

    // ���ȶ���һ��8 * 8 ������
    private static final int[][] Checkerboard = new int[QUEEN_NUM][QUEEN_NUM];

    // ����һ���ж����ַ��ûʺ���㷨
    private static int COUNT = 0;

    /**
     * ��ӡ����
     */
    public static final void show() {
        System.out.println("��" + (++COUNT) + "�ΰڷ�");
        for (int i = 0; i < QUEEN_NUM; i++) {
            for (int j = 0; j < QUEEN_NUM; j++) {
                System.out.print(Checkerboard[i][j] + " ");
            }
            System.out.println("");
        }
    }


    public static final boolean check(int row, int col) {

        // �жϵ�ǰλ�õ������Ƿ��лʺ�
        for (int i = row - 1; i >= 0; i--) {
            if (Checkerboard[i][col] == 1)
                return false;
        }

        // �ж������Ƿ��лʺ�
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (Checkerboard[i][j] == 1)
                return false;
        }

        // �ж������Ƿ��лʺ�
        for (int i = row - 1, j = col + 1; i >= 0 && j < QUEEN_NUM; i--, j++) {
            if (Checkerboard[i][j] == 1)
                return false;
        }

        return true;
    }

    /**
     * �ӵ�n�з��ûʺ�
     *
     * @param row
     */
    public static final void play(int row) {
        // ������ǰ�е����е�Ԫ�� ����Ϊ��Ԫ
        for (int i = 0; i < QUEEN_NUM; i++) {
            // �Ƿ��ܹ����ûʺ�
            if (check(row, i)) {
                Checkerboard[row][i] = 1;

                if (row == QUEEN_NUM - 1) {
                    // ����� ������� ��ӡ�ʺ�
                   show();
                } else {
                    // ������һ��
                    play(row + 1);
                }

                //���˵���ǰ���裬�ѻʺ�����Ϊ0
                Checkerboard[row][i] = 0;

            }

        }
    }

    public static void main(String[] args) {
        play(0);
    }

}
