package Q15;

/**
 * Given an array nums of n integers, are there elements a, b, c in nums such that a + b + c = 0?
 * Find all unique triplets in the array which gives the sum of zero.
 */

import java.util.LinkedList;
import java.util.List;

public class Sum {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> l = new LinkedList<>();
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                for (int k = j + 1; k < nums.length; k++) {

                    if (nums[i] + nums[j] + nums[k] == 0) {
                        List<Integer> list = new LinkedList<>() {
                            @Override
                            public boolean equals(Object o) {
                                if (o instanceof List) {
                                    return (((List) o).get(0) == this.get(0) && ((List) o).get(1) == this.get(1) && ((List) o).get(2) == this.get(2))
                                            || (((List) o).get(0) == this.get(0) && ((List) o).get(1) == this.get(2) && ((List) o).get(2) == this.get(1))
                                            || (((List) o).get(0) == this.get(1) && ((List) o).get(1) == this.get(0) && ((List) o).get(2) == this.get(2))
                                            || (((List) o).get(0) == this.get(1) && ((List) o).get(1) == this.get(2) && ((List) o).get(2) == this.get(0))
                                            || (((List) o).get(0) == this.get(2) && ((List) o).get(1) == this.get(1) && ((List) o).get(2) == this.get(0))
                                            || (((List) o).get(0) == this.get(2) && ((List) o).get(1) == this.get(0) && ((List) o).get(2) == this.get(1));
                                }
                                return false;
                            }
                        };
                        list.add(nums[i]);
                        list.add(nums[j]);
                        list.add(nums[k]);
                        if (!l.contains(list)) {
                            l.add(list);
                        }
                    }
                }
            }
        }
        return l;
    }
}
