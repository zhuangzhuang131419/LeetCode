package Q20;

import org.junit.Test;

import static org.junit.Assert.*;

public class ValidParenthesesTest {
    ValidParentheses v = new ValidParentheses();
    @Test
    public void isValid() {
        assertTrue(v.isValid("()"));
//        System.out.println(v.isValid("()"));
        assertTrue(v.isValid("()[]{}"));
        assertFalse(v.isValid("([)]"));

    }
}