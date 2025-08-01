package strings;

public class _171_Excel_Sheet_Column_Number {
    public static void main(String[] args) {

        int a = Solution.titleToNumber("A");
//        int a = Solution.titleToNumber("ZY");
        System.out.println(a);
    }

    class SolutionDay1 {
        static public int titleToNumber(String columnTitle) {
            int coloumnNumber = 0;
            for (int i = 0; i < columnTitle.length() - 1; i++) {
                int baseNumber = columnTitle.charAt(i) - 64;
                coloumnNumber += 26 * baseNumber;
            }
            coloumnNumber += columnTitle.charAt(columnTitle.length() - 1) - 64;
            return coloumnNumber;
        }
    }

    class Solution {
        static public int titleToNumber(String columnTitle) {
            int cN = 0; // coloumnNumber
            for (int i = 0; i <= columnTitle.length() - 1; i++) {
                int baseNumber = columnTitle.charAt(i) - 64;
                cN += Math.pow(26, columnTitle.length() - 1 - i) * baseNumber;
            }
            return cN;
        }

    }
}
