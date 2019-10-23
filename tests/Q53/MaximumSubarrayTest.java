package Q53;

import org.junit.Test;

import static org.junit.Assert.*;

public class MaximumSubarrayTest {
    MaximumSubarray m = new MaximumSubarray();
    @Test
    public void maxSubArray() {
        int[] a = {-2,1,-3,4,-1,2,1,-5,4};
        assertEquals(6, m.maxSubArray(a));
    }
}