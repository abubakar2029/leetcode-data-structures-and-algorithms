package _2D_matrix;

import java.util.*;

public class _200_Number_of_Islands {
    public static void main(String[] args) {
        _200_Number_of_Islands parent = new _200_Number_of_Islands();
        Solution solution = parent.new Solution();
        solution.numIslands(new char[][]
                {
                        {'0', '1', '1', '1', '0'},
                        {'1', '1', '0', '1', '0'},
                        {'1', '1', '0', '0', '0'},
                        {'0', '0', '0', '0', '0'}
                }
        );
    }

    class Solution {
        int rows;
        int cols;

        public int numIslands(char[][] grid) {
            int islands = 0;

            rows = grid.length;
            cols = grid[0].length;

            for (int r = 0; r < rows; r++) {
                for (int c = 0; c < cols; c++) {
                    if (grid[r][c] == '1') {
                        islands++;
                        bfs(r, c, grid);
                    }
                }
            }
            return islands;
        }

        int[][] directions = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};

        public void bfs(int r, int c, char[][] grid) {
            Queue<int[]> que = new LinkedList();
            que.offer(new int[]{r, c});
            grid[r][c] = '0';

            while (!que.isEmpty()) {
                int[] cell = que.poll();

                r = cell[0];
                c = cell[1];
                for (int[] d : directions) {
                    int nr = r + d[0];
                    int nc = c + d[1];

                    if (nr < 0 || nr >= rows || nc < 0 || nc >= cols || grid[nr][nc] == '0')
                        continue;
                    que.offer(new int[]{nr, nc});
                    grid[nr][nc] = '0';

                }
            }
        }

        public void dfs(int r, int c, char[][] grid) {
            if (r < 0 || r >= rows || c < 0 || c >= cols || grid[r][c] == '0')
                return;
            grid[r][c] = '0';
            dfs(r, c + 1, grid); // right-element
            dfs(r, c - 1, grid); // left-element
            dfs(r - 1, c, grid); // up-element
            dfs(r + 1, c, grid); // down-element
        }
    }
}
