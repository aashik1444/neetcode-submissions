class Solution {
    public int numIslands(char[][] grid) {
        int n  = grid.length, m = grid[0].length;
        int total = 0;
        for (int i=0; i<n; i++) {
            for (int j=0; j<m; j++) {
                if (grid[i][j] == '1') {
                    total++;
                    dfs(grid, i, j);
                }
            }
        }
        return total;

    }
    public void dfs(char[][] grid, int i, int j){
        int[][] directions = {{1,0}, {0,1}, {-1,0}, {0,-1}};
        if (i < 0 || i >= grid.length || j < 0 || j >= grid[0].length || grid[i][j] == '0') {
            return;
        }
        grid[i][j] = '0';
        for (int[] dir: directions) {
            dfs(grid, i+dir[0], j+dir[1]);
        }
    }
}
