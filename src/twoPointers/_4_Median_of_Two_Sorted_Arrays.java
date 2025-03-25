package twoPointers;

public class _4_Median_of_Two_Sorted_Arrays {
    class Solution {
        public double findMedianSortedArrays(int[] nums1, int[] nums2) {
            int i = 0;
            int j = 0;
            int m1 = 0;
            int m2 = 0;

            int n = nums1.length;
            int m = nums2.length;

            // finding the median
            for (int k = 0; k <= (m + n) / 2; k++) {
                m2 = m1;
                if (i < n && j < m) {
                    if (nums1[i] > nums2[j]) {
                        m1 = nums2[j];
                        j++;
                    } else {
                        m1 = nums1[i];
                        i++;
                    }
                } else if (i < n) {
                    m1 = nums1[i];
                    i++;
                } else {
                    m1 = nums2[j];
                    j++;
                }
            }

            // returning the medians based on array lengths
            if ((m + n) % 2 == 0) {
                float ans = m1 + m2;
                return ans / 2;
            } else {
                return m1;
            }
        }
    }
}
