package Q32;

import java.util.Stack;

/**
 * Given a string containing just the characters '(' and ')',
 * find the length of the longest valid (well-formed) parentheses substring.
 */

public class LongestValidParentheses {
    public int longestValidParentheses(String s) {
        Stack<Character> stack = new Stack<>();
        int validLength = 0;
        int maxValid = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                stack.push(s.charAt(i));
            } else {
                if (!stack.isEmpty() && stack.peek() == '(') {
                    stack.pop();
                    validLength += 2;
                }
            }
        }
        return maxValid;
    }

}
