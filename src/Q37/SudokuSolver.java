package Q37;

/**
 * Write a program to solve a Sudoku puzzle by filling the empty cells.
 */

public class SudokuSolver {
    public void solveSudoku(char[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] == '.') {
                    for (char k = '1'; k <= '9'; k++) {
                        board[i][j] = k;
                        backtrack(board);
                    }
                }
            }
        }

    }

    private void backtrack(char[][] curboard) {
//        boolean finished = true;
//        for (int i = 0; i < curboard.length; i++) {
//            for (int j = 0; j < curboard[i].length; j++) {
//                if (curboard[i][j] == '.') {
//                    finished = false;
//                }
//            }
//        }
//        if (finished) {
//            return;
//        } else {
//            backtrack();
//            return;
//        }
    }
}
