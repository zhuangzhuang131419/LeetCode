package Q33;

import java.util.Arrays;

public class SearchInRotatedSortedArrayV2 {

    public static void main(String[] args) {
        SearchInRotatedSortedArrayV2 s = new SearchInRotatedSortedArrayV2();
        System.out.println(Arrays.toString(s.search(new int[]{3, 5, 6, 1, 2}, 1)));
    }

    public int[] search(int[] nums, int target) {
        if (nums.length == 0) return null;

        int left = 0;
        int right = nums.length - 1;

        while (left + 1 < right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                return new int[]{mid};
            } else if (nums[mid] < nums[right]) {
                if (nums[mid] > target && target < nums[right]) {
                    left = mid;
                } else {
                    right = mid;
                }
            } else if (nums[mid] > nums[left]) {
                if (nums[mid] > target && target > nums[left]) {
                    right = mid;
                } else {
                    left = mid;
                }
            }
        }

        return new int[]{left, right};

    }
}
