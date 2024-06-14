public class Pattern_30 {
    public static void main(String[] args) {
        draw(7);
    }


    static void draw(int n) {
        int ptr = -1;
        StringBuilder output = new StringBuilder();
        for (int i = 0; i < n; i++) {
            int noOfSpaces = n + ptr;

            output.repeat("  ", noOfSpaces);

            for (int digit = ptr; digit <= -(ptr); digit++) {
                if (digit == -1 || digit == 0) continue;
                output.append(Math.abs(digit));
                output.append(" ");
            }
            output.append("\n");
            ptr--;
        }
        System.out.println(output);
    }
}
