package Q11;

/**
 * Given n non-negative integers a1, a2, ..., an , where each represents a point at coordinate (i, ai).
 * n vertical lines are drawn such that the two endpoints of line i is at (i, ai) and (i, 0).
 * Find two lines, which together with x-axis forms a container, such that the container contains the most water.
 *
 * Note: You may not slant the container and n is at least 2.
 */

public class ContainerWithMostWater {
    public int maxArea(int[] height) {
        int memo[][] = new int[height.length][height.length];
        for (int gap = 0; gap < height.length; gap++) {
            for (int i = 0; i + gap < height.length; i++) {
                if (gap == 0) {
                    memo[i][i + gap] = 0;
                }
                else {
                    memo[i][i + gap] = Math.max(gap * Math.min(height[i], height[i + gap]), memo[i][i + gap - 1]);
                    if (i + 1 != height.length) {
                        memo[i][i + gap] = Math.max(memo[i][i + gap], memo[i + 1][i + gap]);
                    }
                }
            }
            
        }
        return memo[0][height.length - 1];
    }
}
