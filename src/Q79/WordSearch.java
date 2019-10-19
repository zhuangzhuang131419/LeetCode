package Q79;

/**
 * Given a 2D board and a word, find if the word exists in the grid.
 *
 * The word can be constructed from letters of sequentially adjacent cell,
 * where "adjacent" cells are those horizontally or vertically neighboring.
 * The same letter cell may not be used more than once.
 */

public class WordSearch {
    public boolean exist(char[][] board, String word) {
        if (board.length < 1) return false;
        int row = 0, col = 0;
        boolean[][] modified = new boolean[board.length][board[0].length];

        while (row < board.length && col < board[0].length) {
            if (backttrack(board, row, col, word, modified)) {
                return true;
            } else {
                col++;
                if (col == board[0].length) {
                    col %= board[0].length;
                    row++;
                }
            }
        }
        return false;
    }

    private boolean backttrack(char[][] board, int row, int col, String word, boolean[][] modified) {
        if (word.length() == 0) return true;
        if (row == board.length || row == -1) return false;
        if (col == board[0].length || col == -1) return false;
        if (board[row][col] != word.charAt(0)) return false;
        if (modified[row][col]) return false;
        boolean temp[][] = new boolean[modified.length][modified[0].length];
        for (int i = 0; i < temp.length; i++) {
            for (int j = 0; j < temp[0].length; j++) {
                temp[i][j] = modified[i][j];
            }
        }
        temp[row][col] = true;

        return backttrack(board, row + 1, col, word.substring(1), temp)
                || backttrack(board, row, col + 1, word.substring(1), temp)
                || backttrack(board, row, col - 1, word.substring(1), temp)
                || backttrack(board, row - 1, col, word.substring(1), temp);

    }
}
