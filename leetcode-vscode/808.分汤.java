/*
 * @lc app=leetcode.cn id=808 lang=java
 *
 * [808] 分汤
 */

// @lc code=start
class Solution {
    public double soupServings(int n) {
        if(n > 4450)
        {
            return 1;
        }
    
        n = (int) Math.ceil(n / 25d);
        
        double[][] dp = new double[n + 1][n + 1];
        
        dp[0][0] = 0.5;
        
        for(int i = 1; i <= n; i++)
        {
            dp[0][i] = 1;
        }
        
        for(int i = 1; i <= n; i++)
        {
            for(int j = 1; j <= n; j++)
            {
                dp[i][j] = 0.25 * (dp[Math.max(0, i - 4)][j] + dp[Math.max(0, i - 3)][Math.max(0, j - 1)] + dp[Math.max(0, i - 2)][Math.max(0, j - 2)] + dp[Math.max(0, i - 1)][Math.max(0, j - 3)]);
            }
        }
        
        return dp[n][n];
    }
}
// @lc code=end

