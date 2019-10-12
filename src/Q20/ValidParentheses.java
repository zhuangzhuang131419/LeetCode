package Q20;

import java.util.ArrayList;
import java.util.Stack;

/**
 * Given a string containing just the characters '(', ')', '{', '}', '[' and ']',
 * determine if the input string is valid.
 *
 * An input string is valid if:
 *
 * Open brackets must be closed by the same type of brackets.
 * Open brackets must be closed in the correct order.
 * Note that an empty string is also considered valid.
 */

public class ValidParentheses {
    public boolean isValid(String s) {

        Stack<Character> stack = new Stack();

        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{') {
                stack.push(s.charAt(i));
            } else {
                if (stack.empty()) {
                    return false;
                }

                switch (s.charAt((i))) {
                    case ')':
                        if (stack.peek() == '(') {
                            stack.pop();
                        } else {
                            stack.push(s.charAt(i));
                        }
                        break;
                    case ']':
                        if (stack.peek() == '[') {
                            stack.pop();
                        } else {
                            stack.push(s.charAt(i));
                        }
                        break;
                    case '}':
                        if (stack.peek() == '{') {
                            stack.pop();
                        } else {
                            stack.push(s.charAt(i));
                        }
                        break;

                }
            }
        }

        return stack.empty();
    }
}
