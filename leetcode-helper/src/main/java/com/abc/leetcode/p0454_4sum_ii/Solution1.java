/**
 * Leetcode - p0454_4sum_ii
 */
package com.abc.leetcode.p0454_4sum_ii;
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
    public int fourSumCount(int[] A, int[] B, int[] C, int[] D) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int a : A) {
            for (int b : B) {
                int sum = a + b;
                map.put(sum, map.getOrDefault(sum, 0) + 1);
            }
        }
        int total = 0;
        for (int c : C) {
            for (int d : D) {
                int sum = -(c + d);
                total += map.getOrDefault(sum, 0);
            }
        }
        return total;
    }
}
