class Solution {
    public int orangesRotting(int[][] grid) {
        int m = grid.length, n = grid[0].length;
        Queue<int[]> q = new ArrayDeque<>();
        int fresh = 0;
        int time = 0;

        for (int i=0; i<m; i++) {
            for (int j=0; j<n; j++) {
                if (grid[i][j] == 1) {
                    fresh++;
                }
                if (grid[i][j] == 2) {
                    q.add(new int[] {i, j});
                }
            }
        }
        int[][] directions = {{1,0}, {0,1}, {-1,0}, {0,-1}};
        while (fresh > 0 && !q.isEmpty()){
            int l = q.size();
            for (int a=0; a<l; a++) {
                int[] node = q.poll();
                int row = node[0];
                int col = node[1];
                for (int[] d: directions) {
                    int r = row + d[0], c = col + d[1];
                    if (r>=0 && r<grid.length && c>=0 && c<grid[0].length && grid[r][c] == 1) {
                        grid[r][c] = 2;
                        fresh--;
                        q.add(new int[] {r,c});
                    }
                }

            }
            time++;

            
        }
        return fresh == 0? time : -1;
    
    }
}
