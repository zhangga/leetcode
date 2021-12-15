/**
 * Leetcode - p0231_power_of_two
 */
package com.abc.leetcode.p0231_power_of_two;
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
    public boolean isPowerOfTwo(int n) {
        if (n < 1)
            return false;
        while (n > 1) {
            int p = n >>> 1;
            int q = p << 1;
            if (q != n) {
                return false;
            }
            n = p;
        }
        return true;
    }

}
