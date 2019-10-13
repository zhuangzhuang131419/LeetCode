package Q40;

import java.util.*;

public class CombinationSumII {
    List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        backtrack(candidates, new ArrayList<Integer>(), 0 , 0, target);
        return res;
    }

    public void backtrack(int[] nums, ArrayList<Integer> sub, int sum, int start, int target){
        if(sum==target){
            res.add(new ArrayList(sub));
            return;
        }
        else if(sum>target){
            return;
        }
        else{
            for(int i = start; i<nums.length; i++){
                sub.add(nums[i]);
                backtrack(nums, sub, sum+nums[i], i+1, target);
                while(i<nums.length-1&&nums[i]==nums[i+1]) i++;
                sub.remove(sub.size()-1);
                if(sum+nums[i]>=target)
                    break;
            }
        }
    }
}
