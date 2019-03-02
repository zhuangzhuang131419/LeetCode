package Q13;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RomanToIntegerTest {
    RomanToInteger rti;

    @Before
    public void setUp() throws Exception {
        rti = new RomanToInteger();
    }

    @Test
    public void romanToInt() {
        assertEquals(3, rti.romanToInt("III"));
        assertEquals(4, rti.romanToInt("IV"));
        assertEquals(9, rti.romanToInt("IX"));
    }
}