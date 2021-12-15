/**
 * Leetcode - p0053_maximum_subarray
 */
package com.abc.leetcode.p0053_maximum_subarray;
import java.util.*;
import com.ciaoshen.leetcode.util.*;

/** 
 * 最大子序和
 * 递归实现
 * 首先遍历累加，若累加到第k个数时和小于0，则可将列表一分为二（前k个和k之后）分别找最大连续子数组。累加的时候已找到前一半的子数组最大和，后一半递归。
 */
class Solution1 implements Solution {

    @Override
    public int maxSubArray(int[] nums) {
        return maxSubArray(nums, 0);
    }

    private int maxSubArray(int[] nums, int start) {
        int sum = 0;
        int max = nums[start];
        for (int i = start; i < nums.length; i++) {
            sum += nums[i];
            // 如果前i项连续和小于0，则后面可以再单独算，因为后面+前面小于0的一定小于后面单独计算。
           if (sum < 0 && i != nums.length - 1) {
                return Math.max(max, maxSubArray(nums, i+1));
            }
            max = Math.max(max, sum);
        }
        return max;
    }

}
