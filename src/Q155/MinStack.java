package Q155;

import javax.swing.*;
import java.util.Stack;

public class MinStack {
    /** initialize your data structure here. */
    int min = Integer.MAX_VALUE;
    Stack<Integer> s;
    public MinStack() {
       s = new Stack<>();
    }

    public void push(int x) {
        if (s.empty()) {
            min = x;
        }
        s.push(x - min);
        if (x < min) {
            min = x;
        }
    }

    public void pop() {
        if (s.peek() > 0) {
            s.pop();
        } else {
            min = min - s.peek();
            s.pop();
        }
    }

    public int top() {
        if (s.peek() > 0) {
            return s.peek() + min;
        } else {
            return min;
        }
    }

    public int getMin() {
        return min;
    }
}
