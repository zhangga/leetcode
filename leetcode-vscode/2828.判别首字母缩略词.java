/*
 * @lc app=leetcode.cn id=2828 lang=java
 *
 * [2828] 判别首字母缩略词
 */

// @lc code=start

import java.util.List;

class Solution {
    public boolean isAcronym(List<String> words, String s) {
        if (words.size() != s.length()) {
            return false;
        }
        for (int i = 0; i < words.size(); i++) {
            if (words.get(i).charAt(0) != s.charAt(i)) {
                return false;
            }
        }
        return true;
    }
}
// @lc code=end

