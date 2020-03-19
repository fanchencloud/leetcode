/**
 * Created by handsome programmer.
 * User: chen
 * Date: 2020/3/19
 * Time: 13:19
 * Description:
 *
 * @author chen
 */
public class Solution {
    public int longestPalindrome(String s) {
        // 生成58个空间的数组，用于保存数据
        int[] array = new int[58];
        for (int i = 0; i < s.length(); i++) {
            array[s.charAt(i) - 'A']++;
        }
        int result = 0;
        for (int num :
                array) {
            result += (num - (num & 1));
        }
        if (result < s.length()) {
            result++;
        }
        return result;
    }
}
