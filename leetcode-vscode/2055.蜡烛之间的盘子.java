/*
 * @lc app=leetcode.cn id=2055 lang=java
 *
 * [2055] 蜡烛之间的盘子
 */

// @lc code=start
class Solution {
    public int[] platesBetweenCandles(String s, int[][] qs) {
        char[] cs = s.toCharArray();
        int n = cs.length, m = qs.length;
        int[] l = new int[n], r = new int[n];
        int[] sum = new int[n + 1];
        for (int i = 0, j = n - 1, p = -1, q = -1; i < n; i++, j--) {
            if (cs[i] == '|') p = i;
            if (cs[j] == '|') q = j;
            l[i] = p; r[j] = q;
            sum[i + 1] = sum[i] + (cs[i] == '*' ? 1 : 0);
        }
        int[] ans = new int[m];
        for (int i = 0; i < m; i++) {
            int a = qs[i][0], b = qs[i][1];
            int c = r[a], d = l[b];
            if (c != -1 && c <= d) ans[i] = sum[d + 1] - sum[c];
        }
        return ans;
    }
}
// @lc code=end

