package Q763;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class PartitionLabels {
    public List<Integer> partitionLabels(String S) {
        if (S == null || S.length() == 0) {
            return new LinkedList<>();
        }

        int i = 0;
        int j = S.length() - 1;

        int start = i;


        LinkedList<Integer> output = new LinkedList<>();

        while (i < S.length()) {
            while (j >= i) {
                if (S.charAt(j) == S.charAt(i)) {
                    // HashSet<Character> set = new HashSet<>();
                    // set.add(S.charAt(i));
                    i++;
                    while (i < j) {
                        // if (!set.contains(S.charAt(j))) {
                            for (int k = S.length() - 1; k > j; k--) {
                                if (S.charAt(k) == S.charAt(i)) {
                                    j = k;
                                    // set.add(S.charAt(i));
                                    break;
                                }
                            }
                        // }
                        i++;
                    }

                    output.add(j - start + 1);
                    start = j + 1;
                    break;
                } else {
                    j--;
                }
            }
            i = start;
            j = S.length() - 1;
        }
        return output;
    }
}
