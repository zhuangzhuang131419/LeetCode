package Q55;

public class JumpGame {
    public boolean canJump(int[] nums) {
        int[] dp = new int[nums.length];


        dp[nums.length - 1] = nums.length - 1;
        for (int i = nums.length - 2; i >= 0; i--) {
            dp[i] = i;
            for (int j = 0; j <= nums[i]; j++) {
                if (i + j < nums.length) {
                    dp[i] = Math.max(dp[i], dp[i + j]);
                }
            }
        }
        return dp[0] == nums.length - 1;
    }

}
