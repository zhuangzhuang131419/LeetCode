package Q96;


/**
 * Given n, how many structurally unique BST's (binary search trees) that store values 1 ... n?
 */

public class UniqueBinarySearchTrees {
    public int numTrees(int n) {

        int[] dp = new int[n + 1];

        dp[0] = 1;
        dp[1] = 1;

        for (int i = 2; i <= n; i++) {

            for (int j = 1; j <= i; j++) {
                dp[i] += dp[j - 1] * dp[i - j];
            }
        }
        return dp[n];
        
    }

}
