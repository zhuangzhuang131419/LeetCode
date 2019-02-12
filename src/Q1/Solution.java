package Q1;

import java.util.Hashtable;

public class Solution {
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[0];
    }

    public int[] twoSum1(int[] nums, int target) {
        Hashtable<Integer, Integer> hashtable = new Hashtable<>();
        for (int i = 0; i < nums.length; i++) {
            if (hashtable.containsKey(target - nums[i])) {
                int j = hashtable.get(target - nums[i]);
                return new int[] {j, i};
            }
            else {
                hashtable.put(nums[i], i);
            }
        }
        return null;
    }

    public static void  main(String[] args) {
        Solution s1 = new Solution();
        int[] nums = {2, 7, 8, 9};
        // int[] result = s1.twoSum(nums, 10);
        int[] result = s1.twoSum1(nums, 10);
        System.out.println(result[0] + " " + result[1]);
    }
}
