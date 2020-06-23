package Q208;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TrieTest {

    Trie obj;

    @BeforeEach
    void setUp() {
        obj = new Trie();
    }

    @Test
    void test() {
        obj.insert("apple");
        assertTrue(obj.search("apple"));
        assertFalse(obj.search("app"));
        assertTrue(obj.startsWith("app"));
        obj.insert("app");
        assertTrue(obj.search("app"));

    }

}