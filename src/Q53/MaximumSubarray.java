package Q53;

public class MaximumSubarray {
    public int maxSubArray(int[] nums) {
        if (nums.length == 0) return 0;
        int max = 0;
        int sum = 0;
        boolean allNegative = true;
        boolean first = true;
        for (int i = 0; i < nums.length; i++) {
            if (first && nums[i] < 0) {
                continue;
            }
            first = false;
            allNegative = false;
            if (sum + nums[i] > 0) {
                sum += nums[i];
            } else {
                sum = 0;
            }
            max = Math.max(max, sum);
        }

        if (allNegative) {
            max = Integer.MIN_VALUE;
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] > max) {
                    max = nums[i];
                }
            }
        }
        return max;
    }
}
