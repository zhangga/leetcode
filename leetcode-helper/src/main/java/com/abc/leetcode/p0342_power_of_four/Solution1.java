/**
 * Leetcode - p0342_power_of_four
 */
package com.abc.leetcode.p0342_power_of_four;
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
    public boolean isPowerOfFour(int num) {
        if (num < 1)
            return false;
        while (num > 1) {
            int p = num >>> 2;
            int q = p << 2;
            if (q != num) {
                return false;
            }
            num = p;
        }
        return true;
    }

}
