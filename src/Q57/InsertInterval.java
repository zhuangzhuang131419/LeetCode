package Q57;

import java.util.ArrayList;
import java.util.List;

public class InsertInterval {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> res = new ArrayList<>();
        int i;
        for (i = 0; i < intervals.length; i++) {
            if (intervals[i][1] < newInterval[0]) res.add(intervals[i]);
                // current interval is strictly less than the newInterval, so just add the current interval
            else if (intervals[i][0] > newInterval[1]) { // there are no overlaps between the newInterval and the
                // rest of them, so we can just add the newInterval and then the rest of the intervals
                // sequentially and be done
                res.add(newInterval);
                for (; i < intervals.length; i++) {
                    res.add(intervals[i]);
                }
                return res.toArray(new int[res.size()][]);
            }
            else break; // there is some intervals that are overlapping and we have to handle them
        }

        for (; i < intervals.length; i++) {
            if (intervals[i][0] >= newInterval[0] && intervals[i][1] <= newInterval[1]) continue; // the
                // currentInterval is strictly overshadowed by the newInterval, so there is nothing we can do
                // with it
            else if (intervals[i][0] > newInterval[1]) { // there are no more overlapping between the current and
                // new intervals, so like above, add newInterval and then rest of the intervals sequentially and
                // then return them
                res.add(newInterval);
                for (; i < intervals.length; i++) {
                    res.add(intervals[i]);
                }
                return res.toArray(new int[res.size()][]);
            }
            else { // else merge the current interval and the new interval into a bigger interval
                newInterval[0] = Math.min(intervals[i][0], newInterval[0]);
                newInterval[1] = Math.max(intervals[i][1], newInterval[1]);
            }
        }

        res.add(newInterval); // if the newInterval is bigger than all of the other intervals, then have to add
        // it separately
        return res.toArray(new int[res.size()][]); // return the result
    }
}
