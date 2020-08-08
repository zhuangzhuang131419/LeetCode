package Q198;

/**
 * You are a professional robber planning to rob houses along a street. Each house has a certain amount of money stashed, the only constraint stopping you from robbing each of them is that adjacent houses have security system connected and it will automatically contact the police if two adjacent houses were broken into on the same night.
 *
 * Given a list of non-negative integers representing the amount of money of each house, determine the maximum amount of money you can rob tonight without alerting the police.
 */

public class HouseRobber {
    public int rob(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        if (nums.length == 1) {
            return nums[0];
        }
        int max1 = nums[nums.length - 1]; // i + 1
        int max2 = Math.max(nums[nums.length - 2], max1); // i + 2

        // dp[n] = max(nums[n] + dp[n +2], dp[n + 1])

        for (int i = nums.length - 3; i >= 0 ; i--) {
            int temp = max2;
            max2 = Math.max(nums[i] + max1, max2);
            max1 = temp;

        }
        return max2;
    }
}
