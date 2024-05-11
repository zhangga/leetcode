/*
 * @lc app=leetcode.cn id=2744 lang=java
 *
 * [2744] 最大字符串配对数目
 */

// @lc code=start

import java.util.HashSet;
import java.util.Set;

class Solution {
    public int maximumNumberOfStringPairs(String[] words) {
        Set<Integer> exist = new HashSet<>();
        int count = 0;
        for (String word : words) {
            if (exist.remove((word.charAt(1) << 16 | word.charAt(0)))) {
                count++;
                continue;
            }
            exist.add((word.charAt(0) << 16 | word.charAt(1)));
        }
        return count;
    }
}
// @lc code=end

