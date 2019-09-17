/**
 * Leetcode - p0347_top_k_frequent
 */
package com.abc.leetcode.p0347_top_k_frequent;
import java.util.*;
import com.ciaoshen.leetcode.util.*;

/** 
 * 堆
 */
class Solution1 implements Solution {

    @Override
    public List<Integer> topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // 小->大
        PriorityQueue<Integer> queue = new PriorityQueue<>(k, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return map.get(o1) - map.get(o2);
            }
        });

        for (Integer key : map.keySet()) {
            if (queue.size() < k) {
                queue.add(key);
            }
            else {
                int count = map.get(queue.peek());
                if (count < map.get(key)) {
                    queue.poll();
                    queue.add(key);
                }
            }
        }
        return new ArrayList<>(queue);
    }

}
