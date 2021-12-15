/**
 * Leetcode - p0140_word_break_ii
 */
package com.abc.leetcode.p0140_word_break_ii;
import java.util.*;
import com.ciaoshen.leetcode.util.*;

/** 
 * 暴力解法
 */
class Solution1 implements Solution {

    @Override
    public List<String> wordBreak(String s, List<String> wordDict) {
        Set<String> dict = new HashSet<>(wordDict);
        return work_break(s, 0 , dict);
    }

    private List<String> work_break(String s, int start, Set<String> wordDict) {
        LinkedList<String> res = new LinkedList<>();
        if (start == s.length()) {
            res.add("");
        }
        for (int end = start + 1; end <= s.length(); end++) {
            String sub = s.substring(start, end);
            if (wordDict.contains(sub)) {
                List<String> list = work_break(s, end, wordDict);
                for (String str : list) {
                    res.addFirst(sub + (str.equals("") ? "" : " ") + str);
                }
            }
        }
        return res;
    }

}
