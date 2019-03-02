package Q14;

/**
 * Write a function to find the longest common prefix string amongst an array of strings.
 *
 * If there is no common prefix, return an empty string "".
 */
public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) {
            return "";
        }
        String minStr = strs[0];
        for (String s: strs) {
            if (s.length() < minStr.length()) {
                minStr = s;
            }
        }

        String result = longestCommonPrefix(minStr, strs[0]);
        for (String s : strs) {
            result = longestCommonPrefix(result, s);
        }
        return result;
    }

    private String longestCommonPrefix(String s1, String s2) {
        int i = 0;
        while (i < s1.length() && i < s2.length()) {
            if (s1.charAt(i) == s2.charAt(i)) {
                i++;
            } else {
                break;
            }
        }
        if (i == 0) {
            return "";
        }
        return s1.substring(0, i);
    }
}
