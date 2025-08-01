package twoPointers;

public class _925_Long_Pressed_Name {
    public static void main(String[] args) {
        _925_Long_Pressed_Name outer = new _925_Long_Pressed_Name();
        Solution1 solution1 = outer.new Solution1();

    }



    //    Failed - it checks frquencies correctly but not the order of characters
    class Solution1 {
        public boolean isLongPressedName(String name, String typed) {

            // frequency array of name
            int[] s1 = new int[26];
            for (char ch : name.toCharArray()) {
                s1[ch - 'a'] += 1;
            }

            // frequency array of types
            int[] s2 = new int[26];
            for (char ch : typed.toCharArray()) {
                s2[ch - 'a'] += 1;
            }

            // checking the long press - difference between s1 and s2 frequencies arrays
            for (int i = 0; i < 26; i++) {
                if (s1[i] - s2[i] >= 1) return false;
            }

            return true;
        }
    }
}
