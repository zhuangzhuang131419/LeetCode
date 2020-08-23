package Q123;

public class BestTimeToBuyAndSellStock {
    public int maxProfit(int[] prices) {
        int[][][] dp = new int[prices.length][3][2]; // [天][剩余][操作]

        for (int i = 1; i < dp.length; i++) {

            dp[i][2][0] = Math.max(dp[i - 1][2][0], dp[i - 1][2][1] + prices[i]);
            dp[i][2][1] = Math.max(dp[i - 1][2][1], dp[i - 1][1][0] - prices[i]);

            dp[i][1][0] = Math.max(dp[i - 1][1][0], dp[i - 1][1][1] + prices[i]);
            dp[i][1][1] = Math.max(dp[i - 1][1][1], - prices[i]);
        }

        return dp[dp.length - 1][2][0];
    }
}
