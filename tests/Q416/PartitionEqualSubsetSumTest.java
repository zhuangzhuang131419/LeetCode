package Q416;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PartitionEqualSubsetSumTest {

    @Test
    void canPartition() {

        PartitionEqualSubsetSum p = new PartitionEqualSubsetSum();
        assertTrue(p.canPartition(new int[]{1,5,11,5}));
    }
}