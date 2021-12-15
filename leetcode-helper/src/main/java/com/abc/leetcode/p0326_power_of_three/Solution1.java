/**
 * Leetcode - p0326_power_of_three
 */
package com.abc.leetcode.p0326_power_of_three;
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
    public boolean isPowerOfThree(int n) {
        return n > 0 && 1162261467 % n == 0;
    }

}
