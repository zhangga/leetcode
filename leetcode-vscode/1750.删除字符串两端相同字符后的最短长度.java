/*
 * @lc app=leetcode.cn id=1750 lang=java
 *
 * [1750] 删除字符串两端相同字符后的最短长度
 */

// @lc code=start
class Solution {
    public int minimumLength(String s) {
        int n = s.length();
        int left = 0, right = n - 1;
        while (left < right && s.charAt(left) == s.charAt(right)) {
            char c = s.charAt(left);
            while (left <= right && s.charAt(left) == c) {
                left++;
            }
            while (left <= right && s.charAt(right) == c) {
                right--;
            }
        }
        return right - left + 1;
    }
}
// @lc code=end

