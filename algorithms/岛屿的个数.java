class Solution {
    public int numIslands(char[][] array) {
         if (array == null || array.length == 0 || array[0].length == 0) {
             return 0;
         }
         int sum = 0;
         // 行
         int row = array.length;
         // 列
         int column = array[0].length;
         for (int i = 0; i < row; i++) {
             for (int j = 0; j < column; j++) {
                 if (array[i][j] == '1') {
                     sum++;
                     dfs(i, j, array);
                 }
             }
         }
         System.out.println(sum);
         return sum;
     }
 
     private void dfs(int x, int y, char[][] array) {
         // 将该点标记为已遍历
         array[x][y] = '2';
         // 向左边遍历
         if ((y - 1) >= 0 && array[x][y - 1] == '1') {
             dfs(x, y - 1, array);
         }
         // 向右边遍历
         if ((y + 1) < array[0].length && array[x][y + 1] == '1') {
             dfs(x, y + 1, array);
         }
         // 向上遍历
         if ((x - 1) >= 0 && array[x - 1][y] == '1') {
             dfs(x - 1, y, array);
         }
         // 向下边遍历
         if ((x + 1) < array.length && array[x + 1][y] == '1') {
             dfs(x + 1, y, array);
         }
     }
 }