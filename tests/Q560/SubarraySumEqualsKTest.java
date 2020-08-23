package Q560;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SubarraySumEqualsKTest {

    @Test
    void subarraySum() {
        SubarraySumEqualsK s = new SubarraySumEqualsK();
        assertEquals(2, s.subarraySum(new int[]{1, 1, 1}, 2));
    }
}