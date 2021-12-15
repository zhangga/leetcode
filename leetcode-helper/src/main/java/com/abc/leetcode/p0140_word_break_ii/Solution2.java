/**
 * Leetcode - p0140_word_break_ii
 */
package com.abc.leetcode.p0140_word_break_ii;
import java.util.*;
import com.ciaoshen.leetcode.util.*;

/** 
 * 记忆化回溯
 */
class Solution2 implements Solution {

    private Map<Integer, List<String>> map = new HashMap<>();

    @Override
    public List<String> wordBreak(String s, List<String> wordDict) {
        return word_break(s, new HashSet<>(wordDict), 0);
    }

    private List<String> word_break(String s, Set<String> wordDict, int start) {
        if (map.containsKey(start)) {
            return map.get(start);
        }
        LinkedList<String> res = new LinkedList<>();
        if (start == s.length()) {
            res.add("");
        }
        for (int end = start + 1; end <= s.length(); end++) {
            String sub = s.substring(start, end);
            if (wordDict.contains(sub)) {
                List<String> list = word_break(s, wordDict, end);
                for (String str : list) {
                    res.addFirst(s.substring(start, end) + (str.equals("") ? "" : " ") + str);
                }
            }
        }
        map.put(start, res);
        return res;
    }

}
