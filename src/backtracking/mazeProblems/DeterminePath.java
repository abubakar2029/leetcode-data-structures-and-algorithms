package backtracking.mazeProblems;

import java.util.ArrayList;

public class DeterminePath {
    public static void main(String[] args) {
        ArrayList<String> paths = new ArrayList();
        findPaths("",paths,3,3);
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
}
