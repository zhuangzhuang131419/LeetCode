package Q18;

import org.junit.Test;

import static org.junit.Assert.*;

public class Sum4Test {
    Sum4 sum = new Sum4();
    @Test
    public void fourSum() {
        int[] nums = {-1, 0, -5, -2, -2, -4, 0, 1, -2};
        System.out.println(sum.fourSum(nums, -9));

    }
}