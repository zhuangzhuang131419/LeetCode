package Q209;

/**
 * Given an array of n positive integers and a positive integer s,
 * find the minimal length of a contiguous subarray of which the sum ≥ s. If there isn't one, return 0 instead.
 */

public class MinimumSizeSubarraySum {
    public int minSubArrayLen(int s, int[] nums) {
        int min = Integer.MAX_VALUE;
        if (nums.length == 0) return 0;
        int i = 0;
        int j = 0;
        int sum = nums[0];
        while (j < nums.length) {
            if (sum > s) {
                if (j - i + 1 < min) {
                    min = j - i + 1;
                    if (min == 1) {
                        return 1;
                    }
                }
                sum -= nums[i];
                i++;
            } else {
                j++;
                if (j < nums.length) {
                    sum += nums[j];
                }


            }
        }

        return min;

    }
}
