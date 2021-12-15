/**
 * Leetcode - p0204_count_primes
 */
package com.abc.leetcode.p0204_count_primes;
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
    public int countPrimes(int n) {
        if (n < 2)
            return 0;
        boolean prime[] = new boolean[n+1];
        int sqrt = (int) Math.ceil(Math.sqrt(n));
        for (int i = 2; i <= sqrt; ++i) {
            if (!prime[i]) {
                for (int p = i*i; p <= n; p+=i) {
                    prime[p] = true;
                }
            }
        }
        int count = 0;
        for (int i = 2; i < n; i++) {
            if (!prime[i])
                count++;
        }
        return count;
    }

}
