package Q62;

public class UniquePath {

    int[][] dp;

    public int uniquePaths(int m, int n) {
        dp = new int[m + 1][n + 1];
        dp[1][1] = 1;
        return uniqueHelp(m ,n);
    }

    private int uniqueHelp(int m, int n) {
        if (m == 0 || n == 0) {
            return 0;
        }

        if (dp[m][n] != 0) {
            return dp[m][n];
        }

        if (dp[m - 1][n] == 0) {
            dp[m - 1][n] = uniqueHelp(m - 1, n);
        }

        if (dp[m][n - 1] == 0) {
            dp[m][n - 1] = uniqueHelp(m, n - 1);
        }
        dp[m][n] = dp[m - 1][n] + dp[m][n - 1];

        return dp[m][n];

    }
}
