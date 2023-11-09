/*
 * @lc app=leetcode.cn id=2258 lang=java
 *
 * [2258] 逃离火灾
 */

// @lc code=start

import java.util.ArrayDeque;
import java.util.Deque;

class Solution {
    int[][] dirs = new int[][]{{0,1}, {0,-1}, {1,0}, {-1,0}};
    int[][] g;
    int n, m;

    public int maximumMinutes(int[][] grid) {
        g = grid;
        n = g.length; m = g[0].length;
        int[][] fg = new int[n][m], pg = new int[n][m];
        Deque<int[]> fire = new ArrayDeque<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (g[i][j] == 1) {
                    fg[i][j] = 1;
                    fire.addLast(new int[]{i, j});
                }
            }
        }
        bfs(fire, fg);
        Deque<int[]> people = new ArrayDeque<>();
        people.addLast(new int[]{0, 0});
        pg[0][0] = 1;
        bfs(people, pg);
        int p = pg[n - 1][m - 1], f = fg[n - 1][m - 1], ans = f - p;
        if (p == 0) return -1;
        if (f == 0) return (int)1e9;
        if (p > f) return -1;
        if (pg[n - 1][m - 2] != 0 && ans + pg[n - 1][m - 2] < fg[n - 1][m - 2]) return ans;
        if (pg[n - 2][m - 1] != 0 && ans + pg[n - 2][m - 1] < fg[n - 2][m - 1]) return ans;
        return ans - 1;
    }

    void bfs(Deque<int[]> d, int[][] time) {
        while (!d.isEmpty()) {
            int[] info = d.pollFirst();
            int x = info[0], y = info[1];
            for (int[] dir : dirs) {
                int nx = x + dir[0], ny = y + dir[1];
                if (nx < 0 || nx >= n || ny < 0 || ny >= m) continue;
                if (g[nx][ny] == 2) continue;
                if (time[nx][ny] != 0) continue;
                time[nx][ny] = time[x][y] + 1;
                d.addLast(new int[]{nx, ny});
            }
        }
    }
}
// @lc code=end

