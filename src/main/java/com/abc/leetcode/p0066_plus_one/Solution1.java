/**
 * Leetcode - p0066_plus_one
 */
package com.abc.leetcode.p0066_plus_one;
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
    public int[] plusOne(int[] digits) {
        int i = digits.length - 1;
        digits[i] = digits[i] + 1;
        while (true) {
            if (digits[i] < 10)
                break;
            digits[i--] = 0;
            if (i < 0)
                break;
            digits[i] = digits[i] + 1;
        }

        if (i >= 0) {
            return digits;
        }
        int[] ret = new int[digits.length + 1];
        ret[0] = 1;
        return ret;
    }

}
