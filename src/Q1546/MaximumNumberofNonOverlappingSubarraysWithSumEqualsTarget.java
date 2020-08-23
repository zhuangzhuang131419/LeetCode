package Q1546;

import java.util.ArrayList;

public class MaximumNumberofNonOverlappingSubarraysWithSumEqualsTarget {
    public int maxNonOverlapping(int[] nums, int target) {

        ArrayList<int[]> output = new ArrayList<>();
        int window = 0;

        for (int right = 0; right < nums.length; right++) {
            for (int left = 0; left <= right; left++) {
                window += nums[left];
                if (target == window) {
                    output.add(new int[]{left, right});
                }
            }
            window = 0;
        }



        // 筛选区间

        int max = 0;
        int start = 0;
        for (int i = 0; i < output.size(); i++) {
            start = output.get(i)[1];
            int count = 1;
            for (int j = i + 1; j < output.size(); j++) {
                    if (output.get(j)[0] > start) {
                        start = output.get(j)[1];
                        count++;
                    }
            }
            if (count > max) {
                max = count;
            }
        }

        return max;



    }


}
