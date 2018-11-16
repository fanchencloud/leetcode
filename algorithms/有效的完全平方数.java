class Solution {
    /**
     * 给定一个正整数 num，编写一个函数，如果 num 是一个完全平方数，则返回 True，否则返回 False。
     * <p>
     * 说明：不要使用任何内置的库函数，如  sqrt。
     * 此处虽然运行效率高，但是使用了内置的库函数，个人认为不符合题目要求
     *
     * @param num
     * @return
     */
    public boolean isPerfectSquare1(int num) {
        return (int) Math.pow(num, 0.5) * (int) Math.pow(num, 0.5) == num;
    }

    /**
     * 给定一个正整数 num，编写一个函数，如果 num 是一个完全平方数，则返回 True，否则返回 False。
     * <p>
     * 说明：不要使用任何内置的库函数，如  sqrt。
     * <p>
     * 有恒等式：1+3+5+…+(2*n-1) = n^2
     *
     * @param num
     * @return
     */
    public boolean isPerfectSquare(int num) {
        int i = 1;
        while (num > 0) {
            num -= i;
            i += 2;
        }
        return num == 0;
    }
}