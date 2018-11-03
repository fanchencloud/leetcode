import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        // 对两个数组进行排序
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        // 创建保存结果的数组
        HashSet<Integer> set = new HashSet<>();
        // 开始遍历数组
        int i = 0, j = 0, k = 0;
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] == nums2[j]) {
                set.add(nums1[i]);
                i++;
                j++;
            } else if (nums1[i] < nums2[j]) {
                i++;
            } else {
                j++;
            }
        }
        // 复制数组
        int[] array = new int[set.size()];
        Iterator<Integer> iterator = set.iterator();
        while (iterator.hasNext()) {
            array[k++] = iterator.next();
        }
        return array;
    }
}