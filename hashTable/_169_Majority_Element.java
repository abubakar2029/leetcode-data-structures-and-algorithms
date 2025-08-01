package hashTable;

import java.util.*;

public class _169_Majority_Element {
    class Solution {
        public int majorityElement(int[] nums) {
            Map<Integer, Integer> table = new HashMap();
            int n = nums.length;

            // adding values in the map
            for (int i = 0; i < n; i++) {
                int value = table.containsKey(nums[i]) ? table.get(nums[i]) : 0;
                table.put(nums[i], value + 1);
            }

            // iterating to find the target element
            for (int i = 0; i < n; i++) {
                if (table.get(nums[i]) > n / 2) return nums[i];
            }
            return 0;
        }
    }
}
