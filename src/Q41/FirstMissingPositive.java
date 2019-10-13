package Q41;

public class FirstMissingPositive {
    public int firstMissingPositive(int[] nums) {

        int max = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
        }
        if (max == -1) {
            return 1;
        }


        // max > nums.length

        boolean[] bucket = new boolean[nums.length + 1];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0 && nums[i] <= nums.length) {
                bucket[nums[i]] = true;
            }
        }

        for (int i = 0; i < bucket.length - 1; i++) {
            if (!bucket[i + 1]) {
                return i + 1;
            }
        }
        return bucket.length;


    }
}
