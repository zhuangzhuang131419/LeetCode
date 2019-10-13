package Q31;

import org.junit.Test;

import static org.junit.Assert.*;

public class NextPermutationTest {

    NextPermutation np = new NextPermutation();

    @Test
    public void nextPermutation() {
        int[] nums = {4, 2, 0, 2, 3, 2, 0};
        np.nextPermutation(nums);
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
    }
}