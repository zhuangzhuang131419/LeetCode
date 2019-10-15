package Q60;

import org.junit.Test;

import static org.junit.Assert.*;

public class PermutationSequenceTest {
    PermutationSequence p = new PermutationSequence();
    @Test
    public void getPermutation() {
        assertEquals("213", p.getPermutation(3, 3));
    }
}