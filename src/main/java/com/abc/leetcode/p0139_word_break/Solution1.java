/**
 * Leetcode - p0139_word_break
 */
package com.abc.leetcode.p0139_word_break;
import java.util.*;
import com.ciaoshen.leetcode.util.*;

/** 
 * 暴力解法
 */
class Solution1 implements Solution {

    @Override
    public boolean wordBreak(String s, List<String> wordDict) {
        return word_break(s, new HashSet<>(wordDict), 0);
    }

    private boolean word_break(String s, Set<String> wordDict, int start) {
        if (start == s.length()) {
            return true;
        }
        for (int end = start + 1; end <= s.length(); end++) {
            String sub = s.substring(start, end);
            if (wordDict.contains(sub) && word_break(s, wordDict, end)) {
                return true;
            }
        }
        return false;
    }

}
