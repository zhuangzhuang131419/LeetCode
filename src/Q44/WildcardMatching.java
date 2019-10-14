package Q44;

/**
 * Given an input string (s) and a pattern (p), implement wildcard pattern matching with support for '?' and '*'.
 *
 * '?' Matches any single character.
 * '*' Matches any sequence of characters (including the empty sequence).
 * The matching should cover the entire input string (not partial).
 */

public class WildcardMatching {
    public boolean isMatch(String s, String p) {
        if (p == null || s == null) return false;
        boolean[][] dp = new boolean[s.length() + 1][p.length() + 1];
        // if (p.length() == 0 && s.length() == 0) return true;
        dp[0][0] = true;
        for (int i = 0; i < p.length(); i++) {
            if (p.charAt(i) == '*') {
                dp[0][i + 1] = dp[0][i];
            } else {
                dp[0][i + 1] = false;
            }
        }
        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < p.length(); j++) {
                switch (p.charAt(j)) {
                    case '?':
                        dp[i + 1][j + 1] = dp[i][j];
                        break;
                    case '*':
                        dp[i + 1][j + 1] = dp[i][j] || dp[i][j + 1] || dp[i + 1][j];
                        break;
                    default:
                        dp[i + 1][j + 1] = (s.charAt(i) == p.charAt(j)) && dp[i][j];
                }
            }
        }

        return dp[s.length()][p.length()];

//
//        boolean result = false;
//
//
//            switch (p.charAt(0)) {
//                case '*':
//                    return  isMatch(s.substring(1), p) || isMatch(s, p.substring(1)) || isMatch(s.substring(1), p.substring(1));
//                case '?':
//                    return isMatch(s.substring(1), p.substring(1));
//                    default:
//                        if (s.charAt(0) == p.charAt(0)) {
//                            return isMatch(s.substring(1), p.substring(1));
//                        } else {
//                            return false;
//                        }
//            }


    }

}
