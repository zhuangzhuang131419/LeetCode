package Q34;

import org.junit.Test;

import static org.junit.Assert.*;

public class FindFirstLastPositionOfElementInSortedArrayTest {
    FindFirstLastPositionOfElementInSortedArray f = new FindFirstLastPositionOfElementInSortedArray();
    @Test
    public void searchRange() {
        int[] a1 = {1};
        assertEquals(-1, f.searchRange(a1, 0)[0]);
        assertEquals(-1, f.searchRange(a1, 0)[1]);

    }
}