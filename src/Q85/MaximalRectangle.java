package Q85;

/**
 * Given a 2D binary matrix filled with 0's and 1's,
 * find the largest rectangle containing only 1's and return its area.
 */

public class MaximalRectangle {
    public int maximalRectangle(char[][] matrix) {
        if (matrix.length == 0) {
            return 0;
        }
        int[][] dp = new int[matrix.length][matrix[0].length];
        if (matrix[0][0] == '1') {
            dp[0][0] = 1;
        }
        for (int i = 1; i < matrix.length; i++) {
            if (matrix[i - 1][0] == '1' && matrix[i][0] == '1') {
                dp[i][0] = dp[i - 1][0] + 1;
            }
        }

        for (int i = 1; i < matrix[0].length; i++) {
            if (matrix[0][i] == '1' && matrix[0][i] == '1') {
                dp[0][i] = dp[0][i - 1] + 1;
            }
        }


        for (int i = 1; i < matrix.length; i++) {
            for (int j = 1; j < matrix[0].length; j++) {



            }
        }

        return dp[matrix.length - 1][matrix[0].length - 1];
    }

}
