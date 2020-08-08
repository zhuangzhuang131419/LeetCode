package Q198;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HouseRobberTest {

    @Test
    void rob() {
        HouseRobber h = new HouseRobber();
        assertEquals(4, h.rob(new int[]{1, 2, 3, 1}));
    }
}