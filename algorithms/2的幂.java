class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n < 0){
            return false;
        }
        int flag = 1;
        for (int i = 0; i < 32; i++) {
            if ((n ^ flag) == 0) {
                return true;
            }
            flag = flag << 1;
        }
        return false;
    }
}