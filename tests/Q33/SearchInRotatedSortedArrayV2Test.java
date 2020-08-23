package Q33;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SearchInRotatedSortedArrayV2Test {

    @Test
    void search() {
        SearchInRotatedSortedArrayV2 s = new SearchInRotatedSortedArrayV2();
        assertArrayEquals(new int[]{0, 1}, s.search(new int[]{3, 5, 6, 1, 2}, 4));
    }
}