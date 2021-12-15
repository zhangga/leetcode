/**
 * Leetcode - p0509_fibonacci_number
 */
package com.abc.leetcode.p0509_fibonacci_number;
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
    public int fib(int N) {
        if (N < 2)
            return N;
        return fib(N-1) + fib(N-2);
    }

}
