import java.util.*;

public class _219_Contains_Duplicate_II {

    public static void main(String[] args) {
        System.out.println(Solution.containsNearbyDuplicate(new int[] {1,2,3,1,2,3},2));
    }

    //    time limit is exceeding in solution2
    class Solution2 {
        public boolean containsNearbyDuplicate(int[] nums, int k) {
            for (int i = 0; i < nums.length; i++) {
                for (int j = i + 1; j < nums.length; j++) {
                    if (nums[i] == nums[j] && Math.abs(i - j) <= k) return true;
                }
            }
            return false;
        }
    }

    class Solution {
        static public boolean containsNearbyDuplicate(int[] nums, int k) {
            // my approach
            // for ka loop chla do
            // agar table ma ha to check kr do nhi to add krwa do
            Map<Integer, Integer> table = new HashMap();
            for (int i = 0; i < nums.length; i++) {
                if (!table.containsKey(nums[i]))
                    table.put(nums[i], i);
                else {
                    if (Math.abs(table.get(nums[i]) - i) <= k) {
                        return true;
                    } else {
                        table.put(nums[i], i);
                    }
                }
            }
            return false;
        }
    }
}
