class Solution {
    public boolean isPowerOfFour(int num) {
        int n = 1;
        for (int i = 0; i < 16; i++) {
            if ((num ^ n) == 0) {
                return true;
            }
            n = n << 2;
        }
        return false;
    }
}