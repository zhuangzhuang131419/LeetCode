package Q31;

public class NextPermutation {
    public void nextPermutation(int[] nums) {
        if (nums.length == 0 || nums.length == 1) return;
        if (nums[nums.length - 1] > nums[nums.length - 2]) {
            int temp = nums[nums.length - 1];
            nums[nums.length - 1] = nums[nums.length - 2];
            nums[nums.length - 2] = temp;
            return;
        }

        int swapIndex = -1;
        for (int i = nums.length - 2; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) {
                swapIndex = i;
                break;
            }
        }

        if (swapIndex == -1) {
            // reverse whole
            int j = nums.length - 1;
            for (int i = 0; i < j; i++, j--) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            }
            return;
        }

        boolean swaped = false;
        for (int i = swapIndex + 1; i < nums.length; i++) {
            if (nums[i] <= nums[swapIndex]) {
                swaped = true;
                int temp = nums[swapIndex];
                nums[swapIndex] = nums[i - 1];
                nums[i - 1] = temp;
                break;
            }
        }

        if (!swaped) {
            int temp = nums[swapIndex];
            nums[swapIndex] = nums[nums.length - 1];
            nums[nums.length - 1] = temp;
        }

        // reverse swapIndex+1
        int j = nums.length - 1;
        for (int i = swapIndex + 1; i < j; i++, j--) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }
    }
}
