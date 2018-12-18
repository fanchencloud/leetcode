class Solution {
   public int search(int[] array, int target) {
        if (array == null || array.length == 0) {
            return -1;
        }
        int start = 0;
        int end = array.length - 1;
        while (start <= end) {
            int middle = (start + end) / 2;
            if (array[middle] == target) {
                return middle;
            } else if (array[middle] < target) {
                start = middle + 1;
            } else {
                end = middle - 1;
            }
        }
        return -1;

    }
}