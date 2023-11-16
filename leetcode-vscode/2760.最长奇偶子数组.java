/*
 * @lc app=leetcode.cn id=2760 lang=java
 *
 * [2760] 最长奇偶子数组
 */

// @lc code=start
class Solution {
    public int longestAlternatingSubarray(int[] nums, int threshold) {
        int max = 0, i = 0;
        while (i < nums.length) {
            if (nums[i] > threshold || nums[i] % 2 != 0) {
                i++;
                continue;
            }
            boolean preEven = true;
            int len = 1, j = i+1;
            for (; j < nums.length; j++) {
                if (nums[j] > threshold || (nums[j] % 2 == 0) == preEven) {
                    break;
                }
                preEven = !preEven;
                len++;
            }
            i = j;
            if (len > max) {
                max = len;
            }
        }
        return max;
    }
}
// @lc code=end

