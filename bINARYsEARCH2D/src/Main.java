import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[][] sortedMarix = {
                {10, 20, 30, 40},
                {50, 60, 70, 80},
                {90, 100, 120, 130},
                {140, 150, 160, 170}
        };

        System.out.println(Arrays.toString(search(sortedMarix, 170)));
    }

    static int[] search(int[][] martrix, int target) {
        int r = 0;
        int c = martrix.length - 1;
        while (r < martrix.length && c > 0) {
            if (martrix[r][c] == target) return new int[]{r, c};
            else if (martrix[r][c] < target) r++;
            else c--;
        }
        return new int[]{-1, -1};
    }
}