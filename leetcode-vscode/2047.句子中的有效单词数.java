/*
 * @lc app=leetcode.cn id=2047 lang=java
 *
 * [2047] 句子中的有效单词数
 */

// @lc code=start
class Solution {
    public int countValidWords(String sentence) {
        String[] ss = sentence.split(" ");
        int ans = 0;
        for (String s : ss) if (check(s)) ans++;
        return ans;
    }
    boolean check(String s) {
        int n = s.length();
        if (n == 0) return false;
        for (int i = 0, c1 = 0, c2 = 0; i < n; i++) {
            char c = s.charAt(i);
            if (Character.isDigit(c)) return false;
            if (c == ' ') return false;
            if (c == '-' && ++c1 >= 0) {
                if (c1 > 1 || (i == 0 || i == n - 1)) return false;
                if (!Character.isLetter(s.charAt(i - 1)) || !Character.isLetter(s.charAt(i + 1))) return false;
            }
            if ((c == '!' || c == '.' || c == ',') && ++c2 >= 0) {
                if (c2 > 1 || (i != n - 1)) return false;
            }
        }
        return true;
    }
}
// @lc code=end

