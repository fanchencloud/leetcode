import java.util.Arrays;

class Solution {
    /**
     * 给定一个由整数组成的非空数组所表示的非负整数，在该数的基础上加一。 
     * 最高位数字存放在数组的首位， 数组中每个元素只存储一个数字。 
     * 你可以假设除了整数 0 之外，这个整数不会以零开头。
     *
     * @param digits 整数组成的数组
     * @return 加一后的结果
     */
    public int[] plusOne(int[] digits) {
        if (digits == null || digits.length == 0) {
            return new int[0];
        }
        int[] array = new int[digits.length + 1];
        int temp = 1;
        for (int i = digits.length - 1, j = digits.length; i >= 0; i--, j--) {
            if (temp != 0) {
                temp += digits[i];
                array[j] = temp % 10;
                temp = temp / 10;
            } else {
                array[j] = digits[i];
            }
        }
        if (temp != 0) {
            array[0] = temp;
            return array;
        } else {
            return Arrays.copyOfRange(array, 1, array.length);
        }
    }
}