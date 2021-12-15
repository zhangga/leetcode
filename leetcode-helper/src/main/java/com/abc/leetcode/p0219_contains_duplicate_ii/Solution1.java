/**
 * Leetcode - p0219_contains_duplicate_ii
 */
package com.abc.leetcode.p0219_contains_duplicate_ii;
import java.util.*;
import com.ciaoshen.leetcode.util.*;

/** 
 * 线性搜索
 */
class Solution1 implements Solution {

    @Override
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int i = 0;
        while (i < nums.length) {
            int num = nums[i];
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] == num) {
                    if (j - i <= k) {
                        return true;
                    }
                }
            }
            i++;
        }
        return false;
    }

}
