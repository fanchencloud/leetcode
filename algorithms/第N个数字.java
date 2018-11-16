class Solution {
    /**
     * 这里是找第n个数字(这里的数和数字有区别，数字可以理解为将所有数拼合成一个字符串后的第n为对应的数字（0-9)）
     * 这里首先分析一下位数和规律
     * 个位数：1-9，一共9个,共计9个数字
     * 2位数：10-99,一共90个，共计180个数字
     * 3位数：100-999，一共900个，共计270个数字
     * 4位数，1000-9999，一共9000个，共计36000个数字
     * 以此类推，
     * 这样我们就可以首先定位到是哪个数，再找到其对应的数字
     */
    public int findNthDigit(int n) {
        // 该阶段内所有数字的位数，从一位数开始
        int numberLength = 1;
        // 该阶段内所有的数字的个数‘
        int numberTotal = 9;
        // 该阶段内的数字的所有长度
        int numberTotalLength = numberLength * numberTotal;
        // 所求的位置数量大于目前阶段所有数的长度
        while (n > numberTotalLength) {
            // 索引位置减去该阶段所有数字的长度
            n -= numberTotalLength;
            // 数字长度加一
            numberLength++;
            // 该阶段内的数字总数改变
            numberTotal *= 10;

            //处理相乘越界的问题
            if ((Integer.MAX_VALUE / numberLength) > numberTotal) {
                // 该阶段内所有数字拼成字符串的长度
                numberTotalLength = numberLength * numberTotal;
            } else {
                break;
            }
        }
        // 计算所求的数是该阶段内的第几个数
        int index = (int) (n / (numberLength * 1.0) + 0.5);
        // 求该数字是哪个
        int number = (int) (Math.pow(10, (numberLength - 1))) + index - 1;
        // 求所求字符在该数字中的位置
        index = n % numberLength;
        if (index == 0) {
            index += numberLength;
        }
        // 将该数字转换成字符串
        return (number + "").charAt((index - 1)) - '0';
    }
}