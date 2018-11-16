class Solution {
    /**
     * 给定一个 32 位有符号整数，将整数中的数字进行反转。
     * 假设我们的环境只能存储 32 位有符号整数，其数值范围是 [−231,  231 − 1]。根据这个假设，如果反转后的整数溢出，则返回 0。
     *
     * @param x
     * @return
     */
    public int reverse(int x) {
        boolean isNegativeNumber = false;
        if (x < 0) {
            // 负数标志为为真（true）
            isNegativeNumber = true;
            // 负数最小值无法转换
            if (x == Integer.MIN_VALUE) {
                return 0;
            }
            // 获取该负数的绝对值
            x = -x;
        }
        StringBuilder sb = new StringBuilder();
        // 将数字转换成字符串处理
        sb.append(x);
        // 反转字符串
        sb.reverse();
        if (isNegativeNumber) {
            // 头部添加负号
            sb.insert(0, "-");
        }
        // 判断是否会转换失败
        try {
            return Integer.parseInt(sb.toString());
        } catch (NumberFormatException e) {
            return 0;
        }
    }
}