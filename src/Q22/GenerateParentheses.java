package Q22;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class GenerateParentheses {
    List<String> output = new ArrayList<>();
    public List<String> generateParenthesis(int n) {

        if (n == 0) {
            return output;
        } else {
            backtrack("",0, 0, n);
        }

        return output;
    }

    private void backtrack(String combination, int open, int close, int n) {
        if (open + close == n * 2) {
            output.add(combination);
        } else {

            if (open < n) {
                backtrack(combination + "(", open + 1, close, n);
            }

            if (close < open) {
                backtrack(combination + ")", open, close + 1, n);
            }
        }
    }

}


