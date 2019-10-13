package Q39;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum {
    List<List<Integer>> output = new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        backtrack(candidates, target, new ArrayList<>(), 0);

        return output;
    }

    private void backtrack(int[] candidates, int target, List<Integer> cur, int start) {
        if (target < 0) {
            return;
        }

        if (target == 0) {
            output.add(cur);
            return;
        }
        List<Integer> temp;
        for (int i = start; i < candidates.length; i++) {
            temp = new ArrayList<>(cur);
            temp.add(candidates[i]);
            backtrack(candidates, target - candidates[i], temp, i);
        }

    }
}
