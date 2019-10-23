package Q42;

import java.util.ArrayList;
import java.util.Stack;

public class TrappingRainWater {
    public int trap(int[] height) {
        Stack<Integer> stack = new Stack<>();
        int left = height[0];
        int leftIndex = 0;
        int totalVolume = 0;
        for (int i = 0; i < height.length; i++) {
            if (height[i] < left) {
                stack.push(height[i]);
            } else {
                // compute the volume between leftIndex and i


                for (int j = leftIndex + 1; j < i; j++) {
                    totalVolume += Math.min(height[leftIndex], height[i]) - height[j];
                }


                stack.empty();
                stack.push(height[i]);
                left = height[i];
                leftIndex = i;
            }
        }

        if (!stack.isEmpty()) {

        }

        return totalVolume;

    }
}
