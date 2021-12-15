/**
 * Leetcode - p0280_wiggle_sort
 */
package com.abc.leetcode.p0280_wiggle_sort;
import java.util.*;
import com.ciaoshen.leetcode.util.*;

/** 
 * 摆动排序
 */
class Solution1 implements Solution {

    @Override
    public void wiggleSort(int[] nums) {
        if (nums == null || nums.length < 2)
            return;

        // 排序
        Arrays.sort(nums);
        int temp = 0;
        for (int i = 1; i < nums.length-1; i+=2) {
            temp = nums[i];
            nums[i] = nums[i+1];
            nums[i+1] = temp;
        }
    }

}
