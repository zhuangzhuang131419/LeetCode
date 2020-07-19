package Q518;

/**
 * You are given coins of different denominations and a total amount of money.
 * Write a function to compute the number of combinations that make up that amount. You may assume that you have infinite number of each kind of coin.
 */

public class CoinChange {
    public int change(int amount, int[] coins) {
        if (coins == null) {
            return 0;
        }

        int[] dp = new int[amount + 1];
        dp[0] = 1;

        for (int i = 0; i < coins.length; i++) {
            for (int j = 0; j <= amount; j++) {
                if (j - coins[i] >= 0) {
                    dp[j] += dp[j - coins[i]];
                }
            }
        }

        return dp[amount];
    }
}
