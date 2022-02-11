import java.util.Arrays;

/*
 * @lc app=leetcode.cn id=1984 lang=java
 *
 * [1984] 学生分数的最小差值
 */

// @lc code=start
class Solution {
    public int minimumDifference(int[] nums, int k) {
        if (k <= 1) {
            return 0;
        }
        Arrays.sort(nums);
        int min = 100000, n = nums.length;
        for (int i = 0; i <= n-k; i++) {
            min = Math.min(min, nums[i+k-1] - nums[i]);
        }
        return min;
    }
}
// @lc code=end

