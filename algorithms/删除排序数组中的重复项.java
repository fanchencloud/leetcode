// class Solution {
//     public int removeDuplicates(int[] nums) {
//         if (nums == null) {
//             return 0;
//         }
//         int sum = 0;
//         // 0 0 1 1 1 2 2 3 4 4
//         for (int i = 0; i < nums.length; i++) {
//             int j = i;
//             while (j < nums.length && nums[j] == nums[i]) {
//                 j++;
//             }
//         }
//         return sum;
//     }

//     public static void swap(int[] array, int i, int j) {
//         array[i] = array[i] ^ array[j];
//         array[j] = array[i] ^ array[j];
//         array[i] = array[i] ^ array[j];
//     }
// }    

class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int index = 1;
        int temp = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != temp) {
                nums[index++] = nums[i];
                temp = nums[i];
            }
        }
        return index;
    }
}