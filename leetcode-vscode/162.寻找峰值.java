/*
 * @lc app=leetcode.cn id=162 lang=java
 *
 * [162] 寻找峰值
 */

// @lc code=start
class Solution {
    public int findPeakElement(int[] nums) {
        int maxNum = 0;
        int maxIndex = -1;
        for (int i = 0; i < nums.length; i++) {
            if (maxIndex == -1) {
                maxIndex = 0;
                maxNum = nums[i];
            } else if (nums[i] > maxNum) {
                maxIndex = i;
                maxNum = nums[i];
            }
        }
        return maxIndex;
    }
}
// @lc code=end

