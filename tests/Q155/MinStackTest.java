package Q155;

import org.junit.Test;

import static org.junit.Assert.*;

public class MinStackTest {
    MinStack m = new MinStack();
    @Test
    public void push() {
        m.push(2147483647);
        m.top();
        m.getMin();
        m.push(-2);
        assertEquals(-2, m.top());
    }
}