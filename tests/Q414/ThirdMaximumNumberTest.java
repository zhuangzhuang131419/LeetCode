package Q414;

import org.junit.Test;

import static org.junit.Assert.*;

public class ThirdMaximumNumberTest {
    ThirdMaximumNumber t = new ThirdMaximumNumber();
    @Test
    public void thirdMax() {
        int[] nums = {1, 2, -2147483648};
        assertEquals(2, t.thirdMax(nums));

    }
}