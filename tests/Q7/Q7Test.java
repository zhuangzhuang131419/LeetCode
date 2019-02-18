package Q7;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Q7Test {

    Solution s = new Solution();


    @Test
    void reverse() {
        Solution s = new Solution();
        assertEquals(123, s.reverse(321));
        assertEquals(-123, s.reverse(-321));
        assertEquals(21, s.reverse(120));
        assertEquals(-105, s.reverse(-501));
        assertEquals(847412, s.reverse(214748));
        // assertEquals(8463847412, s.reverse(2147483648));

    }

}