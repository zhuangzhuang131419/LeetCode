package Q17;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LetterCombinationsOfPhoneNumber {
    List<String> output = new ArrayList<String>();
    Map<String, String> phone = new HashMap<>() {{
        put("2", "abc");
        put("3", "def");
        put("4", "ghi");
        put("5", "jkl");
        put("6", "mno");
        put("7", "pqrs");
        put("8", "tuv");
        put("9", "wxyz");
    }};


    public List<String> letterCombinations(String digits) {

        if (digits.length() != 0)
            backtrack("", digits);
        return output;
    }

    public void backtrack(String combination, String next_digits) {
        if (next_digits.length() == 0) {
            output.add(combination);
        } else {
            String digit = next_digits.substring(0, 1);
            String letters = phone.get(digit);

            for (int i = 0; i < letters.length(); i++) {
                String letter = letters.substring(i, i + 1);
                backtrack(combination + letter, next_digits.substring(1));
            }
        }



//        // if there is no more digits to check
//        if (next_digits.length() == 0) {
//            // the combination is done
//            output.add(combination);
//        }
//        // if there are still digits to check
//        else {
//            // iterate over all letters which map
//            // the next available digit
//            String digit = next_digits.substring(0, 1);
//            String letters = phone.get(digit);
//            for (int i = 0; i < letters.length(); i++) {
//                String letter = phone.get(digit).substring(i, i + 1);
//                // append the current letter to the combination
//                // and proceed to the next digits
//                backtrack(combination + letter, next_digits.substring(1));
//            }
//        }
    }
}
