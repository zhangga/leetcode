/*
 * @lc app=leetcode.cn id=2656 lang=java
 *
 * [2656] K 个元素的最大和
 */

// @lc code=start
class Solution {
    public int maximizeSum(int[] nums, int k) {
        int max = Integer.MIN_VALUE;
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                index = i;
                max = nums[i];
            }
        }
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += max;
            nums[index] = ++max;
        }
        return sum;
    }
}
// @lc code=end

