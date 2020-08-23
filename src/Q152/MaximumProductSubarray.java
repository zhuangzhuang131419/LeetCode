package Q152;

/**
 * Given an integer array nums, find the contiguous subarray within an array (containing at least one number) which has the largest product.
 */

public class MaximumProductSubarray {
    public int maxProduct(int[] nums) {
        if (nums.length == 0) return 0;
        if (nums.length == 1) return nums[0];


        int cur = nums[0];
        int i = 0;
        int j = 1;

        while (i < nums.length) {



            i++;
        }
        return 0;


//        for (int i = 0; i < nums.length; i++) {
//            if (nums[i] < 0) {
//
//                int temp = cur;
//                cur *= nums[i];
//                for (int j = i + 1; j < nums.length; j++) {
//                    if (nums[j] < 0) {
//
//                        i = j;
//                        break;
//                    } else {
//                        temp *= cur;
//                    }
//                }
//            } else {
//                cur *= nums[i];
//            }
//        }



    }
}
