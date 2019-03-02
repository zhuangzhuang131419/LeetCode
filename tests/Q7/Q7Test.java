package Q7;

import junit.framework.TestCase;
import org.junit.Before;
import org.junit.jupiter.api.Test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import static org.junit.jupiter.api.Assertions.*;

class Q7Test {




    @Test
    void reverseTest() {
        Solution s = new Solution();
        assertEquals(123, s.reverse(321));


        // assertEquals(8463847412, s.reverse(2147483648));

    }

}