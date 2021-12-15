/**
 * Leetcode - p0220_contains_duplicate_iii
 */
package com.abc.leetcode.p0220_contains_duplicate_iii;
import java.util.*;
import com.ciaoshen.leetcode.util.*;

/** 
 * 二叉树搜索
 */
class Solution2 implements Solution {

    @Override
    public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
        TreeSet<Integer> tree = new TreeSet<>();
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            Integer s = tree.ceiling(num);
            if (s != null && (long)s - num <= t)
                return true;
            Integer g = tree.floor(num);
            if (g != null && num - (long)g <= t)
                return true;

            tree.add(num);
            if (tree.size() > k) {
                tree.remove(nums[i - k]);
            }
        }
        return false;
    }

}
