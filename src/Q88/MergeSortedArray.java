package Q88;

public class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] result = new int[m + n];
        int i = 0, j = 0, cur = 0;
        while (i < m || j < n) {
            if (i < m && j < n) {
                if (nums1[i] < nums2[j]) {
                    result[cur++] = nums1[i++];
                } else {
                    result[cur++] = nums2[j++];
                }
            } else {
                if (i >= m) {
                    result[cur++] = nums2[j++];
                } else {
                    result[cur++] = nums1[i++];
                }
            }
        }
        for (int k = 0; k < m + n; k++) {
            nums1[k] = result[k];
        }

    }
}
