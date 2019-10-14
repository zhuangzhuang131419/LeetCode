package Q44;

import org.junit.Test;

import static org.junit.Assert.*;

public class WildcardMatchingTest {
    WildcardMatching w = new WildcardMatching();
    @Test
    public void isMatch() {
        assertTrue(w.isMatch("adceb", "a*b"));
    }
}