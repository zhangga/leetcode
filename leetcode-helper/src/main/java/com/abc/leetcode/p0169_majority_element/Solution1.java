/**
 * Leetcode - p0169_majority_element
 */
package com.abc.leetcode.p0169_majority_element;
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
    public int majorityElement(int[] nums) {
        int count = 0;
        int major = 0;
        for (int num : nums) {
            if (count == 0) {
                major = num;
            }
            if (num == major)
                count++;
            else
                count--;
        }
        return major;
    }
}
