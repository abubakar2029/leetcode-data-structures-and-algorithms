import java.util.*;

public class _88_Merge_Sorted_Array {
    public static void main(String[] args) {
        Solution.merge(new int[]{1, 2, 3, 0, 0, 0}, 3, new int[]{2, 5, 6}, 3);
    }

    static class Solution {
        static public void merge(int[] nums1, int m, int[] nums2, int n) {


            // TreeMap is used for sorting
            Map<Integer, Integer> map = new TreeMap<>();

            // adding elements of first array in the map
            for (int i = 0; i < m; i++) {
                map.put(nums1[i], map.getOrDefault(nums1[i], 0) + 1);
            }

            // adding elements of second array in the map
            for (int i = 0; i < n; i++) {
                map.put(nums2[i], map.getOrDefault(nums2[i], 0) + 1);
            }

            // merging the arrays
            int index = 0;
            for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                int key = entry.getKey();
                int freq = entry.getValue();
                while (freq-- > 0) {
                    nums1[index++] = key;
                }
            }
        }
    }
}
