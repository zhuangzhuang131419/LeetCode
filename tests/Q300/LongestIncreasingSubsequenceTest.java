package Q300;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestIncreasingSubsequenceTest {

    LongestIncreasingSubsequence l = new LongestIncreasingSubsequence();
    @Test
    void lengthOfLIS() {
//        int[] nums = {10, 9, 2, 5, 3, 4};
        int[] nums = {1, 3, 6, 7, 9, 4, 10, 5, 6};
        assertEquals(6, l.lengthOfLIS(nums));
    }
}