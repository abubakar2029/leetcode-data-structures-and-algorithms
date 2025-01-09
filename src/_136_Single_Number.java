import java.util.HashMap;
import java.util.Map;


public class _136_Single_Number {
    class Solution {
        public int singleNumber(int[] nums) {
            Map<Integer, Integer> record = new HashMap<>();

            // Populate the map with frequencies
            for (int i = 0; i < nums.length; i++) {
                record.put(nums[i], record.getOrDefault(nums[i], 0) + 1);
            }

            // Find the number with a frequency of 1
            for (Map.Entry<Integer, Integer> entry : record.entrySet()) {
                if (entry.getValue() == 1) {
                    return entry.getKey();
                }
            }

            return -1; // Default return if no single number is found (shouldn't happen with valid input)
        }
    }
}
