package Q120;

import java.util.List;

public class Triangle {
    public int minimumTotal(List<List<Integer>> triangle) {
        if (triangle.size() == 0) return triangle.get(0).get(0);
        int[][] dp = new int[triangle.size()][triangle.get(triangle.size() - 1).size()];
        for (int j = dp.length - 1; j >=0 ; j--) {
            for (int i = 0; i < j + 1; i++) {
                if (j == triangle.size() - 1) {
                    dp[j][i] = triangle.get(j).get(i);
                }
                else {
                    int temp = Math.min(dp[j + 1][i], dp[j + 1][i + 1]);
                    dp[j][i] = Math.min(dp[j + 1][i - 1], temp) + triangle.get(j).get(i);
                }

            }
        }

        return dp[0][0];
    }
}
