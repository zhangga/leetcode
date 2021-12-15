/**
 * Leetcode - p0162_find_peak_element
 */
package com.abc.leetcode.p0162_find_peak_element;
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
    public int findPeakElement(int[] nums) {
        int i = 0, j = nums.length-1;
        while (i < j) {
            if (nums[i] > nums[j])
                j--;
            else
                i++;
        }
        return i;
    }

}
