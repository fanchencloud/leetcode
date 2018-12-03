class Solution {
    /**
     * 判断一个整数是否是回文数。回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。
     *
     * @param x 数字
     * @return 判断结果
     */
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        if (x != 0 && x % 10 == 0) {
            return false;
        }
        int s = 0;
        while (s <= x) {
            s = s * 10 + x % 10;
            if (s == x) {
                return true;
            }
            if (s == x / 10) {
                return true;
            }
            x = x / 10;
        }
        return false;
    }
}