package Q208;

import java.nio.channels.Channel;
import java.util.ArrayList;
import java.util.HashMap;

/**
 * Implement a trie with insert, search, and startsWith methods.
 *
 * Example:
 *
 * Trie trie = new Trie();
 *
 * trie.insert("apple");
 * trie.search("apple");   // returns true
 * trie.search("app");     // returns false
 * trie.startsWith("app"); // returns true
 * trie.insert("app");
 * trie.search("app");     // returns true
 */

public class Trie {

    HashMap<Character, Trie> alphabet;
    boolean isWord = false;

    /** Initialize your data structure here. */
    public Trie() {
        alphabet = new HashMap();
    }

    /** Inserts a word into the trie. */
    public void insert(String word) {
        if (word.length() == 0) {
            isWord = true;
            return;
        }
        Trie t;
        if (alphabet.containsKey(word.charAt(0))) {
            t = alphabet.get(word.charAt(0));
        } else {
            t = new Trie();
            alphabet.put(word.charAt(0), t);
        }
        t.insert(word.substring(1));
    }

    /** Returns if the word is in the trie. */
    public boolean search(String word) {
        if (word.length() == 0) {
            return isWord;
        }

        Trie t;
        if (alphabet.containsKey(word.charAt(0))) {
            t = alphabet.get(word.charAt(0));
            return t.search(word.substring(1));
        } else {
            return false;
        }
    }

    /** Returns if there is any word in the trie that starts with the given prefix. */
    public boolean startsWith(String prefix) {
        if (prefix.length() == 0) {
            return true;
        }

        Trie t;
        if (alphabet.containsKey(prefix.charAt(0))) {
            t = alphabet.get(prefix.charAt(0));
            return t.startsWith(prefix.substring(1));
        } else {
            return false;
        }
    }
}
