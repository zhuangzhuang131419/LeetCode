package Q457;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircularArrayLoopTest {
    CircularArrayLoop c = new CircularArrayLoop();

    @Test
    void circularArrayLoop() {
        // assertTrue(c.circularArrayLoop(new int[]{2,-1,1,2,2}));
        assertFalse(c.circularArrayLoop(new int[]{-1,2}));
        assertFalse(c.circularArrayLoop(new int[]{-2,1,-1,-2,-2}));

    }
}