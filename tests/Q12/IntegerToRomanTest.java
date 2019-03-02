package Q12;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class IntegerToRomanTest {

    private IntegerToRoman itr;

    @Before
    public void setup() {
        itr = new IntegerToRoman();
    }

    @Test
    public void intToRoman() {
        assertEquals("III", itr.intToRoman(3));
        assertEquals("IV", itr.intToRoman(4));
        assertEquals("IX", itr.intToRoman(9));

    }
}