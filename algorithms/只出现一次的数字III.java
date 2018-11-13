class Solution {
    public int[] singleNumber(int[] nums) {
        int number = 0;
        for (int num : nums) {
            number = number ^ num;
        }
        // 得到最右边的1的位置
        number = number & (-number);
        int[] result = new int[2];
        for (int num : nums) {
            if ((number & num) == 0) {
                result[0] = result[0] ^ num;
            } else {
                result[1] = result[1] ^ num;
            }
        }
        return result;
    }
}