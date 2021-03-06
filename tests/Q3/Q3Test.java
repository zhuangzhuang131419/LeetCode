package Q3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Q3Test {

    @Test
    void lengthOfLongestSubstring() {
        String str = "abcabcbb";
        String str1 = "bbbb";
        Q3 s = new Q3();
        assertEquals(3, s.lengthOfLongestSubstring("abcabcbb"));
        assertEquals(1, s.lengthOfLongestSubstring("bbbb"));
        assertEquals(2, s.lengthOfLongestSubstring("pwwk"));
        assertEquals(3, s.lengthOfLongestSubstring("pwwkew"));
    }
}