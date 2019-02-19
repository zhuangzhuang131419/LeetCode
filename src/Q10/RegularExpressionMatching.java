package Q10;

/**
 * Given an input string (s) and a pattern (p), implement regular expression matching with support for '.' and '*'.
 * <p>
 * '.' Matches any single character.
 * '*' Matches zero or more of the preceding element.
 * The matching should cover the entire input string (not partial).
 */

public class RegularExpressionMatching {
    public boolean isMatch(String s, String p) {
        if (s.length() == 0 && p.length() == 0) {
            return true;
        } else if (p.length() == 0) {
            return false;
        } else if (s.length() == 0) {
            if (p.length() > 1 && p.charAt(1) == '*') {
                return isMatch("", p.substring(2));
            }
            return false;
        }
        else if (p.charAt(0) == '.') {
            if (p.length() > 1) {
                if (p.charAt(1) == '*') {
                    return isMatch(s.substring(1), p.substring(2)) || isMatch(s.substring(1), p) || isMatch(s, p.substring(2));
                }
            }
            return isMatch(s.substring(1), p.substring(1));
        } else {
            if (p.charAt(0) != s.charAt(0)) {
                if (p.length() > 1 && p.charAt(1) == '*') {
                    return isMatch(s, p.substring(2));
                } else {
                    return false;
                }
            }
            else { // p.charAt(0) == s.charAt(0)
                if (p.length() > 1 && p.charAt(1) == '*') {
                    return isMatch(s.substring(1), p.substring(2)) || isMatch(s.substring(1), p) || isMatch(s, p.substring(2));
                }
                else {
                    return isMatch(s.substring(1), p.substring(1));
                }
            }
        }
    }
}
