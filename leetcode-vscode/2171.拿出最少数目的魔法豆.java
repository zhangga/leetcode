/*
 * @lc app=leetcode.cn id=2171 lang=java
 *
 * [2171] 拿出最少数目的魔法豆
 */

// @lc code=start

import java.util.Arrays;

class Solution {
    public long minimumRemoval(int[] beans) {
        int n = beans.length;
        Arrays.sort(beans);
        // 后缀和
        long totalSum = 0;
        for (int b : beans) {
            totalSum += b;
        }
        long ans = totalSum;
        for (int i = 0; i < n; i++) {
            // 每次要将数组中的元素变成beans[i]，比beans[i]小的魔法豆全都拿走，即为前缀和
            // 比beans[i]大的魔法豆要变成beans[i]，即为后缀和 - beans[i] * (n - i - 1)
            ans = Math.min(ans, totalSum - (long)beans[i] * (n - i));
        }
        return ans;
    }
}
// @lc code=end

