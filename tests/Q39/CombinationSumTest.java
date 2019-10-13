package Q39;

import org.junit.Test;

import static org.junit.Assert.*;

public class CombinationSumTest {

    CombinationSum cs = new CombinationSum();
    @Test
    public void combinationSum() {
        int[] a = {2, 5, 2, 1, 2};
        System.out.println(cs.combinationSum(a, 5));
    }
}