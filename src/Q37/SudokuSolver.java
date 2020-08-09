package Q37;

/**
 * Write a program to solve a Sudoku puzzle by filling the empty cells.
 */

public class SudokuSolver {
    public void solveSudoku(char[][] board) {
        backtrack(board, 0, 0);
    }

    private boolean backtrack(char[][] board, int row, int col) {
        if (col == 9) {
            // 换行
            return backtrack(board, row + 1, 0);
        }

        if (row == 9) {
            return true;
        }
        
        if (board[row][col] != '.') {
            return backtrack(board, row, col + 1);
        }

        for (char i = '1'; i <= '9'; i++) {
            if (!isValid(board, row, col, i)) {
                continue;
            }
            board[row][col] = i;
            if (backtrack(board, row, col + 1)) {
                return true;
            }

            board[row][col] = '.';
        }
        return false;
    }
    // 判断 board[i][j] 是否可以填入 n
    boolean isValid(char[][] board, int row, int col, char n) {
        for (int i = 0; i < 9; i++) {
            if (board[row][i] == n) {
                return false;
            }

            if (board[i][col] == n) {
                return false;
            }

            if (board[(row / 3) * 3 + i / 3][(col / 3) * 3 + i % 3] == n) {
                return false;
            }
        }
        return true;
    }
}
