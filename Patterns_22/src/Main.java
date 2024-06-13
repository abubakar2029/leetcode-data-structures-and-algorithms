//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
/*
 * Steps to solve patterns
 * No. of rows = No. of iterations of outer loop
 * Identify for every row => no. of columns there + type of elements there*/
public class Main {
    public static void main(String[] args) {
        pattern2(3);
    }

    /*1
     * 12
     * 123
     * 1234*/
    static void pattern1(int n) {
        String output = "";
        for (int row = 0; row < n; row++) {
            String rowString = "";
            for (int col = 0; col <= row; col++) {
                rowString += col + 1 + " ";
            }
            rowString += "\n";
            output += rowString;
        }
        System.out.println(output);
    }

    /*  *
     *  * *
     * * * *
     *  * *
     *   *   */
    static void pattern2(int n) {
        String output = "";
        for (int row = 0; row < 2 * n; row++) {
            String rowString = "";
//            adding spaces
            int noOfSpaces;
            int noOfCol;
            if (row < n) {
                noOfSpaces = n - row -1;
                noOfCol=row;
            } else {
                noOfSpaces = row - n ;
                noOfCol=n-(row-n)-1;
            }
            for (int space = 0; space <= noOfSpaces; space++) {
                rowString += " ";
            }
//            adding * in this loop
            for (int col = 0; col <= noOfCol; col++) {
                rowString += "*";
                rowString += " ";
            }
            rowString += "\n";
            output += rowString;
        }
        System.out.println(output);
    }
}
