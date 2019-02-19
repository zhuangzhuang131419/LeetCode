package Q10;

public class RegularExpressionMatchingDynamic {

    public boolean isMatch(String s, String p) {
        boolean memo[][] = new boolean[s.length() + 1][p.length() + 1];
        for (int i = s.length(); i >= 0; i--) {
            for (int j = p.length(); j >= 0; j--) {
                if (i == s.length() && j == p.length()) {
                    memo[i][j] = true;
                }
                else if (i == s.length()) {
                    if (p.charAt(j) == '*') {
                        continue;
                    }
                    else {
                        if (j + 1 < p.length()) {
                            if (p.charAt(j + 1) == '*') {
                                memo[i][j] = memo[i][j + 2];
                            } else {
                                memo[i][j] = false;
                            }
                        }
                        else {
                            memo[i][j] = false;
                        }
                    }
                }
                else if (j == p.length()) {
                    memo[i][j] = false;
                }
                else if (p.charAt(j) == '*') {
                    continue;
                }
                else if (s.charAt(i) == p.charAt(j) || p.charAt(j) == '.') {
                    if (j + 1 < p.length()) {
                        if (p.charAt(j + 1) == '*') {
                            memo[i][j] = memo[i + 1][j + 2] || memo[i][j + 2] || memo[i + 1][j];
                        } else {
                            memo[i][j] = memo[i + 1][j + 1];
                        }
                    }
                    else {
                        memo[i][j] = memo[i + 1][j + 1];
                    }
                }
                else if (s.charAt(i) != p.charAt(j)) {

                    if (j + 1 < p.length() && p.charAt(j + 1) == '*') {
                        memo[i][j] = memo[i][j + 2];
                    }
                    else {
                        memo[i][j] = false;
                    }
                }
            }
        }
        return memo[0][0];
    }




    /*
    Result[][] memo;

    public boolean isMatch(String text, String pattern) {
        memo = new Result[text.length() + 1][pattern.length() + 1];
        return dp(0, 0, text, pattern);
    }

    public boolean dp(int i, int j, String text, String pattern) {
        if (memo[i][j] != null) {
            return memo[i][j] == Result.TRUE;
        }
        boolean ans;
        if (j == pattern.length()){
            ans = i == text.length();
        } else{
            boolean first_match = (i < text.length() &&
                    (pattern.charAt(j) == text.charAt(i) ||
                            pattern.charAt(j) == '.'));

            if (j + 1 < pattern.length() && pattern.charAt(j+1) == '*'){
                ans = (dp(i, j+2, text, pattern) ||
                        first_match && dp(i+1, j, text, pattern));
            } else {
                ans = first_match && dp(i+1, j+1, text, pattern);
            }
        }
        memo[i][j] = ans ? Result.TRUE : Result.FALSE;
        return ans;
    }
    */
}
