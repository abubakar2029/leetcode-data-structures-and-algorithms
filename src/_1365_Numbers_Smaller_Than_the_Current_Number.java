import java.util.*;

public class _1365_Numbers_Smaller_Than_the_Current_Number {
    public static void main(String[] args) {
        _1365_Numbers_Smaller_Than_the_Current_Number outer = new _1365_Numbers_Smaller_Than_the_Current_Number();
        Solution sl = outer.new Solution();
        sl.smallerNumbersThanCurrent(new int[]{8, 1, 2, 2, 3});
    }

    // Counting sort approach
    class Solution {
        public int[] smallerNumbersThanCurrent(int[] nums) {
            int n = nums.length;
            int[] result = new int[n];

            // making the frequency array
            int[] count = new int[101];
            for (int i = 0; i < n; i++) {
                int digit = nums[i];
                count[digit] += 1;
            }

            // calculating the prefix count
            for (int i = 1; i < 100; i++) {
                count[i] = count[i - 1] + count[i];
            }

            // making the resultant array
            for (int i = 0; i < n; i++) {
                result[i] = nums[i] == 0 ? 0 : count[nums[i] - 1];
            }

            return result;
        }
    }

    //    Hashmap approach
    class Solution2 {
        public int[] smallerNumbersThanCurrent(int[] nums) {

            int[] result = nums.clone();
            Arrays.sort(result);

            Map<Integer, Integer> table = new HashMap<>();
            for (int i = 0; i < nums.length; i++) {
                if (!table.containsKey(result[i])) {
                    table.put(result[i], i);
                }
            }

            for (int i = 0; i < nums.length; i++) {
                result[i] = table.get(nums[i]);
            }

            return result;
        }
    }
}
