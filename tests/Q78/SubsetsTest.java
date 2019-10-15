package Q78;

import org.junit.Test;

import static org.junit.Assert.*;

public class SubsetsTest {
    Subsets s = new Subsets();
    @Test
    public void subsets() {
        int[] a = {2, 3};
        System.out.println(s.subsets(a));
    }
}