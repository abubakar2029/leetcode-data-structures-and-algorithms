public class _66_Plus_One {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] result = s.plusOne(new int[]{9, 8, 7, 6, 5, 4, 3, 2, 1, 0});
    }

    static class Solution {
        public int[] plusOne(int[] digits) {

//            iterating over the loop
            for (int i = digits.length - 1; i >= 0; i--) {
                if (digits[i] < 9) {
                    digits[i]++;
                    return digits;
                }
                digits[i] = 0;
            }
            digits = new int[digits.length + 1];
            digits[0] = 1;
            return digits;
        }
    }
}
