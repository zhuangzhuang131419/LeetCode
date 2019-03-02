package Q11;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class Q11Test {

    ContainerWithMostWater c = new ContainerWithMostWater();

    @Test
    public void maxArea() {
        assertEquals(49, c.maxArea(new int[]{1,8,6,2,5,4,8,3,7}));
    }
}