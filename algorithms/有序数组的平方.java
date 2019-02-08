import java.util.Arrays;

class Solution {
    public int[] sortedSquares(int[] A) {
        if(A == null){
            return new int[0];
        }
        int[] array = new int[A.length];
        for (int i = 0; i < A.length; i++) {
            array[i] = A[i] * A[i];
        }
        Arrays.sort(array);
        return array;
    }
}