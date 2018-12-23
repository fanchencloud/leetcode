class Solution {
    public int[][] transpose(int[][] array) {
        if (array == null) {
            return null;
        }
        // 数组的行数
        int line = array.length;
        // 数组的列数
        int column = array[0].length;
        // 行列相等
        if (line == column) {
            for (int i = 0; i < line; i++) {
                for (int j = 0; j < i; j++) {
                    array[i][j] = array[i][j] ^ array[j][i];
                    array[j][i] = array[i][j] ^ array[j][i];
                    array[i][j] = array[i][j] ^ array[j][i];
                }
            }
            return array;
        } else {
            // 创建一个新的数组
            int[][] temp = new int[column][line];
            for (int i = 0; i < line; i++) {
                for (int j = 0; j < column; j++) {
                    temp[j][i] = array[i][j];
                }
            }
            return temp;
        }
    }
}