/*
 * @lc app=leetcode.cn id=1374 lang=java
 *
 * [1374] 生成每种字符都是奇数个的字符串
 */

// @lc code=start
class Solution {
    public String generateTheString(int n) {
        StringBuilder sb = new StringBuilder();
        if (n % 2 == 1) {
            return sb.append("a".repeat(n)).toString();
        }
        return sb.append("a".repeat(n - 1)).append("b").toString();
    }
}
// @lc code=end

