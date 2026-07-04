class Solution {
    public int islandPerimeter(int[][] grid) {
        // start iterating
        // on first land cell, add in the que
        // apply bfs on this, add it's neighbours in the que, and traverse level by
        // level, on sides where no neighbours add in the perimeter

        int i = 0;
        int j = 0;
        int perimeter = 0;
        int rows = grid.length;
        int cols = grid[0].length;

        while (i < rows) {
            while (j < cols) {
                if (grid[i][j] == 1) {
                    Queue<int[]> records = new LinkedList<>();

                    records.offer(new int[] { i, j });
                    grid[i][j] = -1;
                    while (!records.isEmpty()) {
                        int[] cell = records.poll();
                        int row = cell[0];
                        int col = cell[1];
                        System.out.println("row " + row + " col " + col);

                        if (row - 1 < 0 || grid[row - 1][col] == 0)
                            perimeter++;

                        else if (grid[row - 1][col] == 1) {
                            records.offer(new int[] { row - 1, col });
                            grid[row - 1][col] = -1;
                        }

                        if (row + 1 >= rows || grid[row + 1][col] == 0) // down side
                            perimeter++;
                        else if (grid[row + 1][col] == 1) {
                            grid[row + 1][col] = -1;
                            records.offer(new int[] { row + 1, col });
                        }

                        if (col + 1 >= cols || grid[row][col + 1] == 0) // right side
                            perimeter++;
                        else if (grid[row][col + 1] == 1) {
                            grid[row][col + 1] = -1;
                            records.offer(new int[] { row, col + 1 });
                        }

                        if (col - 1 < 0 || grid[row][col - 1] == 0) // left side
                            perimeter++;
                        else if (grid[row][col - 1] == 1) {

                            grid[row][col - 1] = -1;
                            records.offer(new int[] { row, col - 1 });
                        }

                        System.out.println(perimeter);

                    }

                    // }
                }
                j++;

            }
            i++;
            j = 0;
        }

        return perimeter;

    }
}