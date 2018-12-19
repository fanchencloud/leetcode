class Solution {
    public int[] sortArrayByParityII(int[] array) {
        int[] temp = new int[array.length];
        int i = 0;
        int j = 1;
        for (int num : array) {
            if ((num & 1) == 1) {
                temp[j] = num;
                j += 2;
            } else {
                temp[i] = num;
                i += 2;
            }
        }
        return temp;
    }
}