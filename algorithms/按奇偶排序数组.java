class Solution {
    public int[] sortArrayByParity(int[] A) {
        if (A == null || A.length == 0) {
            return new int[0];
        }
        // 左边标志
        int i = 0;
        // 右边标志
        int j = A.length - 1;
        while (i < j) {
            while (i < A.length && (A[i] & 1) == 0) {
                i++;
            }
            while (j >= 0 && (A[j] & 1) == 1) {
                j--;
            }
            if (i >= j) {
                break;
            }
            swap(A, i, j);
        }
        return A;
    }

    public static void swap(int[] array, int i, int j) {
        int t = array[i];
        array[i] = array[j];
        array[j] = t;
    }
}