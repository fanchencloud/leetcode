import java.util.Arrays;
import java.util.HashMap;

public class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        if (nums1 == null || nums1 == null) {
            return new int[0];
        }
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        int[] t = null;
        int len = 0;
        if (nums1.length < nums2.length) {
            len = nums1.length;
            for (int i : nums1) {
                if (map.containsKey(i)) {
                    map.put(i, map.get(i) + 1);
                } else {
                    map.put(i, 1);
                }
            }
            t = nums2;
        } else {
            len = nums1.length;
            for (int i : nums2) {
                if (map.containsKey(i)) {
                    map.put(i, map.get(i) + 1);
                } else {
                    map.put(i, 1);
                }
            }
            t = nums1;
        }
        int[] res = new int[len];
        int index = 0;
        for (int i : t) {
            if (map.containsKey(i)) {
                res[index++] = i;
                map.put(i, map.get(i) - 1);
                if (map.get(i) == 0) {
                    map.remove(i);
                }
            }
        }
        return Arrays.copyOfRange(res, 0, index);
    }
}