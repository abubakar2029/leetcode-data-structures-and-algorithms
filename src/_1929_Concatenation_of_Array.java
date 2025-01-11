import java.lang.reflect.Array;
import java.util.Arrays;

public class _1929_Concatenation_of_Array {
    public static void main(String[] args) {
        int[] result = Solution.getConcatenation(new int[]{1, 2, 1});
        System.out.println(Arrays.toString(result));
    }

    class Solution {
        static public int[] getConcatenation(int[] nums) {
            int ptr = 0;
            int[] nums2 = new int[nums.length * 2];
            for (int i = 0; i < nums2.length; i++) {
                if (ptr == nums.length)
                    ptr = 0;
                nums2[i] = nums[ptr];
                ptr++;

            }

            return nums2;
        }
    }
}
