package Q90;

import java.util.*;

/**
 * Given a collection of integers that might contain duplicates, nums,
 * return all possible subsets (the power set).
 */

public class SubsetsII {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        // count the number of instances of each number

        Map<Integer, Integer> cnts = new HashMap<>();
        for (int num : nums) {
            int cnt = cnts.getOrDefault(num, 0);
            cnts.put(num, cnt + 1);
        }

        List<List<Integer>> res = new ArrayList<>();
        res.add(new ArrayList<>());

        for (int num : cnts.keySet()) {
            int cnt = cnts.get(num);

            int s = res.size();
            for (int i = 0; i < s; i++) {
                List<Integer> subset = res.get(i);

                // append [j] instances of [num] to each existing subset
                for (int j = 1; j <= cnt; j++) {
                    List<Integer> newSubset = new ArrayList<>(subset);
                    for (int k = 0; k < j; k++) newSubset.add(num);
                    res.add(newSubset);
                }
            }
        }
        return res;
    }
}
