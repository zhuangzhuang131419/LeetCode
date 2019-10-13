package Q26;

import org.junit.Test;

import static org.junit.Assert.*;

public class RemoveDuplicatesFromSortedArrayTest {

    RemoveDuplicatesFromSortedArray rdfs = new RemoveDuplicatesFromSortedArray();

    @Test
    public void removeDuplicates() {
        int[] arr = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int[] arr1 = {1, 1};
//        assertEquals(5, rdfs.removeDuplicates(arr));
        assertEquals(1, rdfs.removeDuplicates(arr1));

    }
}