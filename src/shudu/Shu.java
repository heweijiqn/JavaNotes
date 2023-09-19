/**
 * @author ºÎÎ°½¡
 * @version 1.0
 * @date 2023/7/7 15:11
 */


package shudu;

public class Shu {

    public static void main(String[] args) {
        int[][] arr = {
                {1, 0, 0, 4, 0, 2},
                {2, 3, 0, 0, 0, 0},
                {0, 1, 0, 2, 0, 0},
                {0, 0, 2, 0, 1, 0},
                {0, 0, 0, 0, 4, 5},
                {5, 0, 4, 0, 0, 1}
        };

        solveSudoku(arr);
        printSudoku(arr);
    }

    public static void solveSudoku(int[][] board) {
        solve(board);
    }

    private static boolean solve(int[][] board) {
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                if (board[i][j] == 0) {
                    for (int num = 1; num <= 6; num++) {
                        if (isValid(board, i, j, num)) {
                            board[i][j] = num;

                            if (solve(board))
                                return true;

                            board[i][j] = 0;
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }

    private static boolean isValid(int[][] board, int row, int col, int num) {
        for (int i = 0; i < 6; i++) {
            if (board[row][i] == num || board[i][col] == num ||
                    board[3 * (row / 3) + i / 3][3 * (col / 3) + i % 3] == num) {
                return false;
            }
        }
        return true;
    }

    private static void printSudoku(int[][] board) {
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
}
