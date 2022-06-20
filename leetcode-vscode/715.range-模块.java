/*
 * @lc app=leetcode.cn id=715 lang=java
 *
 * [715] Range 模块
 */

// @lc code=start
class RangeModule {

    class Node {
        int ls, rs, sum, add;
    }
    int N = (int)1e9 + 10, M = 500010, cnt = 1;
    Node[] tr = new Node[M];
    void update(int u, int lc, int rc, int l, int r, int v) {
        int len = rc - lc + 1;
        if (l <= lc && rc <= r) {
            tr[u].sum = v == 1 ? len : 0;
            tr[u].add = v;
            return ;
        }
        pushdown(u, len);
        int mid = lc + rc >> 1;
        if (l <= mid) update(tr[u].ls, lc, mid, l, r, v);
        if (r > mid) update(tr[u].rs, mid + 1, rc, l, r, v);
        pushup(u);
    }
    int query(int u, int lc, int rc, int l, int r) {
        if (l <= lc && rc <= r) return tr[u].sum;
        pushdown(u, rc - lc + 1);
        int mid = lc + rc >> 1, ans = 0;
        if (l <= mid) ans = query(tr[u].ls, lc, mid, l, r);
        if (r > mid) ans += query(tr[u].rs, mid + 1, rc, l, r);
        return ans;
    }
    void pushdown(int u, int len) {
        if (tr[u] == null) tr[u] = new Node();
        if (tr[u].ls == 0) {
            tr[u].ls = ++cnt;
            tr[tr[u].ls] = new Node();
        }
        if (tr[u].rs == 0) {
            tr[u].rs = ++cnt;
            tr[tr[u].rs] = new Node();
        }
        if (tr[u].add == 0) return;
        if (tr[u].add == -1) {
            tr[tr[u].ls].sum = tr[tr[u].rs].sum = 0;
        } else {
            tr[tr[u].ls].sum = len - len / 2;
            tr[tr[u].rs].sum = len / 2;
        }
        tr[tr[u].ls].add = tr[tr[u].rs].add = tr[u].add;
        tr[u].add = 0;
    }
    void pushup(int u) {
        tr[u].sum = tr[tr[u].ls].sum + tr[tr[u].rs].sum;
    }
    public void addRange(int left, int right) {
        update(1, 1, N - 1, left, right - 1, 1);
    }
    public boolean queryRange(int left, int right) {
        return query(1, 1, N - 1, left, right - 1) == right - left;
    }
    public void removeRange(int left, int right) {
        update(1, 1, N - 1, left, right - 1, -1);
    }
}

/**
 * Your RangeModule object will be instantiated and called as such:
 * RangeModule obj = new RangeModule();
 * obj.addRange(left,right);
 * boolean param_2 = obj.queryRange(left,right);
 * obj.removeRange(left,right);
 */
// @lc code=end

