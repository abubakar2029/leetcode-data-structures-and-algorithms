public class _1365_Numbers_Smaller_Than_the_Current_Number {
    public static void main(String[] args) {
        _1365_Numbers_Smaller_Than_the_Current_Number outer = new _1365_Numbers_Smaller_Than_the_Current_Number();
        Solution sl = outer.new Solution();
        sl.smallerNumbersThanCurrent(new int[] {8,1,2,2,3});
    }

    class Solution {
        public int[] smallerNumbersThanCurrent(int[] nums) {
            int[] count = new int[101];
            int[] res = new int[nums.length];

            for (int i = 0; i < nums.length; i++) {
                count[nums[i]]++;
            }

            for (int i = 1; i <= 100; i++) {
                count[i] += count[i - 1];
            }

            for (int i = 0; i < nums.length; i++) {
                if (nums[i] == 0)
                    res[i] = 0;
                else
                    res[i] = count[nums[i] - 1];
            }

            return res;
        }
    }
}
