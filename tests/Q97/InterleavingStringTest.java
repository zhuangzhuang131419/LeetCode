package Q97;

import org.junit.Test;

import static org.junit.Assert.*;

public class InterleavingStringTest {
    InterleavingString i = new InterleavingString();
    @Test
    public void isInterleave() {
        assertTrue(i.isInterleave("aabcc", "dbbca", "aadbbcbcac"));
    }
}