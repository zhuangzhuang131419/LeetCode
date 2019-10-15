package Q60;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PermutationSequence {
    public String getPermutation(int n, int k) {
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = i + 1;
        }
        StringBuilder r = new StringBuilder();
        List<List<Integer>> res = permute(nums);
        List<Integer> l = permute(nums).get(k - 1);
        for (Integer i: l) {
            r.append(i);
        }
        return r.toString();
    }


    List<List<Integer>> output = new ArrayList<>();
    private List<List<Integer>> permute(int[] nums) {

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
