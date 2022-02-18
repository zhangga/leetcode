/*
 * @lc app=leetcode.cn id=1791 lang=java
 *
 * [1791] 找出星型图的中心节点
 */

// @lc code=start
class Solution {
    public int findCenter(int[][] edges) {
        int center1 = 0, center2 = 0;
        for (int[] edge : edges) {
            if (center1 == 0) {
                center1 = edge[0];
                center2 = edge[1];
                continue;
            }
            if (edge[0] == center1 || edge[1] == center1) {
                return center1;
            }
            if (edge[0] == center2 || edge[1] == center2) {
                return center2;
            }
        }
        return 0;
    }
}
// @lc code=end

