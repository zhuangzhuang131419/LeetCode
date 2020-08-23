package Q435;

import java.util.Arrays;
import java.util.Comparator;

public class NonOverlappingIntervals {
    public int eraseOverlapIntervals(int[][] intervals) {
        return intervals.length - intervalSchedule(intervals);
    }

    public int intervalSchedule(int[][] intervals) {
        if (intervals.length == 0) {
            return 0;
        }

        Arrays.sort(intervals, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[1] - o2[1];
            }
        });

        int count = 1;
        int xEnd = intervals[0][1];
        for (int[] interval: intervals) {
            int start = interval[0];
            if (start >= xEnd) {
                count++;
                xEnd = interval[1];
            }
        }
        return count;
    }
}
