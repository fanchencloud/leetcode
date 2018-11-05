class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums == null) {
            return 0;
        }
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            int j = i;
            while (j < nums.length && nums[j] == nums[i]) {
                j++;
            }
        }
        return sum;
    }

    public static void swap(int[] array, int i, int j) {
        array[i] = array[i] ^ array[j];
        array[j] = array[i] ^ array[j];
        array[i] = array[i] ^ array[j];
    }
}