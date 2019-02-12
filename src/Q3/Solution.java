package Q3;

/**
 * Given a string, find the length of the longest substring without repeating characters.
 */

public class Solution {
    public int lengthOfLongestSubstring(String s) {
        int[][] memo = new int[s.length()][s.length()];

        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {
                if (i == j) {
                    memo[i][j] = 1;
                }else if (s.substring(i, j).contains(s.substring(j, j + 1))){
                    memo[i][j] = memo[i][j - 1];
                }
                else {
                    memo[i][j] = memo[i][j - 1] + 1;
                }

            }
        }
        return memo[0][s.length() - 1];
    }

    public static void main(String[] args) {

    }
}
