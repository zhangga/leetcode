/**
 * Leetcode - p0239_sliding_window_maximum
 */
package com.abc.leetcode.p0239_sliding_window_maximum;
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
class Solution1 implements Solution {

    @Override
    public int[] maxSlidingWindow(int[] nums, int k) {
        if (nums.length == 0)
            return new int[0];

        int[] res = new int[nums.length-k+1];

        PriorityQueue<Integer> heap = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
        });

        Map<Integer, Integer> count = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            heap.add(nums[i]);
            if (i >= k) {
                int num = nums[i-k];
                count.put(num, count.getOrDefault(num, 0)+1);
            }

            if (i >= k-1) {
                int index = i-k+1;
                while (count.containsKey(heap.peek())) {
                    int max = heap.poll();
                    int c = count.get(max);
                    if (c == 1)
                        count.remove(max);
                    else
                        count.put(max, c-1);
                }
                res[index] = heap.peek();
            }
        }

        return res;
    }

}
