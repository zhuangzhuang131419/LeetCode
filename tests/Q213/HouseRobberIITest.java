package Q213;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HouseRobberIITest {

    @Test
    void rob() {
        HouseRobberII h = new HouseRobberII();
//        assertEquals(4, h.rob(new int[]{1, 2, 3, 1}));
        assertEquals(11, h.rob(new int[]{2, 7, 9, 3, 1}));
    }
}