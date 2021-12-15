/**
 * Leetcode - p0007_reverse_integer
 */
package com.abc.leetcode.p0007_reverse_integer;
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
    public int reverse(int x) {
        long num = 0;
        while (x != 0) {
            int low = x % 10;
            num = num * 10 + low;
            x = x / 10;
        }
        if (num < Integer.MIN_VALUE || num > Integer.MAX_VALUE)
            return 0;
        else
            return (int) num;
    }

}
