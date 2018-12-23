class Solution {
    public int maxIncreaseKeepingSkyline(int[][] grid) {
        if (grid == null) {
            return 0;
        }
        // 数组的行数
        int line = grid.length;
        // 数组的列数
        int column = grid[0].length;
        // 建立两个数组记录每行、每列的最大值
        int[] maxOfLine = new int[line];
        int[] maxOfColumn = new int[column];
        for (int i = 0; i < line; i++) {
            int max = grid[i][0];
            for (int j = 0; j < column; j++) {
                max = grid[i][j] > max ? grid[i][j] : max;
            }
            maxOfLine[i] = max;
        }
        for (int i = 0; i < column; i++) {
            int max = grid[0][i];
            for (int j = 0; j < line; j++) {
                max = grid[j][i] > max ? grid[j][i] : max;
            }
            maxOfColumn[i] = max;
        }
        int sum = 0;
        for (int i = 0; i < line; i++) {
            for (int j = 0; j < column; j++) {
                int max = maxOfLine[i] < maxOfColumn[j] ? maxOfLine[i] : maxOfColumn[j];
                sum += (max - grid[i][j]);
            }
        }
        return sum;
    }
}