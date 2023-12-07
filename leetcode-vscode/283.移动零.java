/*
 * @lc app=leetcode.cn id=283 lang=java
 *
 * [283] 移动零
 */

// @lc code=start
class Solution {
    public void moveZeroes(int[] nums) {
        int index = 0;
        // 把非0的元素移动到最前面
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                continue;
            }
            if (i != index) {
                nums[index] = nums[i];
            }
            index++;
        }
        // 剩下的填0
        for (; index < nums.length; index++) {
            nums[index] = 0;
        }
    }
}
// @lc code=end

