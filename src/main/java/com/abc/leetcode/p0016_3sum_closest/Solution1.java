/**
 * Leetcode - p0016_3sum_closest
 */
package com.abc.leetcode.p0016_3sum_closest;
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
    public int threeSumClosest(int[] nums, int target) {
        // 排序
        Arrays.sort(nums);
        int ret = nums[0] + nums[1] + nums[2];
        int mid, right, sum;
        for (int left = 0; left < nums.length; left++) {
            mid = left + 1;
            right = nums.length - 1;
            while (mid < right) {
                sum = nums[left] + nums[mid] + nums[right];
                if (sum == target)
                    return sum;
                if (Math.abs(sum - target) < Math.abs(ret - target))
                    ret = sum;
                if (sum < target)
                    mid++;
                else
                    right--;
            }
        }
        return ret;
    }

}
