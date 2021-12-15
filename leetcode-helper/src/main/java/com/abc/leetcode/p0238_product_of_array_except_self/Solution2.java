/**
 * Leetcode - p0238_product_of_array_except_self
 */
package com.abc.leetcode.p0238_product_of_array_except_self;
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
    public int[] productExceptSelf(int[] nums) {
        int[] res = new int[nums.length];
        for (int i = 0; i < res.length; i++) {
            res[i] = 1;
        }

        int left = 1;
        int right = 1;
        for (int i = 0; i < nums.length; i++) {
            res[i] *= left;
            left *= nums[i];

            res[nums.length - 1 - i] *= right;
            right *= nums[nums.length - 1 - i];
        }
        return res;
    }

}
