package Q9;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class Q9Test {
    private static Solution9 s9;
    private int arg;
    private boolean expectedValidation;

    public Q9Test(int arg, boolean expectedValidation) {
        this.arg = arg;
        this.expectedValidation = expectedValidation;
    }

    @Before
    public void setUp() throws Exception {
        s9 = new Solution9();
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        Object[][] data = new Object[][] {
                {121, true},
                {101, true},
                {-121, false},
                {10, false},
                {11, true}
        };
        return Arrays.asList(data);
    }



    @Test
    public void isPalindrome() {

        boolean result = s9.isPalindrome(this.arg);
        assertEquals(Integer.toString(this.arg), this.expectedValidation, result);
        /*
        for (Object[] dataTest: data()) {
            assertEquals(dataTest[1], s9.isPalindrome((int)dataTest[0]));
        }
        */
    }
}