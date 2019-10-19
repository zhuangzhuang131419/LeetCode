package Q153;

import org.junit.Test;

import static org.junit.Assert.*;

public class FindMinimumInRotatedSortedArrayTest {
    FindMinimumInRotatedSortedArray f = new FindMinimumInRotatedSortedArray();
    @Test
    public void findMin() {
        int[] a = {2, 1};
        f.findMin(a);
    }
}