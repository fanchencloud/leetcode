class Solution {
    /**
     * 给定两个二进制字符串，返回他们的和（用二进制表示）。
     * <p>
     * 输入为非空字符串且只包含数字 1 和 0。
     *
     * @param a 数字1
     * @param b 数字2
     * @return 计算结果
     */
    public String addBinary(String a, String b) {
        char[] charA = stringToArray(a);
        char[] charB = stringToArray(b);
        int length = charA.length > charB.length ? charA.length + 1 : charB.length + 1;
        char[] array = new char[length];
        int i = charA.length - 1;
        int j = charB.length - 1;
        int temp = 0;
        while (i >= 0 && j >= 0) {
            temp = charA[i] + charB[j] + temp;
            array[--length] = (char) (temp % 2);
            temp = temp / 2;
            i--;
            j--;
        }
        while (i >= 0) {
            temp = temp + charA[i--];
            array[--length] = (char) (temp % 2);
            temp /= 2;
        }
        while (j >= 0) {
            temp = temp + charB[j--];
            array[--length] = (char) (temp % 2);
            temp /= 2;
        }
        if (temp != 0) {
            array[--length] = (char) temp;
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