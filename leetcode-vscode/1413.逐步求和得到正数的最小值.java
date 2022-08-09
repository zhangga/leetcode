/*
 * @lc app=leetcode.cn id=1413 lang=java
 *
 * [1413] 逐步求和得到正数的最小值
 */

// @lc code=start
class Solution {
    public int minStartValue(int[] nums) {
        int n = nums.length, min = 0x3f3f3f3f;
        for (int i = 0, j = 1; i < n; i++) {
            j = j + nums[i];
            min = Math.min(min, j);
        }
        return min < 1 ? 2 - min : 1;
    }
}
// @lc code=end

