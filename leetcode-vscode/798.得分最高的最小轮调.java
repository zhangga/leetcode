import java.util.Arrays;

/*
 * @lc app=leetcode.cn id=798 lang=java
 *
 * [798] 得分最高的最小轮调
 */

// @lc code=start
class Solution {
    static int N = 100010;
    static int[] c = new int[N];
    void add(int l, int r) {
        c[l] += 1; c[r + 1] -= 1;
    }
    public int bestRotation(int[] nums) {
        Arrays.fill(c, 0);
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            int a = (i - (n - 1) + n) % n, b = (i - nums[i] + n) % n;
            if (a <= b) {
                add(a, b);
            } else {
                add(0, b);
                add(a, n - 1);
            }
        }
        for (int i = 1; i <= n; i++) c[i] += c[i - 1];
        int ans = 0, k = c[0];
        for (int i = 1; i <= n; i++) {
            if (c[i] > k) {
                k = c[i]; ans = i;
            }
        }
        return ans;
    }
}
// @lc code=end

