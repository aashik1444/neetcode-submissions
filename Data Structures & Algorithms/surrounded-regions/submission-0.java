class Solution {
    public void solve(char[][] board) {
        int m = board.length, n = board[0].length;
        capture(board);
        for (int i=0; i<m; i++) {
            for (int j=0; j<n; j++) {
                if (board[i][j] == 'O') {
                    board[i][j] = 'X';
                } else if (board[i][j] == 'S') {
                    board[i][j] = 'O';
                }
            }
        }    
    }
    public void capture(char[][] board){
        Queue<int[]> q = new ArrayDeque<>();
        int[][] dir = {{1,0}, {0,1}, {0,-1}, {-1,0}};
        for (int r=0; r<board.length; r++){
            for (int c=0; c<board[0].length; c++){
                if ( (r == 0 || r == board.length-1 || c == 0 || c == board[0].length-1) && board[r][c] == 'O') {
                    q.add(new int[] {r, c});
                }
            }
        }
        while (!q.isEmpty()) {
            int[] node = q.poll();
            int a = node[0], b = node[1];
            if (board[a][b] == 'O') {
                board[a][b] = 'S';
                for (int[] d:dir) {
                    int row = a + d[0], col = b + d[1];
                    if (row >= 0 && row < board.length && col >= 0 && col < board[0].length) {
                        q.add(new int[] {row, col});
                    }
                }
            }
        }
    }
}
