/*
 * @lc app=leetcode.cn id=747 lang=java
 *
 * [747] 至少是其他数字两倍的最大数
 */

// @lc code=start
class Solution {
    public int dominantIndex(int[] nums) {
        int max = -1, maxIndex = 0, second = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                if (max != -1) {
                    second =  max;
                }
                max = nums[i];
                maxIndex = i;
            } else if (nums[i] > second) {
                second = nums[i];
            }
        }
        return max >= 2*second ? maxIndex : -1;
    }
}
// @lc code=end

