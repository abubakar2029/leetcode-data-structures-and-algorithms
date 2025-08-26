package backtracking;

import java.util.ArrayList;

public class DeterminePath {
    public static void main(String[] args) {
        ArrayList<String> paths = new ArrayList();
        findDiagonalPaths("", paths, 3, 3);
//        findPaths("", paths, 3, 3);
        System.out.println(paths.toString());
    }

    static void findPaths(String str, ArrayList<String> paths, int r, int c) {
        if (c == 1 && r == 1) {
            paths.add(str);
            return;
        }
        if (r > 1) findPaths(str + "D", paths, r - 1, c);
        if (c > 1) findPaths(str + "R", paths, r, c - 1);
    }

    static void findDiagonalPaths(String str, ArrayList<String> paths, int r, int c) {
        if (c == 1 && r == 1) {
            paths.add(str);
            return;
        }
        if (r > 1 && c > 1) findDiagonalPaths(str + "C", paths, r - 1, c - 1);
        if (r > 1) findDiagonalPaths(str + "D", paths, r - 1, c);
        if (c > 1) findDiagonalPaths(str + "R", paths, r, c - 1);
    }
}
