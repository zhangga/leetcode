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
class Solution2 implements Solution {

    @Override
    public boolean isPowerOfTwo(int n) {
        return n < 1 ? false : ((n-1) & n) == 0;
    }

}
