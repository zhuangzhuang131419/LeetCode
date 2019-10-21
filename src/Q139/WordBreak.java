package Q139;

import java.util.HashSet;
import java.util.List;

/**
 * Given a non-empty string s and a dictionary wordDict containing a list of non-empty words,
 * determine if s can be segmented into a space-separated sequence of one or more dictionary words.
 */

public class WordBreak {
    /*
    boolean[] marked;
    public boolean wordBreak(String s, List<String> wordDict) {
        marked = new boolean[s.length()];
        return wordBreak(s, wordDict, 0);
    }
    public boolean wordBreak(String s, List<String> wordDict, int start) {
        if (start >= s.length()) return true;
        if (marked[start]) return false;
        for (String word: wordDict) {
            if (s.startsWith(word, start)) {
                if (wordBreak(s, wordDict, start + word.length())) return true;
                marked[start] = true;
            }
        }
        return false;
    }
     */


    public boolean wordBreak(String s, List<String> wordDict) {
        if (wordDict.isEmpty()) return false;
        HashSet<String> dic = new HashSet<>();
        for (String word: wordDict) {
            dic.add(word);
        }


        boolean dp[][] = new boolean[s.length()][s.length()];
        // dp[i][j] indicate s.substring(i, j) can be word break or not

        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j + i < s.length(); j++) {
                if (dic.contains(s.substring(j, j + i + 1))) {
                    dp[j][i + j] = true;
                } else {
                    for (int k = 0; k < i; k++) {
                        if (dp[j][j + k] && dp[j + k + 1][i + j]) {
                            dp[j][i + j] = true;
                            break;
                        }
                    }
                }
            }
        }

        return dp[0][s.length() - 1];

    }
}
