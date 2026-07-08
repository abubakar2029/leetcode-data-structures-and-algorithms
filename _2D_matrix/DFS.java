package _2D_matrix;

import java.util.HashSet;
import java.util.Set;

public class DFS {
    int rows = 3;
    int cols = 3;

    Set<String> visited = new HashSet<>();

    public static void main(String[] args) {
        DFS dfs = new DFS();

        int result = dfs.algorithm(1, 1);

        System.out.println("Returned Value = " + result);
    }

    public int algorithm(int row, int col) {
        if (row < 0 || col < 0 || row >= rows || col >= cols || visited.contains(row + "+" + col)) {
            return 2;
        }

        visited.add(row + "+" + col);
        System.out.println(row + "," + col);

        return 2 + algorithm(row - 1, col) +
                algorithm(row + 1, col) +
                algorithm(row, col - 1) +
                algorithm(row, col + 1);
    }
}
