/*
 * @lc app=leetcode.cn id=1334 lang=java
 *
 * [1334] 阈值距离内邻居最少的城市
 */

// @lc code=start

import java.util.Arrays;

class Solution {
    public int findTheCity(int n, int[][] edges, int distanceThreshold) {
        int[][] g = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                g[i][j] = i == j ? 0 : 0x3f3f3f3f;
            }
        }
        int a, b, w;
        for (int[] e : edges) {
            a = e[0];
            b = e[1];
            w = e[2];
            g[a][b] = Math.min(g[a][b], w);
            g[b][a] = g[a][b];
        }
        int ans = -1, cnt = n + 10;
        for (int i = 0; i < n; i++) {
            int[] dist = dijkstra(g, i);
            int cur = 0;
            for (int j = 0; j < n; j++) {
                if (i != j && dist[j] <= distanceThreshold) cur++;
            }
            if (cur <= cnt) {
                cnt = cur; ans = i;
            }
        }
        return ans;
    }

    int[] dijkstra(int[][] g, int x) {
        int n = g.length;
        boolean[] vis = new boolean[n];
        int[] dist = new int[n];
        Arrays.fill(dist, 0x3f3f3f3f);
        dist[x] = 0;
        for (int k = 0; k < n; k++) {
            int t = -1;
            for (int i = 0; i < n; i++) {
                if (!vis[i] && (t == -1 || dist[i] < dist[t])) {
                    t = i;
                }
            }
            vis[t] = true;
            for (int i = 0; i < n; i++) {
                dist[i] = Math.min(dist[i], dist[t] + g[t][i]);
            }
        }
        return dist;
    }
}
// @lc code=end

