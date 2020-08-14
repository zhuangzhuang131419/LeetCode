package Q438;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindAllAnagramsInStringTest {

    @Test
    void findAnagrams() {
        FindAllAnagramsInString f = new FindAllAnagramsInString();
        f.findAnagrams("cbaebabacd", "abc");
    }
}