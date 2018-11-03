class Solution {
    public int numJewelsInStones(String J, String S) {
        // 宝石数量
        int sum = 0;
        if (J == null || S == null) {
            return sum;
        }
        byte[] array = new byte[123];
        for (int i = 0; i < J.length(); i++) {
            array[J.charAt(i)] = 1;
        }
        for (int i = 0; i < S.length(); i++) {
            if (array[S.charAt(i)] == 1) {
                sum++;
            }
        }
        return sum;
    }
}