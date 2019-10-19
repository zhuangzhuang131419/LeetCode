package Q136;

import java.util.HashSet;
import java.util.Hashtable;
import java.util.Map;

public class SingleNumber {
    public int singleNumber(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i])) {
                set.remove(nums[i]);
            } else {
                set.add(nums[i]);
            }
        }
        return (int)set.toArray()[0];
    }
}
