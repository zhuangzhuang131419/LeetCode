package Q78;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Subsets {
    public List<List<Integer>> subsets(int[] nums) {

        return subsetsHelp(nums, 0);
    }

    public List<List<Integer>> subsetsHelp(int[] nums, int start) {
        if (start == nums.length) return new ArrayList<>();
        List<List<Integer>> res = new ArrayList<>();
        if (start == nums.length - 1) {
            ArrayList<Integer> a = new ArrayList<>();
            a.add(nums[start]);
            res.add(a);
            res.add(new ArrayList<>());
            return res;
        }

        List<List<Integer>> l1 = subsetsHelp(nums, start + 1);

        for (List<Integer> l: l1) {
            List<Integer> temp = new ArrayList<>(l);
            res.add(l);
            temp.add(nums[start]);
            res.add(temp);
        }

        return res;


    }
}
