class Solution {
    public int orangesRotting(int[][] grid) {
        int fresh_oranges = 0;
        int minutes = 0;
        Queue<int[]> record = new LinkedList<>();
        int i = 0, j = 0;

        int rows = grid.length;
        int cols = grid[0].length;

        // traverse the matrix
        while (i < grid.length) {
            while (j < grid[0].length) {
                // System.out.println("Grid " + grid[i][j]);
                if (grid[i][j] == 1)
                    fresh_oranges++;
                else if (grid[i][j] == 2)
                    record.offer(new int[] { i, j });
                j++;
            }
            i++;
            j = 0;
        }

        while (!record.isEmpty() && fresh_oranges > 0) {
            int size = record.size();

            for (int k = 0; k < size; k++) {
                int[] cell = record.poll();
                int row = cell[0];
                int col = cell[1];
                if (row + 1 < rows && grid[row + 1][col] == 1) { // down cell
                    grid[row + 1][col] = 2;
                    record.offer(new int[] { row + 1, col });
                    fresh_oranges--;
                }
                if (row - 1 >= 0 && grid[row - 1][col] == 1) { // up cell
                    grid[row - 1][col] = 2;
                    record.offer(new int[] { row - 1, col });
                    fresh_oranges--;
                }
                if (col + 1 < cols && grid[row][col + 1] == 1) { // right cell
                    grid[row][col + 1] = 2;
                    record.offer(new int[] { row, col + 1 });
                    fresh_oranges--;
                }
                if (col - 1 >= 0 && grid[row][col - 1] == 1) { // left cell
                    grid[row][col - 1] = 2;
                    record.offer(new int[] { row, col - 1 });
                    fresh_oranges--;
                }
            }
            minutes++;
        }

        // System.out.println(fresh_oranges);
        // System.out.println(record.size());

        if (fresh_oranges == 0)
            return minutes;
        return -1;
    }
}