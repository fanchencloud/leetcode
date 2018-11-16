class Solution {
    /**
     * 给定两个以字符串形式表示的非负整数 num1 和 num2，返回 num1 和 num2 的乘积，它们的乘积也表示为字符串形式。
     *
     * @param num1 数字1
     * @param num2 数字2
     * @return 相乘的结果
     */
    public String multiply(String num1, String num2) {
        char[] arrayOfNumber1 = stringToArray(num1);
        char[] arrayOfNumber2 = stringToArray(num2);
        // 保存结果的数组，+1是为了处理一位数乘以一位数的情况比如：9*9
        char[] array = new char[arrayOfNumber1.length * arrayOfNumber2.length + 1];
        int startIndex = array.length;
        // 模拟乘法计算
        for (int i = arrayOfNumber2.length - 1; i >= 0; i--) {
            startIndex--;
            // 模拟乘法运算的时候使用的下标
            int t = startIndex;
            // 运算中间值
            int temp = 0;
            for (int j = arrayOfNumber1.length - 1; j >= 0; j--) {
                // 此处需要注意保存结果的数组上该下标处的值是存在的，别忘了加上原本位上的值
                temp = arrayOfNumber2[i] * arrayOfNumber1[j] + temp + array[t];
                array[t--] = (char) (temp % 10);
                temp = temp / 10;
            }
            // 解决计算完成最高位有进位的情况
            if (temp != 0) {
                array[t] += temp;
            }
        }
        return arrayToString(array);
    }

    /**
     * 将字符串转换成数组，减少在模拟乘法的时候的运算量
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
        // 此情况为处理0*0的情况
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