package Q6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Q6Test {

    @Test
    void convert() {
        Solution s = new Solution();
        assertEquals("PAHNAPLSIIGYIR", s.convert("PAYPALISHIRING", 3));
        assertEquals("PINALSIGYAHRPI", s.convert("PAYPALISHIRING", 4));
    }
}