class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int area = Math.min(height[left], height[right]) * (right - left);
        while (left < right) {
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
            int t = Math.min(height[left], height[right]) * (right - left);
            area = area > t ? area : t;
        }
        return area;
    }
}