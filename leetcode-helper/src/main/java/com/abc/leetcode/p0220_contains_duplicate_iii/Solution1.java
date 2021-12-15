/**
 * Leetcode - p0220_contains_duplicate_iii
 */
package com.abc.leetcode.p0220_contains_duplicate_iii;
import java.util.*;
import com.ciaoshen.leetcode.util.*;

/** 
 * 线性搜索
 */
class Solution1 implements Solution {

    @Override
    public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
        int i = 0;
        while (i < nums.length) {
            long num = nums[i];
            for (int j = i + 1; j < nums.length; j++) {
                if (Math.abs(nums[j] - num) <= t && j - i <= k) {
                    return true;
                }
            }
            i++;
        }
        return false;
    }

}
