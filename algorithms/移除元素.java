class Solution {
    public int removeElement(int[] nums, int val) {
         int index = 0;
         for (int i = 0; i < nums.length; i++) {
             if (index != i && nums[i] != val) {
                 nums[index] = nums[i];
                 nums[i] = val;
                 index++;
             }
             if (nums[index] != val) {
                 index++;
             }
         }
         return index;
     }
 }