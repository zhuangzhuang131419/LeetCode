package Q5;

import java.util.Stack;

/**
 * Given a string s, find the longest palindromic substring in s. You may assume that the maximum length of s is 1000.
 */

public class Q5 {
    public String longestPalindrome(String s) {
        int maxLength = 0;
        int start = 0;
        int end = 1;
        if (s.length() == 0) {
            return "";
        }


        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j <= s.length(); j++) {
                if (isPalindrome(s.substring(i, j)) && j - i > maxLength) {
                    maxLength = j - i;
                    start = i;
                    end = j;
                }
            }
        }
        return s.substring(start, end);


    }

    public boolean isPalindrome(String s) {

        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i) == s.charAt(s.length() - i - 1)) {
                continue;
            } else {
                return false;
            }
        }

        return true;
    }
}
