/*
 * @lc app=leetcode.cn id=49 lang=java
 *
 * [49] 字母异位词分组
 */

// @lc code=start

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for (String str : strs) {
            if (str.length() == 0) {
                map.computeIfAbsent(str, k -> new ArrayList<>()).add(str);
                continue;
            }
            byte[] bytes = str.getBytes();
            Arrays.sort(bytes);
            String ns = new String(bytes);
            map.computeIfAbsent(ns, k -> new ArrayList<>()).add(str);
        }
        List<List<String>> ret = new ArrayList<>(map.size());
        for (Entry<String, List<String>> entry : map.entrySet()) {
            ret.add(entry.getValue());
        }
        return ret;
    }
}
// @lc code=end

