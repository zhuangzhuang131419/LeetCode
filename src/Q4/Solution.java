package Q4;

/**
 * There are two sorted arrays nums1 and nums2 of size m and n respectively.
 * Find the median of the two sorted arrays. The overall run time complexity should be O(log (m+n)).
 * You may assume nums1 and nums2 cannot be both empty.
 */

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if (nums1.length == 0) {
            if (nums2.length % 2 == 0) {
                return (nums2[nums2.length / 2] + nums2[nums2.length / 2 + 1]) / 2.0;
            }
            else {
                return nums2[nums2.length + 1];
            }
        }

        if (nums2.length == 0) {
            if (nums1.length % 2 == 0) {
                return (nums1[nums1.length / 2] + nums1[nums1.length / 2 + 1]) / 2.0;
            }
            else {
                return nums1[nums1.length + 1];
            }
        }

        if (nums1.length % 2 == 0 && nums2.length % 2 == 0) {
            int a = nums1[nums1.length / 2];
            int b = nums2[nums2.length / 2];
            if (a < b) {
                if (a > nums2[nums2.length / 2 - 1]) {
                    return (a + nums2[nums2.length / 2 - 1]) / 2.0;
                } else {
                    int length = Math.min(nums1.length / 2, nums2.length / 2);
                    int[] n1 = new int[nums1.length - length];
                    int[] n2 = new int[nums2.length - length];
                    for (int i = 0; i < nums1.length - length - 1; i++) {
                        n1[i] = nums1[i + length];
                    }

                    for (int i = 0; i < nums1.length - length - 1; i++) {
                        n2[i] = nums2[i];
                    }
                    return findMedianSortedArrays(n1, n2);
                }
            }
        } else if (nums1.length % 2 != 0 && nums2.length % 2 != 0) {
            int a = nums1[nums1.length / 2];
            int b = nums2[nums2.length / 2];
            if (a < b) {
                if (a > nums2[nums2.length / 2 - 1] && b > nums1[nums1.length / 2 - 1]) {
                    return (a + b) / 2.0;
                }
                else {
                    int length = Math.min(nums1.length / 2, nums2.length / 2);
                    int[] n1 = new int[nums1.length - length];
                    int[] n2 = new int[nums2.length - length];
                    for (int i = 0; i < nums1.length - length - 1; i++) {
                        n1[i] = nums1[i + length];
                    }

                    for (int i = 0; i < nums1.length - length - 1; i++) {
                        n2[i] = nums2[i];
                    }
                    return findMedianSortedArrays(n1, n2);
                }
            }
        } else if (nums1.length % 2 != 0) {
            int a = nums1[nums1.length / 2];
            int b = nums2[nums2.length / 2];
            if (a < b) {
                if (a > nums2[nums2.length / 2 - 1] && b > nums1[nums1.length / 2 - 1]) {
                    return (a + b) / 2.0;
                }
                else {
                    int length = Math.min(nums1.length / 2, nums2.length / 2);
                    int[] n1 = new int[nums1.length - length];
                    int[] n2 = new int[nums2.length - length];
                    for (int i = 0; i < nums1.length - length - 1; i++) {
                        n1[i] = nums1[i + length];
                    }

                    for (int i = 0; i < nums1.length - length - 1; i++) {
                        n2[i] = nums2[i];
                    }
                    return findMedianSortedArrays(n1, n2);
                }
            }
        }
        return 0;
    }
}