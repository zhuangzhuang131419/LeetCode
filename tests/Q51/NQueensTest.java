package Q51;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NQueensTest {

    @Test
    void solveNQueens() {
        NQueens n = new NQueens();
        n.solveNQueens(4);
    }
}