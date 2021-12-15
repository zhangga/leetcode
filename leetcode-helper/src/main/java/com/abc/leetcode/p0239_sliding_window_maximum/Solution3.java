package com.abc.leetcode.p0239_sliding_window_maximum;

/**
 * 动态规划
 * Created by U-Demon
 * Date: 2019/9/16
 */
public class Solution3 implements Solution {

    @Override
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        if (n * k == 0) {
            return new int[0];
        }
        if (k == 1) {
            return nums;
        }

        // 分块
        int[] left = new int[n];
        left[0] = nums[0];
        int[] right = new int[n];
        right[n-1] = nums[n-1];
        for (int i = 1; i < n; i++) {
            // 从左到右
            if (i % k == 0) {
                // 块儿的开始
                left[i] = nums[i];
            }
            else {
                left[i] = Math.max(left[i-1], nums[i]);
            }

            // 从右到左
            int j = n - 1 - i;
            if ((j+1) % k == 0) {
                // 块儿的开始
                right[j] = nums[j];
            }
            else {
                right[j] = Math.max(right[j+1], nums[j]);
            }
        }

        int[] output = new int[n-k+1];
        for (int i = 0; i < n-k+1; i++) {
            output[i] = Math.max(left[i+k-1], right[i]);
        }
        return output;
    }

}
