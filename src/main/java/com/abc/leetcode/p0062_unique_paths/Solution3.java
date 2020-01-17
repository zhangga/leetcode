/**
 * Leetcode - p0062_unique_paths
 */
package com.abc.leetcode.p0062_unique_paths;

/**
 * 不同路径
 * 动态规划：当 m,n>1 时f(m,n) = f(m-1, n) + f(m, n-1)  ， f(1, n) = f(m,1)=1 。时间复杂度：O(mn)
 */
class Solution3 implements Solution {

    @Override
    public int uniquePaths(int m, int n) {
        int[] dp = new int[n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (j == 0) {
                    dp[j] = 1;
                }
                else {
                    dp[j] += dp[j-1];
                }
            }
        }
        return dp[n-1];
    }

}
