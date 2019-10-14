package Q47;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PermutationsII {
    List<List<Integer>> output = new ArrayList<>();
    public List<List<Integer>> permuteUnique(int[] nums) {
        Arrays.sort(nums);

        List<Integer> num = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            num.add(nums[i]);
        }
        backtrack(num, new ArrayList<>());
        return output;

    }

    private void backtrack(List<Integer> nums, List<Integer> result) {
        if (nums.isEmpty()) {
            output.add(result);
        }

        for (int i = 0; i < nums.size(); i++) {
            if (i > 0) {
                if (nums.get(i) == nums.get(i - 1))
                    continue;
            }
            List<Integer> temp = new ArrayList(nums);
            List<Integer> temp1 = new ArrayList<>(result);
            int r = temp.get(i);
            temp.remove(i);
            temp1.add(r);
            backtrack(temp, temp1);
            // result.remove(r);
        }
    }
}
