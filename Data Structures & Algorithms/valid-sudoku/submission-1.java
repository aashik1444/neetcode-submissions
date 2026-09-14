class Solution {
    public boolean isValidSudoku(char[][] board) {
        int n = 9; //9x9 board
        //Use hashset to record the status
        HashSet<Character>[] rows = new HashSet[n];
        HashSet<Character>[] cols = new HashSet[n];
        HashSet<Character>[] boxes = new HashSet[n];
        for (int r=0; r<n; r++) { //initiating all the 9 hashsets
            rows[r] = new HashSet<Character>();
            cols[r] = new HashSet<Character>();
            boxes[r] = new HashSet<Character>();
        }

        for (int r=0; r<n; r++) {
            for (int c=0; c<n; c++) {
                char val = board[r][c];

                if (val == '.') continue;

                if (rows[r].contains(val)) return false;
                rows[r].add(val);

                if (cols[c].contains(val)) return false;
                cols[c].add(val);

                int idx = (r/3)*3 + c/3;
                if (boxes[idx].contains(val)) return false;
                boxes[idx].add(val);
            }
        }
        return true;
    }
}
