package Q10;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;

public class Q10Test {
    private static RegularExpressionMatching rem;
    private String arg1;
    private String arg2;
    private boolean expectedValidation;

    /*
    public Q10Test(String arg1, String arg2, boolean expectedValidation) {
        this.arg1 = arg1;
        this.arg2 = arg2;
        this.expectedValidation = expectedValidation;
    }
    */

    public Q10Test() { }

    @Before
    public void setUp() throws Exception {
        rem = new RegularExpressionMatching();
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        Object[][] data = new Object[][] {
                {"aa", "a", false},
                {"aa", "a*", true},
                {"ab", ".*", true},
                {"aab", "c*a*b", true},
                {"mississippi", "mis*is*p*.", false}
        };
        return Arrays.asList(data);
    }

    @Test
    public void isMatch() {
        /*
        boolean result = rem.isMatch(this.arg1, this.arg2);
        assertEquals(arg1 + " " + arg2, result, this.expectedValidation);
        */
        RegularExpressionMatchingDynamic r = new RegularExpressionMatchingDynamic();
        /*
        assertTrue(r.isMatch("aa", "a*"));
        */
        assertEquals(false, r.isMatch("aa", "a"));

        assertEquals(true, r.isMatch("aab", "c*a*b"));
        assertFalse(r.isMatch("mississippi", "mis*is*p*"));
        assertTrue(r.isMatch("a", "ab*"));

        assertTrue(r.isMatch("bbba", ".*a*a"));

        assertTrue(r.isMatch("ab", ".*.."));
    }
}