/**
 * Leetcode - p0347_top_k_frequent
 */
package com.abc.leetcode.p0347_top_k_frequent;
import java.util.*;
import com.ciaoshen.leetcode.util.*;

/** 
 * log instance is defined in Solution interface
 * this is how slf4j will work in this class:
 * =============================================
 *     if (log.isDebugEnabled()) {
 *         log.debug("a + b = {}", sum);
 *     }
 * =============================================
 */
class Solution2 implements Solution {

    @Override
    public List<Integer> topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        List<Integer>[] lists = new List[nums.length];
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (lists[entry.getValue()-1] == null) {
                lists[entry.getValue()-1] = new ArrayList<>();
            }
            lists[entry.getValue()-1].add(entry.getKey());
        }

        List<Integer> list = new ArrayList<>();
        for (int i = lists.length-1; i >=0; i--) {
            if (lists[i] != null) {
                for (int n : lists[i]) {
                    list.add(n);
                    if (list.size() == k)
                        return list;
                }
            }
        }
        return list;
    }

}
