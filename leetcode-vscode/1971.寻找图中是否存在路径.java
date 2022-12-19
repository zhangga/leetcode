/*
 * @lc app=leetcode.cn id=1971 lang=java
 *
 * [1971] 寻找图中是否存在路径
 */

// @lc code=start
class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        if (source == destination) {
            return true;
        }
        UnionFind uf = new UnionFind(n);
        for (int[] edge : edges) {
            uf.uni(edge[0], edge[1]);
        }
        return uf.connect(source, destination);
    }
}

class UnionFind {
    private int[] parent;
    private int[] rank;

    public UnionFind(int n) {
        parent = new int[n];
        rank = new int[n];
        for (int i = 0; i < n; i++) {
            parent[i] = i;
        }
    }

    public void uni(int x, int y) {
        int rootx = find(x);
        int rooty = find(y);
        if (rootx != rooty) {
            if (rank[rootx] > rank[rooty]) {
                parent[rooty] = rootx;
            } else if (rank[rootx] < rank[rooty]) {
                parent[rootx] = rooty;
            } else {
                parent[rooty] = rootx;
                rank[rootx]++;
            }
        }
    }

    public int find(int x) {
        if (parent[x] != x) {
            parent[x] = find(parent[x]);
        }
        return parent[x];
    }

    public boolean connect(int x, int y) {
        return find(x) == find(y);
    }
}
// @lc code=end

