package Q343;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IntegerBreakTest {

    @Test
    void integerBreak() {
        IntegerBreak i = new IntegerBreak();
        assertEquals(12, i.integerBreak(7));
    }
}