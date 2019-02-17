package Q5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Q5Test {

    @Test
    void longestPalindrome() {
        Q5 q = new Q5();

        assertEquals("bab", q.longestPalindrome("babad"));
        assertEquals("bb", q.longestPalindrome("cbbd"));
        assertEquals("a", q.longestPalindrome("a"));
        assertEquals("bb", q.longestPalindrome("bb"));

    }

    @Test
    void isPalindrom() {
        Q5 q = new Q5();
        assertEquals(true, q.isPalindrome("bab"));
        assertEquals(true, q.isPalindrome("bbb"));
        assertEquals(false, q.isPalindrome("abb"));
        assertEquals(true, q.isPalindrome("bb"));
        assertEquals(true, q.isPalindrome("a"));
        assertEquals(true, q.isPalindrome(""));
    }
}