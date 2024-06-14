public class Pattern_17 {
    public static void main(String[] args) {
        draw(6);
    }

    static void draw(int n) {
        int ptr = -1;
        StringBuilder output = new StringBuilder();
        for (int i = 0; i < (2 * n) - 1; i++) {
            int noOfSpaces = 0;
            if (i < n)
                noOfSpaces = n - i - 1;
            else
                noOfSpaces = i - n + 1;

            output.repeat("  ", noOfSpaces);
            // yahan pr aak extra space add krna sa problem solve ho gaya
            for (int digit = ptr; digit <= -(ptr); digit++) {
                if (digit == -1 || digit == 0)
                    continue;
                output.append(Math.abs(digit));
                output.append(" ");
            }
            output.append("\n");
            if (i < n - 1)
                ptr--;
            else
                ptr++;
        }
        System.out.println("Output\n\n" + output.toString());
    }
}
