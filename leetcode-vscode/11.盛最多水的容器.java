/*
 * @lc app=leetcode.cn id=11 lang=java
 *
 * [11] 盛最多水的容器
 */

// @lc code=start
class Solution {
    public int maxArea(int[] height) {
        if (height.length < 2) {
            return 0;
        }

        int maxArea = 0, area = 0;
        int left = 0, right = height.length - 1;
        while (left < right) {
            if (height[left] <= height[right]) {
                area = height[left] * (right - left);
                left++;
            } else {
                area = height[right] * (right - left);
                right--;
            }
            if (area > maxArea) {
                maxArea = area;
            }
        }
        return maxArea;
    }
}
// @lc code=end

