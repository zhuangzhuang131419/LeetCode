package Q33;

import org.junit.Test;

import static org.junit.Assert.*;

public class SearchInRotatedSortedArrayTest {

    SearchInRotatedSortedArray srsa = new SearchInRotatedSortedArray();

    @Test
    public void search() {
        int[] a1 = {4, 5, 6, 7, 0, 1, 2};
        assertEquals(-1, srsa.search(a1, 3));
//        int[] a2 = {7, 0, 1, 2};
//        assertEquals(0, srsa.search(a2, 7));
    }
}