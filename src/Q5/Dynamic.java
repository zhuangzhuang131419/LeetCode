package Q5;

public class Dynamic {
    public String longestPalindrome(String s) {

        if (s.length() == 0) {
            return "";
        }
        int start = 0, end = 0;
        boolean[][] dp = new boolean[s.length()][s.length()];

        for (int gap = 0; gap < s.length(); gap++) {
            for (int i = 0; i + gap < s.length(); i++) {
                if (gap == 0) { dp[i][i] = true; }
                else if (s.charAt(i) == s.charAt(i + gap)) {
                    if (gap == 1 || dp[i + 1][i + gap - 1]) {
                        dp[i][i + gap] = true;
                        start = i;
                        end = i + gap;
                    }
                }
            }
        }

        return s.substring(start, end + 1);
    }
}
