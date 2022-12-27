/*
 * @lc app=leetcode.cn id=2027 lang=java
 *
 * [2027] 转换字符串的最少操作次数
 */

// @lc code=start
class Solution {
    public int minimumMoves(String s) {
        int ans = 0;
        for (int i = 0; i < s.length(); ++i) {
            if (s.charAt(i) == 'X') {
                ++ans;
                i += 2;
            }
        }
        return ans;
    }
}
// @lc code=end

