package Q34;

public class FindFirstLastPositionOfElementInSortedArray {
    public int[] searchRange(int[] nums, int target) {
        if (nums.length == 0) return new int[]{-1, -1};
        return searchRangeHelp(nums, 0, nums.length - 1, target);
    }

    private int[] searchRangeHelp(int[] nums, int start, int end, int target) {
        if (start == end || nums[start] == nums[end]) {
            if (nums[start] == target) {
                return new int[]{start, end};
            } else {
                return new int[]{-1, -1};
            }
        }

        if (start + 1 == end) {
            if (nums[start] == target) {
                if (nums[end] == target) {
                    return new int[]{start, end};
                }
                else {
                    return new int[]{start, start};
                }
            }
            else if (nums[end] == target) {
                return new int[]{end, end};
            }
            else {
                return new int[]{-1, -1};
            }
        }

        int splitIndex = (start + end) / 2;

        if (nums[splitIndex] == target) {
            int s = splitIndex;
            int e = splitIndex;
            while (s >= start && nums[s] == target) {
                s--;
            }
            s++;

            while (e <= end && nums[e] == target) {
                e++;
            }
            e--;
            return new int[]{s, e};
        }

        if (nums[splitIndex] > target) {
            return searchRangeHelp(nums, start, splitIndex, target);
        }

        if (nums[splitIndex] < target) {
            return searchRangeHelp(nums, splitIndex, end, target);
        }

        return new int[]{-1, -1};
    }
}
