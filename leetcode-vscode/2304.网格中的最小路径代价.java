/*
 * @lc app=leetcode.cn id=2304 lang=java
 *
 * [2304] 网格中的最小路径代价
 */

// @lc code=start
class Solution {
    public int minPathCost(int[][] grid, int[][] moveCost) {
        int m = grid.length, n = grid[0].length, INF = 0x3f3f3f3f, ans = INF;
        for (int i = m - 2; i >= 0; i--) {
            for (int j = 0; j < n; j++) {
                int cur = INF;
                for (int k = 0; k < n; k++) cur = Math.min(cur, grid[i + 1][k] + moveCost[grid[i][j]][k]);
                grid[i][j] += cur;
            }
        }
        for (int i = 0; i < n; i++) ans = Math.min(ans, grid[0][i]);
        return ans;
    }
}
// @lc code=end

