class Solution {
    /**
     * 解法：统计每个数字的每一位上的1和0的数量，如果该数字出现三次，那么1和0的数量必定是3的倍数
     *
     * @param nums
     * @return
     */
    public int singleNumber(int[] nums) {
        int number = 0;
        int flag = 1;
        for (int i = 0; i < 32; i++) {
            // 统计数组中每个数第一位的1的个数
            int count = 0;
            for (int num : nums) {
                // 与运算，位相同结果不为0，不相同结果为0 
                if ((flag & num) != 0) {
                    // 该数字此时的位运算结果不为0，即该数字该位上的位为1
                    count++;
                }
            }
            // 取模运算结果不为0，说明该位上有没有出现3次的数字
            if (count % 3 != 0) {
                number = number | flag;
            }
            flag = flag << 1;
        }
        return number;
    }
}