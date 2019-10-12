package Q18;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sum4 {

    List<List<Integer>> output = new ArrayList<>();

    public List<List<Integer>> fourSum(int[] nums, int target) {
        if (nums.length < 4) return output;
        Arrays.sort(nums);
        int sumMin = nums[0] + nums[1] + nums[2] + nums[3];
        int sumMax = nums[nums.length - 1] + nums[nums.length - 2] + nums[nums.length - 3] + nums[nums.length - 4];

        if (sumMin > target) return output;
        if (sumMax < target) return output;

        for (int i = 0; i < nums.length - 3; i++) {
            if (i > 0)
                while (i < nums.length - 3 && nums[i - 1] == nums[i])
                    i++; // to exclude duplicates
            for (int j = i + 1; j < nums.length - 2; j++) {
                if (j > i + 1)
                    while (j < nums.length - 2 && nums[j - 1] == nums[j])
                        j++; // to exclude duplicates

                int start = j + 1;
                int end = nums.length - 1;
                while (start < end) {
                    int sum = nums[i] + nums[j] + nums[start] + nums[end];
                    if (sum == target) {
                        List<Integer> answer = new ArrayList<>();
                        answer.add(nums[i]);
                        answer.add(nums[j]);
                        answer.add(nums[start]);
                        answer.add(nums[end]);
                        output.add(answer);
                        start++;
                        end--;
                        while (start < end && nums[start] == nums[start - 1]) {
                            start++;
                        }
                        while (start < end && nums[end] == nums[end + 1]) {
                            end--;
                        }
                    } else if (sum < target) {
                        start++;
                        while (start < end && nums[start] == nums[start - 1]) {
                            start++;
                        }
                    } else {
                        end--;
                        while (start < end && nums[end] == nums[end + 1]) {
                            end--;
                        }

                    }
                }

            }

        }
        return output;
    }

}
