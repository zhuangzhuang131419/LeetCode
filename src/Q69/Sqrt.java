package Q69;

public class Sqrt {
    public int mySqrt(int x) {
        if (x == 0) return 0;
        if (x == 1) return 1;
        int start = 0;
        int end = x;
        while (start <= end) {
            int mid = (end + start) >> 1;
            int v = x / mid;
            if (mid == v) {
                return mid;
            } else if (mid > v) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return end;
    }
}
