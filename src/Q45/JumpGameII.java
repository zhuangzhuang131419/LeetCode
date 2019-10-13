package Q45;

/**
 * Given an array of non-negative integers, you are initially positioned at the first index of the array.
 *
 * Each element in the array represents your maximum jump length at that position.
 *
 * Your goal is to reach the last index in the minimum number of jumps.
 */

public class JumpGameII {
    public int jump(int[] nums) {
        if (nums.length == 0) return 0;
        return jumpHelp(nums, nums.length - 1, 0);
    }

    private int jumpHelp(int[] nums, int end, int step) {
        if (end == 0) return step;
        for (int i = 0; i <= end; i++) {
            if (nums[i] + i >= end) {
                return jumpHelp(nums, i, step + 1);
            }
        }
        return -1;
    }

}
