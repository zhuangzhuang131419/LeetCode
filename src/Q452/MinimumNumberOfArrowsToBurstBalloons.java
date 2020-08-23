package Q452;

import java.util.Arrays;
import java.util.Comparator;

public class MinimumNumberOfArrowsToBurstBalloons {
    public int findMinArrowShots(int[][] points) {
        if (points.length == 0) {
            return 0;
        }

        Arrays.sort(points, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[1] - o2[1];
            }
        });

        int count = 1;
        int xEnd = points[0][1];
        for (int[] interval: points) {
            int start = interval[0];
            if (start > xEnd) {
                count++;
                xEnd = interval[1];
            }
        }
        return count;
    }
}
