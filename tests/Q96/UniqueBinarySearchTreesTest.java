package Q96;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UniqueBinarySearchTreesTest {

    @Test
    void numTrees() {
        UniqueBinarySearchTrees u = new UniqueBinarySearchTrees();
        assertEquals( 2, u.numTrees(2));
        assertEquals( 5, u.numTrees(3));
    }
}