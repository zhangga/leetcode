import java.util.ArrayDeque;
import java.util.Deque;

/*
 * @lc app=leetcode.cn id=851 lang=java
 *
 * [851] 喧闹和富有
 */

// @lc code=start
class Solution {
    public int[] loudAndRich(int[][] richer, int[] quiet) {
        int n = quiet.length;
        int[][] w = new int[n][n];
        int[] in = new int[n];
        for (int[] r : richer) {
            int a = r[0], b = r[1];
            w[a][b] = 1; in[b]++;
        }
        Deque<Integer> d = new ArrayDeque<>();
        int[] ans = new int[n];
        for (int i = 0; i < n; i++) {
            ans[i] = i;
            if (in[i] == 0) d.addLast(i);
        }
        while (!d.isEmpty()) {
            int t = d.pollFirst();
            for (int u = 0; u < n; u++) {
                if (w[t][u] == 1) {
                    if (quiet[ans[t]] < quiet[ans[u]]) ans[u] = ans[t];
                    if (--in[u] == 0) d.addLast(u);
                }
            }
        }
        return ans;
    }
}
// @lc code=end

