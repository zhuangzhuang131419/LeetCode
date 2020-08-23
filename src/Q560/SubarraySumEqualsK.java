package Q560;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/**
 * Given an array of integers and an integer k, you need to find the total number of continuous subarrays whose sum equals to k.
 */

public class SubarraySumEqualsK {
    public int subarraySum(int[] nums, int k) {
//        Set<Integer> prefix = new HashSet<>();
        HashMap<Integer, Integer> prefix = new HashMap<>();
        int sum = 0;
        int count = 0;
        prefix.put(0, 1);
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (prefix.containsKey(sum - k)) {
                count += prefix.get(sum - k);
            }
            prefix.put(sum, prefix.getOrDefault(sum, 0) + 1);
        }


        return count;
    }
}
