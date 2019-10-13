package Q33;

/**
 * Suppose an array sorted in ascending order is rotated at some pivot unknown to you beforehand.
 *
 * (i.e., [0,1,2,4,5,6,7] might become [4,5,6,7,0,1,2]).
 *
 * You are given a target value to search. If found in the array return its index, otherwise return -1.
 *
 * You may assume no duplicate exists in the array.
 *
 * Your algorithm's runtime complexity must be in the order of O(log n).
 */

public class SearchInRotatedSortedArray {
    public int search(int[] nums, int target) {
        if (nums.length == 0) return -1;
        return searchHelp(nums, 0, nums.length - 1, target);
    }

    private int searchHelp(int[] nums, int start, int end, int target) {
        if (start == end) {
            if (nums[start] == target) return start;
            return -1;
        }

        if (start + 1 == end) {
            if (nums[start] == target) return start;
            if (nums[end] == target) return end;
            return -1;
        }

        // split
        int splitIndex = (end + start) / 2;

        if (nums[splitIndex] == target) return splitIndex;


        if (nums[splitIndex] > target) {
            if (nums[splitIndex] > nums[start]) {
                int leftResult = searchHelp(nums, start, splitIndex, target);
                if (leftResult == -1) {
                    return searchHelp(nums, splitIndex, end, target);
                } else {
                    return leftResult;
                }
            } else {
                return searchHelp(nums, start, splitIndex, target);
            }
        } else {
            if (nums[splitIndex] > nums[start]) {
                return searchHelp(nums, splitIndex, end, target);
            } else {
                int leftResult = searchHelp(nums, start, splitIndex, target);
                if (leftResult == -1) {
                    return searchHelp(nums, splitIndex, end, target);
                }
                else {
                    return leftResult;
                }
            }

        }

    }
}
