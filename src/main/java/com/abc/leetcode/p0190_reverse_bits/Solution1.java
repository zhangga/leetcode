/**
 * Leetcode - p0190_reverse_bits
 */
package com.abc.leetcode.p0190_reverse_bits;
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
    public int reverseBits(int n) {
        int result = 0;
        for (int i = 0; i < 32; i++) {
            int b = (n & (1 << i)) >>> i;
            System.out.print(b + " ");
            result |= (b << (31 - i));
        }
        return result;
    }

}
