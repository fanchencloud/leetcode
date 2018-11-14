class Solution {
    public boolean isPowerOfThree(int n) {
        if(n <= 0){
            return false;
        }
        int maxPower = (int) Math.pow(3, (int) (Math.log(0x7fffffff) / Math.log(3)));
        if (maxPower % n == 0) {
            return true;
        }
        return false;
    }
}