package Q567;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PermutationInStringTest {

    @Test
    void checkInclusion() {
        PermutationInString p = new PermutationInString();
        p.checkInclusion("a", "ab");
    }
}