package Q215;

import java.util.Comparator;
import java.util.PriorityQueue;

public class KthLargestElementinanArray {
    public int findKthLargest(int[] nums, int k) {

        Comparator<Integer> c = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        };

        PriorityQueue<Integer> p = new PriorityQueue<>(c);
        for (int i = 0; i < nums.length; i++) {
            p.add(nums[i]);
        }



        int temp = 0;
        for (int i = 0; i < k; i++) {
            temp = p.poll();
        }

        return temp;
    }
}
