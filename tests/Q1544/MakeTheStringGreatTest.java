package Q1544;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MakeTheStringGreatTest {

    @Test
    void makeGood() {
        MakeTheStringGreat m = new MakeTheStringGreat();
        assertEquals("", m.makeGood("abBAcC"));
    }
}