/**
 * Leetcode - p0035_search_insert_position
 */
package com.abc.leetcode.p0035_search_insert_position;
import java.util.*;
import com.ciaoshen.leetcode.util.*;

/** 
 * 二分查找
 */
class Solution1 implements Solution {

    @Override
    public int searchInsert(int[] nums, int target) {
        if(nums[nums.length-1]<target) return nums.length;
        if(nums[0]>target) return 0;

        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            int mid = left + (right - left) / 2;
            int midNum = nums[mid];

            if (midNum == target)
                return mid;
            else if (mid == left)
                return right;
            else if (midNum < target)
                left = mid;
            else if (midNum > target)
                right = mid;
        }
        return left;
    }
}
