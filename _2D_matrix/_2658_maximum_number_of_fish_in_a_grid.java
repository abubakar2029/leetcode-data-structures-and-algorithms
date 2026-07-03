class Solution {
    public int findMaxFish(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;

        int i = 0;
        int max = 0;

        while (i < rows) {
            int j = 0;

            while (j < cols) {

                if (grid[i][j] <= 0) {
                    j++;
                    continue;
                }

                int current = 0;
                Queue<int[]> record = new LinkedList<>();

                record.offer(new int[] { i, j });
                current += grid[i][j];
                grid[i][j] = 0;

                while (!record.isEmpty()) {

                    int[] cell = record.poll();
                    int row = cell[0];
                    int col = cell[1];

                    // FIX 1: explore + mark + DO NOT miss fish here
                    if (row + 1 < rows && grid[row + 1][col] > 0) {
                        record.offer(new int[] { row + 1, col });
                        current += grid[row + 1][col];
                        grid[row + 1][col] = 0;
                    }

                    if (row - 1 >= 0 && grid[row - 1][col] > 0) {
                        record.offer(new int[] { row - 1, col });
                        current += grid[row - 1][col];
                        grid[row - 1][col] = 0;
                    }

                    if (col - 1 >= 0 && grid[row][col - 1] > 0) {
                        record.offer(new int[] { row, col - 1 });
                        current += grid[row][col - 1];
                        grid[row][col - 1] = 0;
                    }

                    if (col + 1 < cols && grid[row][col + 1] > 0) {
                        record.offer(new int[] { row, col + 1 });
                        current += grid[row][col + 1];
                        grid[row][col + 1] = 0;
                    }
                }

                max = Math.max(max, current);
                j++;
            }

            i++;
        }

        return max;
    }
}