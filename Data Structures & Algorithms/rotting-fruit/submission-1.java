class Solution {
    public int orangesRotting(int[][] grid) {
        Queue<int []> q = new ArrayDeque<>();
        int fresh = 0;
        int time = 0;

        for (int r=0; r<grid.length; r++) {
            for (int c=0; c<grid[0].length; c++) {
                if (grid[r][c] == 1) {
                    fresh++;
                }
                if (grid[r][c] == 2) {
                    q.add(new int[] {r, c});
                }
            }
        }
        int[][] dirs = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};
        while (fresh > 0 && !q.isEmpty()) {
            int l = q.size();
            for (int i=0; i<l; i++) {
                int[] node = q.poll();
                int row = node[0];
                int col = node[1];
                for (int[] dir: dirs) {
                    int r = row + dir[0];
                    int c = col + dir[1];
                    if (r >= 0 && r<grid.length && c >= 0 && c<grid[0].length && grid[r][c] == 1) {
                        grid[r][c] = 2;
                        q.offer(new int[] {r,c});
                        fresh--;
                    }
                }
            }
            time++;
        }
        return fresh == 0? time : -1;
    }
}
