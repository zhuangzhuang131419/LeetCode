package Q287;

import java.util.Arrays;

/**
 * Given an array nums containing n + 1 integers where each integer is between 1 and n (inclusive),
 * prove that at least one duplicate number must exist.
 * Assume that there is only one duplicate number, find the duplicate one.
 */

public class FindDuplicateNumber {
    public int findDuplicate(int[] nums) {
        Arrays.sort(nums);
        int mask = nums[0];

        for(int i = 1; i < nums.length; i++){
            mask ^= nums[i];
            if(mask == 0){
                return nums[i];
            }
            mask = nums[i];
        }
        return -1;
    }
}
