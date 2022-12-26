/*
 * @lc app=leetcode.cn id=1759 lang=java
 *
 * [1759] 统计同构子字符串的数目
 */

// @lc code=start
class Solution {
    private static final int MOD = (int) 1e9 + 7;
    
    public int countHomogenous(String s) {
        int n = s.length();
        long ans = 0;
        for (int i = 0, j = 0; i < n; i = j) {
            j = i;
            while (j < n && s.charAt(j) == s.charAt(i)) {
                ++j;
            }
            int cnt = j - i;
            ans += (long) (1 + cnt) * cnt / 2;
            ans %= MOD;
        }
        return (int) ans;
    }
}
// @lc code=end

