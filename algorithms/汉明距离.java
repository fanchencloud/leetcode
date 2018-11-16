class Solution {
    /**
     * 两个整数之间的汉明距离指的是这两个数字对应二进制位不同的位置的数目。
     * 给出两个整数 x 和 y，计算它们之间的汉明距离。
     *
     * @param x 数字1
     * @param y 数字2
     * @return 两个数字的汉明距离
     */
    public int hammingDistance(int x, int y) {
        StringBuilder sb = new StringBuilder();
        sb.append(Integer.toBinaryString(x));
        sb = sb.reverse();
        for (int i = 32 - sb.length(); i > 0; i--) {
            sb.append(0);
        }
        char[] arrayOfNumber1 = sb.reverse().toString().toCharArray();

        sb.delete(0, sb.length());
        sb.append(Integer.toBinaryString(y));
        sb = sb.reverse();
        for (int i = 32 - sb.length(); i > 0; i--) {
            sb.append(0);
        }

        char[] arrayOfNumber2 = sb.reverse().toString().toCharArray();
        sb = null;
        int index = 0;
        for (int i = 0; i < 32; i++) {
            if (arrayOfNumber1[i] != arrayOfNumber2[i]) {
                index++;
            }
        }
        return index;
    }
}