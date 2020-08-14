package Q567;

import java.nio.channels.Channel;
import java.util.HashMap;

public class PermutationInString {
    public boolean checkInclusion(String s1, String s2) {
        HashMap<Character, Integer> need = new HashMap<>();
        HashMap<Character, Integer> window = new HashMap<>();

        for (int i = 0; i < s1.length(); i++) {
            int count = 1;
            if (need.containsKey(s1.charAt(i))) {
                count += need.get(s1.charAt(i));
            }
            need.put(s1.charAt(i), count);
        }

        int left = 0;
        int right = 0;
        int valid = 0;



        while (right < s2.length()) {
            char c = s2.charAt(right);

            right++;

            if (need.containsKey(c)) {
                int count = 1;
                if (window.containsKey(c)) {
                    count += window.get(c);
                }
                window.put(c, count);
                if (need.get(c).equals(window.get(c))) {
                    valid++;
                }
            }


            while (right - left >= s1.length()) {

                if (valid == need.size()) {
                    return true;
                }

                char d = s2.charAt(left);
                left++;

                if (need.containsKey(d)) {
                    if (window.get(d).equals(need.get(d))) {
                        valid--;
                    }
                    window.put(d, window.get(d) - 1);
                }
            }
        }

        return false;
    }

}
