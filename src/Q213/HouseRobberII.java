package Q213;

/**
 * You are a professional robber planning to rob houses along a street.
 * Each house has a certain amount of money stashed. All houses at this place are arranged in a circle.
 * That means the first house is the neighbor of the last one.
 * Meanwhile, adjacent houses have security system connected and it will automatically contact the police if two adjacent houses were broken into on the same night.
 *
 * Given a list of non-negative integers representing the amount of money of each house, determine the maximum amount of money you can rob tonight without alerting the police.
 */

public class HouseRobberII {
    public int rob(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        if (nums.length == 1) {
            return nums[0];
        }
        return Math.max(robRange(nums, 0, nums.length - 2), robRange(nums, 1, nums.length- 1));
    }

    public int robRange(int[] nums, int start, int end) {
        if (end == start) {
            return nums[end];
        }
        int max2 = nums[end];
        int max1 = Math.max(nums[end - 1], max2);
        for (int i = end - 2; i >= start; i--) {
            int temp = max1;
            max1 = Math.max(nums[i] + max2, max1);
            max2 = temp;
        }
        return max1;
    }

}
