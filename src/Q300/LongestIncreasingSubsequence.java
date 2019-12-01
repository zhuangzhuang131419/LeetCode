package Q300;

/**
 * Given an unsorted array of integers, find the length of longest increasing subsequence.
 */

public class LongestIncreasingSubsequence {
    public int lengthOfLIS(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int[] longest = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            longest[i] = 1;
        }
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j <= i; j++) {
                if (nums[j] < nums[i]) {
                    longest[i] = Math.max(longest[j] + 1, longest[i]);
                }
            }
        }

        int l = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            l = Math.max(l, longest[i]);
        }

        return l;
    }

}
