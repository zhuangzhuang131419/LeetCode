package Q643;

/**
 * Given an array consisting of n integers, find the contiguous subarray of given length k that has the maximum average value.
 * And you need to output the maximum average value.
 */

public class MaximumAverageSubarrayI {
    public double findMaxAverage(int[] nums, int k) {
        if (nums.length < k) { return 0.0; }
        double sum = 0;
        double maxAverage = 0;
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }
        maxAverage = sum / k;

        for (int i = 0; i < nums.length - k; i++) {
            sum = sum - nums[i] + nums[i + k];
            maxAverage = Math.max(maxAverage, sum / k);
        }
        return maxAverage;
    }
}
