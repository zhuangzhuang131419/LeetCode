package Q41;

import org.junit.Test;

import static org.junit.Assert.*;

public class FirstMissingPositiveTest {

    FirstMissingPositive f = new FirstMissingPositive();
    @Test
    public void firstMissingPositive() {
        int[] a = {1};
        assertEquals(2, f.firstMissingPositive(a));

    }
}