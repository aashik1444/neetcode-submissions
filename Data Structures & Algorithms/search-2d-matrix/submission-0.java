class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rows = matrix.length, cols = matrix[0].length;
        int l = 0, r = rows * cols -1;
        while ( l <= r ) {
            int m = l + (r - l)/2;
            int rows2 = m / cols, cols2 = m % cols;
            if ( target > matrix[rows2][cols2]) {
                l = m + 1;
            } else if ( target < matrix[rows2][cols2]) {
                r = m - 1;
            } else return true;
        }
        return false;
    }
}
