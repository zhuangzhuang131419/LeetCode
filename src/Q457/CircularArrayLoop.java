package Q457;

/**
 * You are given a circular array nums of positive and negative integers.
 * If a number k at an index is positive, then move forward k steps.
 * Conversely, if it's negative (-k), move backward k steps.
 * Since the array is circular, you may assume that the last element's next element is the first element, and the first element's previous element is the last element.
 * <p>
 * Determine if there is a loop (or a cycle) in nums.
 * A cycle must start and end at the same index and the cycle's length > 1.
 * Furthermore, movements in a cycle must all follow a single direction.
 * In other words, a cycle must not consist of both forward and backward movements.
 */

public class CircularArrayLoop {
    public boolean circularArrayLoop(int[] nums) {
        if (nums.length == 0 || nums.length == 1) {
            return false;
        }

        int[] circularStep = new int[nums.length];


        for (int initIndex = 0; initIndex < nums.length; initIndex++) {
            int cur = initIndex;
            int circularLength = 0;

            while (cur != initIndex || circularLength == 0) {
                if (circularStep[cur] == 1) {
                    circularStep[initIndex] = -1;
                    break;
                } else if (circularStep[cur] == -1) {
                    circularStep[initIndex] = -1;
                    break;
                }

                cur += nums[cur];

                if (cur >= nums.length) {
                    cur -= nums.length;
                }

                if (cur < 0) {
                    cur += nums.length;
                }

                if (nums[cur] == nums.length) {
                    circularStep[initIndex] = -1;
                    break;
                }
                circularLength++;
            }
            if (circularStep[initIndex] != -1) {
                circularStep[initIndex] = circularLength;
            }

            if (circularLength > 1) {
                return true;
            }
        }

        return false;
    }
}
