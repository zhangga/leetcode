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
class Solution1 implements Solution {

    @Override
    public int[] productExceptSelf(int[] nums) {
        int[] res = new int[nums.length];
        int k = 1;
        for (int i = 0; i < nums.length; i++) {
            res[i] = k;
            k *= nums[i]; // 此时数组存储的是除去当前元素左边元素的乘积
        }
        k = 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            res[i] *= k; // k为该数右边的乘积
            k *= nums[i]; // 此时数组等于左边的 * 右边的
        }
        return res;
    }

}
