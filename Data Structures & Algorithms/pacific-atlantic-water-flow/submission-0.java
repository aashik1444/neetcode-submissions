class Solution {
    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        int m = heights.length, n = heights[0].length;
        boolean[][] pac = new boolean[m][n];
        boolean[][] atl = new boolean[m][n];
        List<List<Integer>> res = new ArrayList<>();
        Queue<int[]> pacific = new ArrayDeque<>();
        Queue<int[]> atlantic = new ArrayDeque<>();

        for(int i=0; i<m; i++) {
            pacific.add(new int[] {i, 0});
            atlantic.add(new int[] {i, n-1});
        }
        for(int j=0; j<n; j++) {
            pacific.add(new int[] {0, j});
            atlantic.add(new int[] {m-1, j});
        }
        bfs(pacific, pac, heights);
        bfs(atlantic, atl, heights);

        for (int a=0; a<m; a++) {
            for (int b=0; b<n; b++) {
                if(pac[a][b] && atl[a][b]) {
                    res.add(Arrays.asList(a,b));
                }
            }
        }
        return res;

    }
    public void bfs(Queue<int[]> q, boolean[][] ocean, int[][] heights) {
        int[][] directions = {{1,0}, {0,1}, {-1,0}, {0,-1}};
        while (!q.isEmpty()){
            int[] node = q.poll();
            int row = node[0], col = node[1];
            ocean[row][col] = true;
            for (int[] d:directions) {
                int r = row + d[0];
                int c = col + d[1];
                if (r >= 0 && r < heights.length && c >= 0 && c < heights[0].length && !ocean[r][c] && heights[r][c] >= heights[row][col]) {
                    q.add(new int[] {r,c});
                }
            }
        } 
    }
}
