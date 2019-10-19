package Q128;

import org.junit.Test;

import static org.junit.Assert.*;

public class LongestConsecutiveSequenceTest {
    LongestConsecutiveSequence l = new LongestConsecutiveSequence();
    @Test
    public void longestConsecutive() {
        int[] a = {100, 4, 200, 1, 3, 2};
        assertEquals(4, l.longestConsecutive(a));
    }
}