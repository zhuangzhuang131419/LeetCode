package Q1143;

/**
 * Given two strings text1 and text2, return the length of their longest common subsequence.
 *
 * A subsequence of a string is a new string generated from the original string with some characters(can be none) deleted without changing the relative order of the remaining characters.
 * (eg, "ace" is a subsequence of "abcde" while "aec" is not). A common subsequence of two strings is a subsequence that is common to both strings.
 *
 * If there is no common subsequence, return 0.
 */

public class LongestCommonSubsequence {
    public int longestCommonSubsequence(String text1, String text2) {

        // dp[i][j] = if (text1[i] == text[j]) ? dp[i - 1][j - 1]: Max(dp[i][j - 1], dp[i - 1][j])

        int[][] dp = new int[text1.length() + 1][text2.length() + 1];

        // base case
        for (int i = 0; i < text1.length(); i++) {
           dp[i][0] = 0;
        }

        for (int i = 0; i < text2.length(); i++) {
            dp[0][i] = 0;
        }

        for (int i = 1; i <= text1.length(); i++) {
            for (int j = 1; j <= text2.length(); j++) {
                if (text1.charAt(i - 1) == text2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }


        return dp[text1.length()][text2.length()];
    }
}
