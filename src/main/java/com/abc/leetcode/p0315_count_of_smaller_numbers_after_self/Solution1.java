/**
 * Leetcode - p0315_count_of_smaller_numbers_after_self
 */
package com.abc.leetcode.p0315_count_of_smaller_numbers_after_self;
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
    public List<Integer> countSmaller(int[] nums) {
        if (nums == null)
            return null;
        List<Integer> list = new ArrayList<>();
        int n = 0;
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            n = nums[i];
            count = 0;
            for (int j = i+1; j < nums.length; j++) {
                if (nums[j] < n) {
                    count++;
                }
            }
            list.add(count);
        }
        return list;
    }

}
