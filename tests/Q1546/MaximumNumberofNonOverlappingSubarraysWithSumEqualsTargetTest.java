package Q1546;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaximumNumberofNonOverlappingSubarraysWithSumEqualsTargetTest {

    @Test
    void maxNonOverlapping() {
        MaximumNumberofNonOverlappingSubarraysWithSumEqualsTarget m = new MaximumNumberofNonOverlappingSubarraysWithSumEqualsTarget();
        assertEquals(5, m.maxNonOverlapping(new int[]{-1,-2,8,-3,8,-5,5,-4,5,4,1}, 5));

    }
}