package Q51;

import java.util.ArrayList;
import java.util.List;

/**
 * Given an integer n, return all distinct solutions to the n-queens puzzle.
 *
 * Each solution contains a distinct board configuration of the n-queens' placement, where 'Q' and '.'
 * both indicate a queen and an empty space respectively.
 *
 *
 * Input: 4
 * Output: [
 *  [".Q..",  // Solution 1
 *   "...Q",
 *   "Q...",
 *   "..Q."],
 *
 *  ["..Q.",  // Solution 2
 *   "Q...",
 *   "...Q",
 *   ".Q.."]
 * ]
 */

public class NQueens {
    
    List<List<String>> output = new ArrayList<>();
    
    public List<List<String>> solveNQueens(int n) {
        
        char[][] board = new char[n][n];
        
        // 初始化棋盘
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = '.';
            }
        }
        
        backtrack(board, 0);
        return output;
    }

    // 小于queens的行已经被放置
    public void backtrack(char[][]board, int queens) {
        if (queens == board.length) {
            // 把当前board添加到output
            List<String> result = new ArrayList<>();

            
            for (int i = 0; i < board.length; i++) {
                StringBuilder sb = new StringBuilder();
                for (int j = 0; j < board.length; j++) {
                    sb.append(board[i][j]);
                }
                result.add(sb.toString());
            }
            
            output.add(result);
            return;
        }

        for (int j = 0; j < board.length; j++) {

            if (!isValid(board, queens, j)) {
                continue;
            }
            // 作出选择
            board[queens][j] = 'Q';
            // 向下一层
            backtrack(board, queens + 1);
            // 撤销选择
            board[queens][j] = '.';
        }

        
    }

    public boolean isValid(char[][]board, int row, int col) {
        for (int i = 0; i < board.length; i++) {
            if (board[i][col] == 'Q') {
                return false;
            }
        }

        for (int i = row - 1, j = col + 1; i >= 0 && j < board.length; i--, j++) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }


        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }
        return true;
    }
}
