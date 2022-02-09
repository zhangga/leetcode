import java.util.Arrays;

/*
 * @lc app=leetcode.cn id=2006 lang=java
 *
 * [2006] 差的绝对值为 K 的数对数目
 */

// @lc code=start
class Solution {
    public int countKDifference(int[] nums, int k) {
        int[] counts = new int[101];
        int ret = 0;
        for (int i : nums) {
            counts[i]++;
            if (i - k >= 0 && i - k < counts.length) {
                ret += counts[i-k];
            }
            if (i + k >= 0 && i + k < counts.length) {
                ret += counts[i+k];
            }
        }
        return ret;
    }
}
// @lc code=end

