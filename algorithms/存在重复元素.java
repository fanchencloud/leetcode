import java.util.HashSet;
class Solution {
    public boolean containsDuplicate(int[] nums) {
        if (nums == null) {
            return false;
        }
        HashSet<Integer> set = new HashSet<Integer>();
        for (int number : nums) {
            if ((set.contains(number))) {
                return true;
            } else {
                set.add(number);
            }
        }
        return false;
    }
}