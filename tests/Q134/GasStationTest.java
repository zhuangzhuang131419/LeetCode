package Q134;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GasStationTest {
    GasStation g = new GasStation();
    @Test
    void canCompleteCircuit() {
        int[] a = {1,2,3,4,5};
        int[] b = {3,4,5,1,2};
        assertEquals(3, g.canCompleteCircuit(a, b));

    }
}