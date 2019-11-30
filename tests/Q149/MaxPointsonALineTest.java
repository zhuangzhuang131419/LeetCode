package Q149;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaxPointsonALineTest {
    MaxPointsonALine m = new MaxPointsonALine();

    @Test
    void maxPoints() {
        // [[0,-12],[5,2],[2,5],[0,-5],[1,5],[2,-2],[5,-4],[3,4],[-2,4],[-1,4],[0,-5],[0,-8],[-2,-1],[0,-11],[0,-9]]
        // [0,9],[115,359],[-30,-102],[-150,-686],[-60,-248],[207,639],[92,289],[-105,-467]
        int[][] a = new int[][]{

                {0, 9},
                {115, 359},
                {-30, -102},
                {-150, -686},
                {-60, -248},
                {207, 639},
                {92, 289},
                {-105, -467},
                // {0, -11}
        };
        assertEquals(4, m.maxPoints(a));

    }
}