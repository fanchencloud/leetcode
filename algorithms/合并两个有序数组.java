class Solution {
    /**
     * 给定两个有序整数数组 nums1 和 nums2，将 nums2 合并到 nums1 中，使得 num1 成为一个有序数组。
     * nums1 有足够的空间（空间大小大于或等于 m + n）来保存 nums2 中的元素。
     *
     * @param nums1 数组1
     * @param m     数组1中存储的元素个数
     * @param nums2 数组2
     * @param n     数组2中存储的元素个数
     */
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // 数组开始下标
        int index = m + n - 1;
        int i = m - 1;
        int j = n - 1;
        while (i >= 0 && j >= 0) {
            if (nums1[i] > nums2[j]) {
                // 数组1中的数比数组2中的大
                nums1[index] = nums1[i];
                i--;
            } else {
                // 数组2中的数比数组1中的大
                nums1[index] = nums2[j];
                j--;
            }
            index--;
        }
        while (i >= 0) {
            nums1[index--] = nums1[i--];
        }
        while (j >= 0) {
            nums1[index--] = nums2[j--];
        }
    }
}