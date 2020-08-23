package Q733;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FloodFillTest {

    @Test
    void floodFill() {
        FloodFill f = new FloodFill();
        f.floodFill(new int[][]{
                {0, 0, 0},
                {0, 1, 1},
        }, 1, 1, 1);
    }
}