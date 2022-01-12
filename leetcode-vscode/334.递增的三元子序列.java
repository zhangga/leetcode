/*
 * @lc app=leetcode.cn id=334 lang=java
 *
 * [334] 递增的三元子序列
 */

// @lc code=start
class Solution {
    public boolean increasingTriplet(int[] nums) {
        int n = nums.length;
        long[] f = new long[3];
        f[1] = f[2] = (int)1e19;
        for (int i = 0; i < n; i++) {
            int t = nums[i];
            if (f[2] < t) return true;
            else if (f[1] < t && t < f[2]) f[2] = t;
            else if (f[1] > t) f[1] = t;
        }
        return false;
    }
}
// @lc code=end

