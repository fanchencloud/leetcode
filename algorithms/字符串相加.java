class Solution {
    /**
     * 给定两个字符串形式的非负整数 num1 和num2 ，计算它们的和。
     * 注意：
     * <p>
     * num1 和num2 的长度都小于 5100.
     * num1 和num2 都只包含数字 0-9.
     * num1 和num2 都不包含任何前导零。
     * 你不能使用任何內建 BigInteger 库， 也不能直接将输入的字符串转换为整数形式。
     *
     * @param num1 数字1
     * @param num2 数字2
     * @return 相加的结果
     */
    public String addStrings(String num1, String num2) {
        char[] charsOfNumber1 = stringToArray(num1);
        char[] charsOfNumber2 = stringToArray(num2);
        int index = charsOfNumber1.length > charsOfNumber2.length ? charsOfNumber1.length + 1 : charsOfNumber2.length + 1;
        // 创建保存结果的数组
        char[] array = new char[index];
        // 下标减一，为了正常访问
        index--;
        int i = charsOfNumber1.length - 1;
        int j = charsOfNumber2.length - 1;
        // 保存相加的临时结果
        int temp = 0;
        while (i >= 0 && j >= 0) {
            temp += charsOfNumber1[i--] + charsOfNumber2[j--];
            array[index--] = (char) (temp % 10);
            temp /= 10;
        }

        while (i >= 0) {
            temp += charsOfNumber1[i--];
            array[index--] = (char) (temp % 10);
            temp /= 10;
        }

        while (j >= 0) {
            temp += charsOfNumber2[j--];
            array[index--] = (char) (temp % 10);
            temp /= 10;
        }
        if (temp != 0) {
            array[index] = (char) temp;
        }
        return arrayToString(array);

    }

    /**
     * 将字符串转换成数组
     *
     * @param message 字符串
     */
    private static char[] stringToArray(String message) {
        char[] array = message.toCharArray();
        for (int i = 0; i < array.length; i++) {
            array[i] = (char) (array[i] - '0');
        }
        return array;
    }

    private static String arrayToString(char[] array) {
        // 寻找开始的位置
        int index = 0;
        while (index < array.length && array[index] == 0) {
            index++;
        }
        if (index == array.length) {
            return "0";
        }
        StringBuilder sb = new StringBuilder();
        while (index < array.length) {
            sb.append((char) (array[index] + '0'));
            index++;
        }
        return sb.toString();
    }
}