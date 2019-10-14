package Q46;

import org.junit.Test;

import static org.junit.Assert.*;

public class PermutationsTest {

    Permutations p = new Permutations();
    @Test
    public void permute() {
        int[] a = {1,2,3};
        System.out.println(p.permute(a));
    }
}