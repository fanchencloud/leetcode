class Solution {
  public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0) {
            return false;
        }
        // 行数
        int m = matrix.length;
        // 列数
        int n = matrix[0].length;
        int x = n - 1;
        int y = 0;
        while (x >= 0 && y < m) {
            if (matrix[y][x] < target) {
                y++;
            } else if (matrix[y][x] > target) {
                x--;
            } else {
                return true;
            }
        }
        return false;
    }
}