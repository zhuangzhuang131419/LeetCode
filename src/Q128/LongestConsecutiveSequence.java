package Q128;

import java.util.Arrays;

/**
 * Given an unsorted array of integers, find the length of the longest consecutive elements sequence.
 */


public class LongestConsecutiveSequence {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) return 0;
        if (nums.length == 1) return 1;
        Arrays.sort(nums);
        int logest = 1;
        int curLength = 1;
        int start = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            if (i > 0 && nums[i] == nums[i - 1] + 1) {
                curLength++;
                if (curLength > logest) {
                    logest = curLength;
                }
            } else {
                curLength = 1;
            }
        }
        return logest;
    }
}
