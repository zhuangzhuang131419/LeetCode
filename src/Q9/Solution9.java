package Q9;

/**
 * Determine whether an integer is a palindrome. An integer is a palindrome when it reads the same backward as forward.
 */

public class Solution9 {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        else if (x < 9) {
            return true;
        }
        else {
            return isPalindrome(Integer.toString(x));
        }
    }

    public boolean isPalindrome(String s) {
        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i) == s.charAt(s.length() - i - 1)) {
                continue;
            }
            else {
                return false;
            }
        }
        return true;
    }
}
