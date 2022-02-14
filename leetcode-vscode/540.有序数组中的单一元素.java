/*
 * @lc app=leetcode.cn id=540 lang=java
 *
 * [540] 有序数组中的单一元素
 */

// @lc code=start
class Solution {
    public int singleNonDuplicate(int[] nums) {
        int m = 0;
        int left = 0, right = nums.length - 1;
        while (true) {
            if (left == right) {
                return nums[left];
            }
            m = left + (right - left) / 2;
            if (nums[m] == nums[m-1]) {
                if (m % 2 == 0) {
                    right = m;
                } else {
                    left = m+1;
                }
            } else if (nums[m] == nums[m+1]) {
                if (m % 2 == 0) {
                    left = m;
                } else {
                    right = m-1;
                }
            } else {
                return nums[m];
            }
        }
    }
}
// @lc code=end

