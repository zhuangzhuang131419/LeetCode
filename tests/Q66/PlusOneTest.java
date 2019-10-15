package Q66;

import org.junit.Test;

import java.util.function.BooleanSupplier;

import static org.junit.Assert.*;

public class PlusOneTest {
    PlusOne p = new PlusOne();
    @Test
    public void plusOne() {
        int[] a = {1, 2, 3};
        System.out.println(p.plusOne(a));
    }
}