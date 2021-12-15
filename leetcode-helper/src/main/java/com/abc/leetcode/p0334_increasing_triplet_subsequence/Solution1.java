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
class Solution1 implements Solution {

    @Override
    public boolean increasingTriplet(int[] nums) {
        int i = 0;
        int small = Integer.MAX_VALUE;
        int big = Integer.MAX_VALUE;
        while (i < nums.length) {
            if (nums[i] < small) {
                small = nums[i];
            }
            else if (nums[i] > small && nums[i] <= big) {
                big = nums[i];
            }
            else if (nums[i] > big) {
                return true;
            }
            i++;
        }
        return false;
    }

}
