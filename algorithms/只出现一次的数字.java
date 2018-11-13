/**
 * 在此题中出了唯一的一个元素只出现一次，其余元素均出现两次是一个关键点
 * 任意数和0异或都是该数本身
 * 相同的两个数异或结果为0
 * 如果 a==b c!=b
 * 则有 a^b^c <==> 0^c <==> c
 */
public class Solution {
    public int singleNumber(int[] nums) {
        int num = 0;
        for (int i : nums) {
            num = num ^ i;
        }
        return num;
    }
}