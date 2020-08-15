package Q42;

import java.util.ArrayList;
import java.util.Stack;

public class TrappingRainWater {

    public static void main(String[] args) {
        System.out.println(trap(new int[]{4,2,0,3,2,5}));
    }

    public static int trap(int[] height) {

        return trapHelp(height);
    }


    public static int trapHelp(int[] height) {
        int i = 0;
        int j = 0;

        while (i < height.length && height[i] <= 0) {
            i++;
        }
        j = i + 1;
        int subSum = 0;
        int total = 0;
        while (i < height.length) {
            if (j < height.length) {
                if (height[j] < height[i]) {
                    subSum += height[i] - height[j];
                    j++;
                } else if (height[j] >= height[i]) {
                    if (j - i > 1) {
                        total += subSum;
                        subSum = 0;
                    }
                    i = j;
                    j++;
                }
            } else {
                i++;
                j = i + 1;
                subSum = 0;
            }
        }
        return total;
    }
    public static int trapHelp1(int[] height) {
        int i = height.length - 1;
        int j = 0;
        while (i >= 0 && height[i] <= 0) {
            i--;
        }
        j = i - 1;
        int subSum = 0;
        int total = 0;
        while (i >= 0) {
            if (j >= 0) {
                if (height[j] < height[i]) {
                    subSum += height[i] - height[j];
                } else if (height[j] > height[i]) {
                    if (i - j > 1) {
                        total += subSum;
                    }
                    subSum = 0;
                    i = j;
                } else {
                    subSum = 0;
                    i = j;
                }
                j--;
            } else {
                i--;
                j = i - 1;
                subSum = 0;
            }
        }
        return total;
    }
}
