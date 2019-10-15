package Q77;

import java.util.ArrayList;
import java.util.List;

/**
 * Given two integers n and k, return all possible combinations of k numbers out of 1 ... n.
 */

public class Combinations {
    List<List<Integer>> output = new ArrayList<>();
    public List<List<Integer>> combine(int n, int k) {

//        List<Integer> nums = new ArrayList<>();
//        for (int i = 0; i < n; i++) {
//            nums.add(i + 1);
//        }

        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = i + 1;
        }

        backtrack(k, nums, new ArrayList<>(), 0, n);
        return output;
    }

    private void backtrack(int k, int[] nums, List<Integer> result, int start, int n) {
        if (k == 0) {
            output.add(result);
            return;
        }

        if (start > n) return;

        for (int i = start; i < nums.length; i++) {
            List<Integer> temp = new ArrayList<>(result);
            temp.add(nums[i]);
            backtrack(k - 1, nums, temp, i + 1, n);
        }
        return;
    }
}
