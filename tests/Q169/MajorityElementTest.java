package Q169;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MajorityElementTest {

    MajorityElement m = new MajorityElement();
    @Test
    void majorityElement() {
        int[] nums = {3, 3, 4};
        assertEquals(3, m.majorityElement(nums));
    }
}