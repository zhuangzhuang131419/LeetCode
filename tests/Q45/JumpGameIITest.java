package Q45;

import org.junit.Test;

import static org.junit.Assert.*;

public class JumpGameIITest {
    JumpGameII j = new JumpGameII();
    @Test
    public void jump() {
        int[] a = {2,3,1,1,4};
        assertEquals(2, j.jump(a));
    }
}