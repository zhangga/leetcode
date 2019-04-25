/**
 * Leetcode - permutations_46
 */
package com.abc.leetcode.permutations_46;
import java.util.*;
import com.ciaoshen.leetcode.util.*;

/** 
 * log instance is defined in Solution interface
 * this is how slf4j will work in this class:
 * =============================================
 *     if (log.isDebugEnabled()) {
 *         log.debug("a + b = {}", sum);
 *     }
 * =============================================
 */
class Solution1 implements Solution {

    @Override
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        perm(result, nums, 0, nums.length - 1);
        return result;
    }

    private void perm(List<List<Integer>> result, int[] nums, int start, int end) {
        if (start == end) {
            List<Integer> list = new ArrayList<>(nums.length);
            for (int num : nums) {
                list.add(num);
            }
            result.add(list);
        }
        else {
            for (int i = start; i <= end; i++) {
                swap(nums, i, start);
                perm(result, nums, start+1, end);
                swap(nums, i, start);
            }
        }
    }

    private void swap(int[] nums, int m, int n) {
        if (m == n)
            return;
        int temp = nums[m];
        nums[m] = nums[n];
        nums[n] = temp;
    }

}
