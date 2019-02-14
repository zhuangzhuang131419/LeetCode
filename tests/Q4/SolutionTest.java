package Q4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void findMedianSortedArrays() {
        Solution s = new Solution();

        assertEquals(2.0f, s.findMedianSortedArrays(new int[]{1, 3}, new int[]{2}));
    }
}