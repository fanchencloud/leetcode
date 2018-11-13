class Solution {
    public int[] countBits(int num) {
        int[] array = new int[num + 1];
        for (int i = 0; i <= num; i++) {
            int n = i;
            int sum = 0;
            while (n != 0) {
                if ((n & 1) == 1) {
                    sum++;
                }
                n = n >>> 1;
            }
            array[i] = sum;
        }
        return array;
    }
}