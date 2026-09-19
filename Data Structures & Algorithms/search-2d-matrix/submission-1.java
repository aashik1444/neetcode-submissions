class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int l = 0, r = (matrix.length)*(matrix[0].length) - 1;
        while (l <= r) {
            int mid = l + (r - l)/2;
            int row = mid / matrix[0].length, col = mid % matrix[0].length;
            if (target > matrix[row][col]) {
                l = mid + 1;
            } else if (target < matrix[row][col]) {
                r = mid - 1;
            } else return true;
            
        }
        return false;
    }
}
