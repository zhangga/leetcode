/**
 * Leetcode - p0011_container_with_most_water
 */
package com.abc.leetcode.p0011_container_with_most_water;
import java.util.*;
import com.ciaoshen.leetcode.util.*;

/** 
 * 动态规划
 */
class Solution1 implements Solution {

    @Override
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int maxArea = 0;
        while (left < right) {
            maxArea = Math.max(maxArea, Math.min(height[left], height[right]) * (right - left));
            // 每次较小的指针向中间移（如果移动较大的，容积只减不增。木桶原理）
            if (height[left] <= height[right])
                left++;
            else
                right--;
        }
        return maxArea;
    }

}
