package Q121;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BestTimeToBuyAndSellStockTest {

    @Test
    void maxProfit() {
        BestTimeToBuyAndSellStock b = new BestTimeToBuyAndSellStock();
        assertEquals(5, b.maxProfit(new int[]{7, 1, 5, 3, 6, 4}));
    }
}