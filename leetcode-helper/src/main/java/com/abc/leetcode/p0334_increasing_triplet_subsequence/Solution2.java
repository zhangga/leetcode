/**
 * Leetcode - p0334_increasing_triplet_subsequence
 */
package com.abc.leetcode.p0334_increasing_triplet_subsequence;
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

    public boolean increasingTriplet(int[] nums) {
        int one = Integer.MAX_VALUE;
        int two = Integer.MAX_VALUE;

        for (int n : nums) {
            if (n <= one) {
                one = n;
            } else if (n <= two) {
                two = n;
            } else {
                return true;
            }
        }

        return false;
    }

}
