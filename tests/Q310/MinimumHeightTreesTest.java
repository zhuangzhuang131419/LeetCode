package Q310;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinimumHeightTreesTest {
    MinimumHeightTrees m = new MinimumHeightTrees();
    @Test
    void findMinHeightTrees() {
        int[][] nums = {
                {1, 0},
                {1, 2},
                {1, 3}
        };

        m.findMinHeightTrees(4, nums);


    }
}