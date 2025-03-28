public class _1089_Duplicate_Zeros {
    class Solution {
        public void duplicateZeros(int[] arr) {
            int zeros = 0, n = arr.length;

            // Count the number of zeros
            for (int num : arr) {
                if (num == 0)
                    zeros++;
            }

            int i = n - 1, j = n + zeros - 1;

            // Process the array from end to start
            while (i >= 0) {
                if (j < n)
                    arr[j] = arr[i]; // Place the current element

                if (arr[i] == 0) { // Duplicate zero
                    j--;
                    if (j < n)
                        arr[j] = 0;
                }

                i--;
                j--;
            }
        }
    }

}
