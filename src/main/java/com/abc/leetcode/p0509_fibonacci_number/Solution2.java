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
class Solution2 implements Solution {

    @Override
    public int fib(int N) {
        if (N < 2)
            return N;
        int n1 = 0, n2 = 1, fib = 0;
        for (int i = 2; i <= N; i++) {
            fib = n1 + n2;
            n1 = n2;
            n2 = fib;
        }
        return fib;
    }

}
