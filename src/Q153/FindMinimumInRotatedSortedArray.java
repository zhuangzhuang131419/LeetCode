package Q153;

public class FindMinimumInRotatedSortedArray {
    public int findMin(int[] nums) {
        if (nums.length == 1) return nums[0];

        return helpFind(nums, 0, nums.length - 1);


    }

    private int helpFind(int[] nums, int left, int right) {
        if (left == right) return nums[left];
        if (left > right) return Integer.MAX_VALUE;
        if (left + 1 == right) return Math.min(nums[left], nums[right]);
        int mid = (left + right) >> 1;
        if (nums[mid] > nums[left]) {
            return Math.min(nums[left], helpFind(nums, mid + 1, right));
        } else {
            return Math.min(nums[mid], helpFind(nums, left, mid - 1));
        }
    }
}
