class Solution {
    public boolean isMonotonic(int[] array) {
         // 如果数组只有一个元素
         if (array.length == 1) {
             return true;
         }
         boolean flag = true;
         // 判断是否是递增序列
         for (int i = 1; i < array.length; i++) {
             if (array[i - 1] > array[i]) {
                 flag = false;
                 break;
             }
         }
         if (flag) {
             return flag;
         }
         flag = true;
         // 判断是否是递减序列
         for (int i = array.length - 1; i > 0; i--) {
             if (array[i] > array[i - 1]) {
                 flag = false;
                 break;
             }
         }
         return flag;
     }
 }