import java.util.HashSet;
import java.util.Set;

public class _202_Happy_Number {

    static class Solution {
        public boolean isHappy(int n) {

            int square = 0, digit = 0;
            int temp = n;
            Set<Integer> record = new HashSet<Integer>();
            while (square != 1) {
                square = 0;
                while (temp != 0) {
                    digit = temp % 10;
                    square += digit * digit;
                    temp = temp / 10;
                }
                temp = square;
                if (record.contains(square)) return false;
                record.add(square);
            }
            return true;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.isHappy(2));

    }
}
