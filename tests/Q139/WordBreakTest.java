package Q139;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class WordBreakTest {

    WordBreak w = new WordBreak();
    @Test
    public void wordBreak() {
        List<String> l = new ArrayList<>();
        l.add("l");
        l.add("e");
        assertTrue(w.wordBreak("le", l));

    }
}