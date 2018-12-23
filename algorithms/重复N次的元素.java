import java.util.HashSet;

class Solution {
    public int repeatedNTimes(int[] array) {
        HashSet<Integer> set = new HashSet<Integer>();
        for (int num : array) {
            if (set.contains(num)) {
                return num;
            } else {
                set.add(num);
            }
        }
        return -1;
    }
}