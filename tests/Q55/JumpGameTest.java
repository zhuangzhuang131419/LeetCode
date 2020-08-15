package Q55;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JumpGameTest {

    @Test
    void canJump() {
        JumpGame j = new JumpGame();
        assertTrue(j.canJump(new int[]{2,3,1,1,4}));

    }
}