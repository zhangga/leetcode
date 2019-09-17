/**
 * Leetcode - p0139_word_break
 */
package com.abc.leetcode.p0139_word_break;
import java.util.*;
import com.ciaoshen.leetcode.util.*;

/** 
 * 记忆化回溯
 */
class Solution2 implements Solution {

    @Override
    public boolean wordBreak(String s, List<String> wordDict) {
        return word_break(s, new HashSet<>(wordDict), 0, new Boolean[s.length()]);
    }

    private boolean word_break(String s, Set<String> wordDict, int start, Boolean[] memo) {
        if (start == s.length()) {
            return true;
        }
        if (memo[start] != null) {
            return memo[start];
        }
        for (int end = start + 1; end <= s.length(); end++) {
            String sub = s.substring(start, end);
            if (wordDict.contains(sub) && word_break(s, wordDict, end, memo)) {
                return memo[start] = true;
            }
        }
        return memo[start] = false;
    }

}
