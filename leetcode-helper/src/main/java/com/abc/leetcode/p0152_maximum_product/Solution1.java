/**
 * Leetcode - p0152_maximum_product
 */
package com.abc.leetcode.p0152_maximum_product;
import java.util.*;
import com.ciaoshen.leetcode.util.*;

/** 
 * 动态规划
 */
class Solution1 implements Solution {

    @Override
    public int maxProduct(int[] nums) {
        int product = nums[0];
        int max = product;
        int min = product;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < 0) {
                int tmp = max;
                max = min;
                min = tmp;
            }
            max = Math.max(max * nums[i], nums[i]);
            min = Math.min(min * nums[i], nums[i]);
            product = Math.max(max, product);
        }
        return product;
    }

}
