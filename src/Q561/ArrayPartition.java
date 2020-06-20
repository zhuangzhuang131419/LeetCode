package Q561;

import java.util.Arrays;

/**
 * Given an array of 2n integers,
 * your task is to group these integers into n pairs of integer, say (a1, b1), (a2, b2), ..., (an, bn) which makes sum of min(ai, bi) for all i from 1 to n as large as possible.
 */

public class ArrayPartition {
    public int arrayPairSum(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        if (nums.length == 1) {
            return nums[0];
        }


        Arrays.sort(nums);

        int[] pairSum = new int[nums.length / 2];

        for (int i = 0; i < nums.length; i = i + 2) {
            pairSum[i / 2] = nums[i];
        }

        int result = 0;
        for (int i = 0; i < pairSum.length; i++) {
            result += pairSum[i];
        }
        return result;
    }
}
