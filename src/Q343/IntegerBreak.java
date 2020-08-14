package Q343;

/**
 * Given a positive integer n, break it into the sum of at least two positive integers and maximize the product of those integers.
 * Return the maximum product you can get.
 */

public class IntegerBreak {
    public int integerBreak(int n) {
        if (n < 4) {
            if (n == 1) return 0;
            if (n == 2) return 1;
            if (n == 3) return 2;
        }
        int dp[] = new int[n + 1];

        for (int i = 0; i < n + 1; i++) {
            dp[i] = i;
        }

        // dp[n] = max(i * dp[n - i])

        for (int i = 2; i < n + 1; i++) {
            for (int j = 1; j < i; j++) {
                if (dp[i - j] * j > dp[i]) {
                    dp[i] = dp[i - j] * j;
                }
            }
        }
        return dp[n];
    }
}
