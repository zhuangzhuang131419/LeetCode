package Q6;

/**
 * The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this:
 * (you may want to display this pattern in a fixed font for better legibility)
 *
 * P   A   H   N
 * A P L S I I G
 * Y   I   R
 *
 * And then read line by line: "PAHNAPLSIIGYIR"
 */

public class Solution {
    public String convert(String s, int numRows) {
        if (numRows == 1) {
            return s;
        }

        StringBuilder sb = new StringBuilder();
        int cycleLen = 2 * numRows - 2;
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j + i < s.length(); j += cycleLen) {
                sb.append(s.charAt(i + j));
                // skip the first and last row
                if (i != 0 && i != numRows - 1) {
                    if (cycleLen + j - i < s.length()) {
                        sb.append(s.charAt(cycleLen + j - i));
                    }
                }
            }
        }
        return sb.toString();
    }
}
