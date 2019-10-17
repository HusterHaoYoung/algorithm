package leetcode;

import java.util.LinkedList;
import java.util.Queue;

public class NumIslands_200_MySolution_bfs {
    private int rows;
    private int cols;

    public int numIslands(char[][] grid) {
        int cnt = 0;
        rows = grid.length;
        if (rows == 0)
            return 0;
        cols = grid[0].length;
        int[][] direction = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
        boolean[][] visited = new boolean[rows][];
        for (int i = 0; i < rows; i++) {
            visited[i] = new boolean[cols];
            for (int j = 0; j < cols; j++) {
                visited[i][j] = false;
            }
        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (isAlive(i, j, visited,grid)) {
                    cnt++;
                    Queue<Integer> queue = new LinkedList<>();
                    queue.add(i * cols + j);
                    visited[i][j] = true;
                    while (!queue.isEmpty()) {
                        int tmp = queue.poll();
                        int x = tmp / cols;
                        int y = tmp % cols;
                        for (int k = 0; k < 4; k++) {
                            int newx = x + direction[k][0];
                            int newy = y + direction[k][1];
                            if (isAlive(newx, newy, visited,grid)) {
                                visited[newx][newy] = true;
                                queue.add(newx * cols + newy);
                            }
                        }
                    }
                }
            }
        }
        return cnt;
    }

    private boolean isAlive(int row, int col, boolean[][] visited, char[][] grid) {
        if (col >= 0 && row >= 0 && col < cols && row < rows) {
            return grid[row][col] == '1' && !visited[row][col];
        } else {
            return false;
        }
    }
}
