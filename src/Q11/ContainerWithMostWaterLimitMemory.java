package Q11;

import java.util.ArrayList;
import java.util.List;

public class ContainerWithMostWaterLimitMemory {
    public static int maxArea1(int[] height) {
        int result = 0;
        List<Integer> seq = new ArrayList<>();
        seq.add(0);
        for (int i = seq.size(); i < height.length; i++) {
            for (Integer idx : seq) {
                int area = (i - idx) * Math.min(height[i], height[idx]);
                if (area > result) result = area;
            }
            if (height[i] > height[seq.get(seq.size() - 1)]) {
                seq.add(i);
            }
        }
        return result;
    }
}
