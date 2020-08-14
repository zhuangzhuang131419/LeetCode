package Q76;

import java.nio.channels.Channel;
import java.util.HashMap;

public class MinimumWindowSubstring {
    public String minWindow(String s, String t) {
        HashMap<Character, Integer> need = new HashMap<>();
        HashMap<Character, Integer> window = new HashMap<>();
        int valid = 0;
        int minLength = Integer.MAX_VALUE;

        int start = 0;

        for (int i = 0; i < t.length(); i++) {
            int count = 1;
            if (need.containsKey(t.charAt(i))) {
                count += need.get(t.charAt(i));
            }
            need.put(t.charAt(i), count);
        }

        int left = 0;
        int right = 0;
        while (right < s.length()) {
            char c = s.charAt(right);

            right++;

            if (need.containsKey(c)) {
                int count = 1;
                if (window.containsKey(c)) {
                    count += window.get(c);
                }
                window.put(c, count);
                if (window.get(c).equals(need.get(c))) {
                    valid++;
                }
            }

            // 收缩左侧窗口
            while (valid == need.size()) {
                if (right - left < minLength) {
                    start = left;
                    minLength = right - left;
                }

                char d = s.charAt(left);

                if (need.containsKey(d)) {
                    if (window.get(d).equals(need.get(d))) {
                        valid--;
                    }
                    window.put(d, window.get(d) - 1);
                }
                left++;
            }
        }


        return minLength == Integer.MAX_VALUE ? "": s.substring(start, start + minLength);

    }
}

