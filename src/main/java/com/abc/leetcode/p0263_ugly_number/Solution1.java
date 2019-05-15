/**
 * Leetcode - p0263_ugly_number
 */
package com.abc.leetcode.p0263_ugly_number;
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
    public boolean isUgly(int num) {
        if (num == 0) {
            return false;
        }
        if (num > 0 && num < 7) {
            return true;
        }
        while (num != 1) {
            if (num % 2 == 0) {
                num = num >> 1;
            }
            else if (num % 3 == 0) {
                num /= 3;
            }
            else if (num % 5 == 0) {
                num /= 5;
            }
            else {
                return false;
            }
        }
        return true;
    }

}
