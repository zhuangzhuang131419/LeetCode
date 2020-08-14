package Q76;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinimumWindowSubstringTest {

    @Test
    void minWindow() {
        MinimumWindowSubstring m = new MinimumWindowSubstring();
        assertEquals("BANC", m.minWindow("ADOBECODEBANC", "ABC"));
    }
}