package leetcode;

public class NumIslands_200_MySolution_dfs {
    private int rows;
    private int cols;

    public int numIslands(char[][] grid) {
        int cnt = 0;
        rows = grid.length;
        if (rows == 0)
            return 0;
        cols = grid[0].length;
        boolean [][]visited = new boolean[rows][];
        for (int i = 0; i < rows; i++) {
            visited[i] = new boolean[cols];
            for (int j = 0; j < cols; j++) {
                visited[i][j] = false;
            }
        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (isAlive(i,j,rows,cols,visited,grid)){
                    cnt++;
                    dfs(i,j,rows,cols,visited,grid);
                }
            }
        }
        return cnt;
    }

    private boolean isAlive(int row, int col, int rows, int cols, boolean[][] visited, char[][] grid) {
        if (row >= 0 && row < rows && col >= 0 && col < cols) {
            return !visited[row][col] && grid[row][col] == '1';
        } else
            return false;
    }
    private void dfs(int row, int col, int rows, int cols, boolean[][] visited, char[][] grid){
        if(isAlive(row,col,rows,cols,visited,grid)){
            visited[row][col] = true;
            int [][] direction = {{1,0},{-1,0},{0,1},{0,-1}};
            for (int i = 0; i < 4; i++) {
                int x = row + direction[i][0];
                int y = col + direction[i][1];
                if (isAlive(x,y,rows,cols,visited,grid))
                    dfs(x,y,rows,cols,visited,grid);
            }
        }
    }
}