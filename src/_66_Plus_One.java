public class _66_Plus_One {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] result = s.plusOne(new int[]{9,8,7,6,5,4,3,2,1,0});
    }

    static class Solution {
        public int[] plusOne(int[] digits) {
            // converting integer array into string
            String str = "";
            for (int i = 0; i < digits.length; i++) {
                str += digits[i];
            }
            // converting str to integer and adding 1
            int largeInteger = Integer.parseInt(str);
            largeInteger++;
            str = "";
            str = "" + largeInteger;
            int[] new_digits = new int[str.length()];
            // again converting into int[]
            for (int i = 0; i < new_digits.length; i++) {
                new_digits[i] = Character.getNumericValue(str.charAt(i));
            }
            return new_digits;
        }
    }
}
