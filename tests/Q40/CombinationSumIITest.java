package Q40;

import org.junit.Test;

import static org.junit.Assert.*;

public class CombinationSumIITest {

    CombinationSumII c = new CombinationSumII();

    @Test
    public void combinationSum2() {
        int[] a = {2, 5, 2, 1, 2};
        System.out.println(c.combinationSum2(a, 5));
    }
}