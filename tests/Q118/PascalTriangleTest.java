package Q118;

import org.junit.Test;

import static org.junit.Assert.*;

public class PascalTriangleTest {

    PascalTriangle p = new PascalTriangle();
    @Test
    public void generate() {
        System.out.println(p.generate(5));
    }
}