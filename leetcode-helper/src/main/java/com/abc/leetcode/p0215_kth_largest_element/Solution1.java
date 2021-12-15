/**
 * Leetcode - p0215_kth_largest_element
 */
package com.abc.leetcode.p0215_kth_largest_element;
import java.util.*;
import com.ciaoshen.leetcode.util.*;

/** 
 * 排序
 */
class Solution1 implements Solution {

    @Override
    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        return nums[nums.length - k];
    }

}
