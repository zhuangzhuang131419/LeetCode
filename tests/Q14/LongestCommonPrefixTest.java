package Q14;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class LongestCommonPrefixTest {
    LongestCommonPrefix lcp;

    @Before
    public void setUp() throws Exception {
        lcp = new LongestCommonPrefix();
    }

    @Test
    public void longestCommonPrefix() {
        assertEquals("fl", lcp.longestCommonPrefix(new String[]{
                "flower",
                "flow",
                "flight"
        }));
        assertEquals("", lcp.longestCommonPrefix(new String[]{
                "dog",
                "racecar",
                "car"
        }));
    }
}