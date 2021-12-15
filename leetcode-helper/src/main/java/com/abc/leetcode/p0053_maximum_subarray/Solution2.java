/**
 * Leetcode - p0053_maximum_subarray
 */
package com.abc.leetcode.p0053_maximum_subarray;
import java.util.*;
import com.ciaoshen.leetcode.util.*;

/** 
 * 最大子序和
 * 动态规划
 * 定义一个函数 f(n) ，表示以第n个数为结束点的子数列的最大和，则存在递推关系 f(n) = max(f(n-1) + A[n], A[n]) 。
 * 时间上与递归差不多，占用内存小于递归。
 */
class Solution2 implements Solution {

    @Override
    public int maxSubArray(int[] nums) {
        int sum = nums[0];
        int max = sum;
        for (int i = 1; i < nums.length; i++) {
            // 如果第i项比前面i项之和都大，从i开始重新计算和
            sum = Math.max(sum + nums[i], nums[i]);
            // 所有子序和里最大的
            max = Math.max(max, sum);
        }
        return max;
    }

}
