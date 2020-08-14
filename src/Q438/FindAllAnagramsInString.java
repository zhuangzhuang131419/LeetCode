package Q438;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class FindAllAnagramsInString {

    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new ArrayList<>();
        HashMap<Character, Integer> need = new HashMap<>();
        HashMap<Character, Integer> window = new HashMap<>();

        for (int i = 0; i < p.length(); i++) {
            int count = 1;
            if (need.containsKey(p.charAt(i))) {
                count += need.get(p.charAt(i));
            }
            need.put(p.charAt(i), count);
        }

        int left = 0;
        int right = 0;
        int valid = 0;


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


            while (right - left >= p.length()) {
                char d = s.charAt(left);
                if (valid == need.size()) {
                    result.add(left);
                }
                left++;
                if (need.containsKey(d)) {
                    if (need.get(d).equals(window.get(d))) {
                        valid --;
                    }
                    window.put(d, window.get(d) - 1);
                }
            }
        }



        return result;
    }

}
