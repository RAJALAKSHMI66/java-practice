package previous_yr_qs;
public class SudokuChecker {
    public static boolean isCorrectSudoku(int[][] board) {
        int targetSum = 45;
        for (int r = 0; r < 9; r++) {
            int rowSum = 0;
            for (int c = 0; c < 9; c++) {
                rowSum += board[r][c];
            }
            if (rowSum != targetSum) return false;
        }
        for (int c = 0; c < 9; c++) {
            int colSum = 0;
            for (int r = 0; r < 9; r++) {
                colSum += board[r][c];
            }
            if (colSum != targetSum) return false;
        }
        for (int boxRow = 0; boxRow < 9; boxRow += 3) {
            for (int boxCol = 0; boxCol < 9; boxCol += 3) {
                int boxSum = 0;
                for (int r = boxRow; r < boxRow + 3; r++) {
                    for (int c = boxCol; c < boxCol + 3; c++) {
                        boxSum += board[r][c];
                    }
                }
                if (boxSum != targetSum) return false;
            }
        }

        return true;
    }
    public static void main(String[] args) {
        int[][] sudoku = {
                {5,3,4,6,7,8,9,1,2},
                {6,7,2,1,9,5,3,4,8},
                {1,9,8,3,4,2,5,6,7},
                {8,5,9,7,6,1,4,2,3},
                {4,2,6,8,5,3,7,9,1},
                {7,1,3,9,2,4,8,5,6},
                {9,6,1,5,3,7,2,8,4},
                {2,8,7,4,1,9,6,3,5},
                {3,4,5,2,8,6,1,7,9}
        };

        if (isCorrectSudoku(sudoku)) {
            System.out.println("Sudoku is correct ✅");
        } else {
            System.out.println("Sudoku is incorrect ❌");
        }
    }
}
