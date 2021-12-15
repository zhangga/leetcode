/**
 * Leetcode - p0283_move_zeroes
 */
package com.abc.leetcode.p0283_move_zeroes;
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
class Solution1 {

    public int[] moveZeroes(int[] nums) {
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                if (index != i) {
                    nums[index] = nums[i];
                    nums[i] = 0;
                }
                index++;
            }
        }
        return nums;
    }

}
