/**
 * Created by handsome programmer.
 * User: chen
 * Date: 2020/3/13
 * Time: 19:09
 * Description:
 *
 * @author chen
 */
public class Solution {
    public int majorityElement(final int[] nums) {
        final int length = nums.length;
        quickSort(nums, 0, length - 1);
        final int result = nums[length >> 1];
        return result;
    }

    /**
     * 快速排序
     *
     * @param array 待排序数组
     * @param left  左边界
     * @param right 右边界
     */
    public static void quickSort(final int[] array, final int left, final int right) {
        if (left > right) {
            return;
        }
        // 设定基准数
        final int temp = array[left];
        // 设置哨兵
        int i = left;
        int j = right;
        while (i != j) {
            // 顺序很重要，要想从右往左找
            while (array[j] >= temp && i < j) {
                j--;
            }
            // 再从左往右找
            while (array[i] <= temp && i < j) {
                i++;
            }
            // 交换两个哨兵在数组中的位置
            // 两个哨兵没有相遇
            if (i < j) {
                final int t = array[i];
                array[i] = array[j];
                array[j] = t;
            }
        }
        // 最终将基准数归位
        array[left] = array[i];
        array[i] = temp;
        // 继续处理左边的，这是一个递归的过程
        quickSort(array, left, i - 1);
        // 继续处理右边的，这是一个递归的过程
        quickSort(array, i + 1, right);
    }

    public static void main(final String[] args) {
        final int[] array = { 2, 2, 1, 1, 1, 2, 2 };
        final Solution s = new Solution();
        final int majorityElement = s.majorityElement(array);
        System.out.println(majorityElement);
    }
}