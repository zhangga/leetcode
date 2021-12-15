/**
 * Leetcode - p0191_number_of_1_bits
 */
package com.abc.leetcode.p0191_number_of_1_bits;
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
    public int hammingWeight(int n) {
        int count = 0;
        // 负数当成正数处理
        if (n < 0) {
            count++;
            n = n & 0x7fffffff;
        }
        for (int i = 1; i < 32; i++) {
            int m = (n >>> i) << i;
            if (m != n) {
                count++;
            }
            n = m;
        }
        return count;
    }

}
